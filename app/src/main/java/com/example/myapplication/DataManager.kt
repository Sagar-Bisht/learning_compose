package com.example.myapplication

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.myapplication.model.Quote
import com.google.gson.Gson

object DataManager {

    var data = emptyList<Quote>()
    var isDataLoaded  = mutableStateOf(false)

    fun loadDataFromAsset(context: Context) {
        val inputStream = context.assets.open("dummy_json.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java).toList()
        isDataLoaded.value  = true
    }
}