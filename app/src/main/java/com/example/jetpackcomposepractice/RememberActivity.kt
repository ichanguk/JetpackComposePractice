package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class RememberActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                SimpleCounterBtn()
            }
        }
    }
}

@Composable
fun SimpleCounterBtn() {
    var count by remember { mutableStateOf(0) }

    Button(onClick = {
        count++
    },
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Count : $count",
            fontSize = 50.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetpackComposePracticeTheme {
        SimpleCounterBtn()
    }
}