package com.example.jetpackcomposepractice

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class ComposeToXMLActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeToXMLTest("Android")
                }
            }
        }
    }
}

@Composable
fun ComposeToXMLTest(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        modifier = modifier.clickable {
            val intent = Intent(context, HappyActivity::class.java)
            context.startActivity(intent)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview32() {
    JetpackComposePracticeTheme {
        ComposeToXMLTest("Android")
    }
}