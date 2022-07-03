package com.krunal.feeds4u.ui.home

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.krunal.feeds4u.utils.Status

@Composable
fun FeedScreen(
    viewModel: FeedViewModel
) {
    val state: FeedUiState by viewModel.uiState.collectAsState()

    when (state.status) {
        Status.LOADING -> {
            Log.d("FeedScreen", "FeedScreen: loading")
            CircularProgressIndicator(
                strokeWidth = 2.dp
            )
        }

        Status.ERROR -> {
            Log.d("FeedScreen", "Error: ${state.error}")
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Error: ${state.error}",
                    style = MaterialTheme.typography.h3,
                    color = MaterialTheme.colors.error
                )
            }
        }

        Status.SUCCESS -> {
            LazyColumn(
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                state.feeds?.let {
                    itemsIndexed(state.feeds!!.articles) { _, article ->
                        Column {
                            Text(text = "Title: ${article.title}")
                            Text(text = "Content: ${article.content}")
                            Divider(color = Color.LightGray)
                        }
                    }
                }
            }
        }
    }
}