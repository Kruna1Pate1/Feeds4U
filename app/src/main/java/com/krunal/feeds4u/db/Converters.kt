package com.krunal.feeds4u.db

import androidx.room.TypeConverter
import com.krunal.feeds4u.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}