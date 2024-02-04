package com.androidpractice.layoutmodifier.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColorBox(modifier: Modifier) {
    Box(modifier = Modifier
        .padding(1.dp)
        .size(width = 50.dp, height = 10.dp)
        .then(modifier))
}

@Composable
fun BoxPractice() {
    Box(modifier = Modifier
        .size(399.dp)
        .background(Color.Red)
        .clip(RoundedCornerShape(30.dp))
    ) {
        TextCell(text = "1", modifier = Modifier
            .align(Alignment.Center)
            .size(width = 200.dp, height = 200.dp))
        TextCell(text = "2", modifier = Modifier.align(Alignment.TopStart))
        TextCell(text = "3", modifier = Modifier.align(Alignment.BottomEnd))
    }

}

@Composable

fun TextCell(text: String, modifier: Modifier = Modifier, fontSize: Int
= 150 ) {
    val cellModifier = Modifier
        .padding(12.dp)
        .border(width = 5.dp, color = Color.Black)
    Surface {
        Text(
            text = text, cellModifier.then(modifier),
            fontSize = fontSize.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White
        )
    }

}



@Preview(showSystemUi = true, showBackground = true)

@Composable

fun BoxPreview() {
    BoxPractice()
}