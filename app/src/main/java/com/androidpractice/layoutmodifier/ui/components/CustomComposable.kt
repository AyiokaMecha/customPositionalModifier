package com.androidpractice.layoutmodifier.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout


@Composable

fun DoNothingLayout(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(modifier = modifier,
        content = content) {measurables, constraints ->
        val placeables = measurables.map {measureable ->
            measureable.measure(constraints)
        }
        layout(constraints.maxWidth, constraints.maxHeight) {
            placeables.forEach { placeable ->
                placeable.placeRelative(x = 0, y = 0)

            }
        }
    }

}
