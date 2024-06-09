package com.example.jetpackcomposepractice.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

@Composable
fun Graph1() {
    Box(modifier = Modifier.padding(top = 120.dp)) {
        Graph1Gauge(percent = 70f, maxPercent = 100f)
    }
}

@Composable
fun Graph1Gauge(percent: Float, maxPercent: Float) {
    // 360도 중에 70% 값을 채워줌
    val colorPercent = 360 * (percent / maxPercent)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f) // 세로 비율 가로와 같게
            .padding(20.dp)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawArc(
                color = Color.LightGray,
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(32f)
            )
            drawArc(
                color = Color.Blue,
                startAngle = -90f,
                sweepAngle = colorPercent,
                useCenter = false,
                style = Stroke(32f)
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "${((percent / maxPercent) * 100).toInt()}%",
                fontSize = 35.sp
            )
            Text(
                text = "$percent / $maxPercent",
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Graph1Preview() {
    JetpackComposePracticeTheme {
        Graph1()
    }
}