package com.krunal.feeds4u.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.krunal.feeds4u.model.FeedResponse
import com.krunal.feeds4u.repository.FeedRepository
import com.krunal.feeds4u.ui.navigation.NavigationManager
import com.krunal.feeds4u.utils.Resource
import com.krunal.feeds4u.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    private val navigationManager: NavigationManager,
    private val feedRepository: FeedRepository
) : ViewModel() {

    private val _feedUiState: MutableStateFlow<FeedUiState> = MutableStateFlow(FeedUiState(status = Status.LOADING))
    val uiState: StateFlow<FeedUiState>
        get() = _feedUiState

    init {
        refreshFeed()
    }


    // Fetch leatest feeds and update Ui State accordingly
    fun refreshFeed() {

        // Set Ui State to loading till we get the feed
        _feedUiState.update {
            it.copy(status = Status.LOADING)
        }

        viewModelScope.launch {
            val result = feedRepository.getBreakingNews()
            val response = handleFeedResponse(result)

            _feedUiState.update {

                when (response) {
                    is Resource.Success -> it.copy(status = Status.SUCCESS, feeds = response.data)
                    is Resource.Error -> it.copy(status = Status.ERROR, error = response.message)
                    else -> it.copy(status = Status.LOADING)
                }
            }

        }
    }

    private fun handleFeedResponse(response: Response<FeedResponse>): Resource<FeedResponse> {
        if (response.isSuccessful) {
            response.body()?.let { feedResponse ->
                return Resource.Success(data = feedResponse)
            }
        }

        return Resource.Error(message = "ErrorMsg:${response.message()} \nBody: ${response.body()}")
    }
}