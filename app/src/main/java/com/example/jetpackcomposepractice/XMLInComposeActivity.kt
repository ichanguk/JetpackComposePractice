package com.example.jetpackcomposepractice

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class XMLInComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(text = "여기는 Compose1", fontSize = 30.sp)

        AndroidView(factory = { context ->
            val view = LayoutInflater.from(context).inflate(R.layout.temp_xml, null, false)

            view.findViewById<TextView>(R.id.tempText).setOnClickListener {
                Toast.makeText(context, "이것은 토스트", Toast.LENGTH_LONG).show()
            }
            view
        })
        Text(text = "여기는 Compose2", fontSize = 30.sp)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview33() {
    JetpackComposePracticeTheme {
        Greeting2("Android")
    }
}