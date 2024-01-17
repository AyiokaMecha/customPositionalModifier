package com.androidpractice.layoutmodifier.ui.components

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import kotlin.math.roundToInt

fun Modifier.customLayout(
    fraction: Float
) = layout { measurable, constraints ->
    val placeable = measurable.measure(constraints)
    val x = -(placeable.width * fraction).roundToInt()
//    val y = -(placeable.height * fraction).roundToInt()
    layout(placeable.width, placeable.height) {
        placeable.placeRelative(x, 0)
    }
}