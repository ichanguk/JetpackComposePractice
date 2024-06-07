package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class LazyRowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                MyLazyRow()
            }
        }
    }
}

@Composable
fun MyLazyRow() {
    val textList = mutableListOf<String>()
    for (i in 1..4) {
        for (j in 0..'Z' - 'A') {
            textList.add(('A' + j).toString())
        }
    }
    LazyRow {
        items(textList) { item ->
            Text(
                text = item,
                fontSize = 100.sp,
                modifier = Modifier.clickable {
                    println("Clicked item : $item")
                })

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview14() {
    JetpackComposePracticeTheme {
        MyLazyRow()
    }
}