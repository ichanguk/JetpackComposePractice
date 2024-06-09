package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme
import com.example.jetpackcomposepractice.ui.theme.TypographyFontTest

class FontActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                FontTest()
            }
        }
    }
}

@Composable
fun FontTest() {
    Column() {
        Spacer(modifier = Modifier.padding(top = 50.dp))
        Text(
            text = "폰트1",
            style = TypographyFontTest.bodyLarge
        )
        Text(
            text = "폰트2",
            style = TypographyFontTest.titleLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview27() {
    JetpackComposePracticeTheme {
        FontTest()
    }
}