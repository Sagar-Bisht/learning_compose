package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.myapplication.screens.QuoteList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        DataManager.loadDataFromAsset(this)
        setContent {
            App()
        }
    }

    @Composable
    fun App() {
        if(DataManager.isDataLoaded.value){
            QuoteList(DataManager.data){

            }
        }
    }
}

