package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class ShowHideActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                MyShowHideEx2()
            }
        }
    }
}

// 버튼을 클릭하면 새로운 버튼이 나오는 것
@Composable
fun MyShowHideEx1() {
    var isButtonVisible by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                isButtonVisible = !isButtonVisible
            }
        ) {
            if (isButtonVisible) {
                Text(
                    text = "숨기기",
                    fontSize = 50.sp
                )
            } else {
                Text(
                    text = "보이기",
                    fontSize = 50.sp
                )
            }
        }

        if (isButtonVisible) {
            Button(onClick = { /*TODO*/ }) {
                Text(
                    text = "짠짠짠",
                    fontSize = 50.sp
                )
            }
        }
    }
}

@Composable
fun MyShowHideEx2() {
    var switchState by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.padding(20.dp)
    ) {
        Switch(
            checked = switchState,
            onCheckedChange = {checked ->
                switchState = checked
            }
        )

        Text(
            text = if (switchState) "ON" else "OFF",
            fontSize = 100.sp
        )

        if (switchState) {
            Button(onClick = { /*TODO*/ }) {
                Text(
                    text = "얍얍",
                    fontSize = 50.sp
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview17() {
    JetpackComposePracticeTheme {
        MyShowHideEx2()
    }
}