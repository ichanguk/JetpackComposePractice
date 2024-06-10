package com.example.jetpackcomposepractice

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ProgressBar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class ComposeAndXMLActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeAndXMLTest("Android")
                }
            }
        }
    }
}

@Composable
fun ComposeAndXMLTest(name: String, modifier: Modifier = Modifier) {
    val progressValue = remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AndroidView(
            factory = { context ->
                val view =
                    LayoutInflater.from(context).inflate(R.layout.compoase_and_xml, null, false)

                view
            },
            update = {view ->
                val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
                progressBar.progress = progressValue.value
            },
            modifier = Modifier.fillMaxWidth()
        )

        Button(onClick = {
            progressValue.value += 10
        }) {
            Text(text = "UP")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview34() {
    JetpackComposePracticeTheme {
        ComposeAndXMLTest("Android")
    }
}