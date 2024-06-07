package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                MyImageTest2()
            }
        }
    }
}

@Composable
fun MyImageTest1() {
    Image(
        painter = painterResource(id = R.drawable.bok),
        contentDescription = "bok"
    )
}

@Composable
fun MyImageTest2() {
    AsyncImage(
        model = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzEyMDFfMTgw%2FMDAxNzAxNDEwMzUxOTk5.DLIy7FxB-MrUGiC4ZAi9D-N1JsrEUoJy_hywE9ZyfD0g.tjpy3dSJ5wQpFFGvTZEyczcWfe0GOA4gdX85rnPn_hMg.PNG.joohehe5959%2Fimage.png&type=a340",
        contentDescription = "춘식이 사진",
        modifier = Modifier.fillMaxSize()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    JetpackComposePracticeTheme {
        MyImageTest2()
    }
}