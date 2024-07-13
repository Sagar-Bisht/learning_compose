package com.example.myapplication.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.myapplication.model.Quote

@Composable
fun QuoteList(data: List<Quote>, onClick: () -> Unit) {
    LazyColumn {
        items(data) {
            QuoteListItem(quote = it, onClick = {
                onClick()
            }
            )
        }
    }
}