package com.androidpractice.layoutmodifier.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RowColDemo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

        ) {
            TextCell(text = "1")
            TextCell(text = "2", modifier = Modifier.alignByBaseline().weight( 0.4f, fill = true))
            TextCell(text = "3")
        }

        Row {
            TextCell(text = "4")
            TextCell(text = "5")
            TextCell(text = "6")
        }

        Row {
            TextCell(text = "7")
            TextCell(text = "8")
            TextCell(text = "9")
        }
    }
//    Row {
//        Text(
//            text = "Large Text\nMore Text",
//            fontSize = 40.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = "Small Text",
//            modifier = Modifier.alignBy(FirstBaseline),
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//    }

}

@Composable
fun TextCell(text: String, modifier:Modifier = Modifier) {
    val cellModifier = Modifier
        .padding(4.dp)
        .size(100.dp, 100.dp)
        .border(width = 4.dp, color = Color.Black)
        .clip(RoundedCornerShape(4.dp))

    Text(text = text
        , cellModifier.then(modifier)
        , fontSize = 70.sp
        , fontWeight = FontWeight.Bold
        , textAlign = TextAlign.Center
    )
}


@Preview(showBackground = true, showSystemUi = true)

@Composable

fun RowColDemoPreview() {
    RowColDemo()
}