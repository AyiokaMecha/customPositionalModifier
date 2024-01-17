package com.androidpractice.layoutmodifier.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ColorBox(modifier: Modifier) {
    Box(modifier = Modifier.padding(1.dp)
        .size(width = 50.dp, height = 10.dp).then(modifier))
}