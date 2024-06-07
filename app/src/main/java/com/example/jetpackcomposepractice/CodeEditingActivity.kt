package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class CodeEditingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                MyTextArea3()
            }
        }
    }
}

@Composable
fun MyTextArea1() {
    Column() {
        Text(
            text = "안녕",
            fontSize = 100.sp,
            color = Color.Red
        )
        Text(
            text = "나는",
            fontSize = 100.sp,
            color = Color.Gray
        )
        Text(
            text = "누구야",
            fontSize = 100.sp,
            color = Color.Green
        )
    }
}

@Composable
fun MyTextArea2() {
    Column() {
        MyTextFormat1(text = "안녕", fontSize = 100.sp, color = Color.Red)
        MyTextFormat1(text = "나는", fontSize = 100.sp, color = Color.Gray)
        MyTextFormat1(text = "누구야", fontSize = 100.sp, color = Color.Green)
    }
}

@Composable
fun MyTextArea3() {
    MyTextFormat2 {
        Text(
            text = "안녕",
            fontSize = 100.sp,
            color = Color.Red
        )
    }
}

@Composable
fun MyTextFormat2(content: @Composable () -> Unit) {
    Column() {
        content()
        content()
        content()
        content()
        content()
    }
}

@Composable
fun MyTextFormat1(text: String, fontSize: TextUnit, color: Color) {
    Text(
        text = text,
        fontSize = fontSize,
        color = color
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview16() {
    JetpackComposePracticeTheme {
        MyTextArea3()
    }
}