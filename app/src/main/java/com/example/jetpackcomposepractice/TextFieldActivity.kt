package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                MyTextField3()
            }
        }
    }
}

@Composable
fun MyTextField1() {
    var textState by remember {
        mutableStateOf("hello")
    }
    TextField(
        value = textState,
        onValueChange = {
            // textState = "이것은 변화"
            textState = it
        },
        label = {
            Text(text = "입력하는 공간")
        }
    )
}

@Composable
fun MyTextField2() {
    var textState by remember {
        mutableStateOf("hello")
    }
    OutlinedTextField(
        value = textState,
        onValueChange = {
            // textState = "이것은 변화"
            textState = it
        },
        label = {
            Text(text = "입력하는 공간")
        }
    )
}

/*
TextField에 뭔가 입력하고
버튼을 클릭하면
밑에 Text 부분에 입력한 값이 나오는 기능
 */

@Composable
fun MyTextField3() {
    // 입력한 부분
    var textState by remember {
        mutableStateOf("")
    }
    // 결과값 부분
    var enteredText by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center, // 세로로 중앙정렬
        horizontalAlignment = Alignment.CenterHorizontally // 가로로 중앙정렬
    ){
        TextField(
            value = textState,
            onValueChange = {
                textState = it
            }
        )
        Button(
            onClick = {
                enteredText = textState
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "입력하기")
        }

        Text(
            text = "결과값 텍스트 : $enteredText"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    JetpackComposePracticeTheme {
        MyTextField3()
    }
}