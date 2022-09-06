package com.paradoxo.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.paradoxo.aluvery.ui.theme.AluveryTheme


@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column() {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row() {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box() {
        Text(text = "Texto 1")
        Text(text = "Texto 2")

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .fillMaxWidth()
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(
            modifier = Modifier
                .padding(8.dp, 16.dp)
                .background(Color.Green)
                .fillMaxWidth(1F)
        ) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            modifier = Modifier
                .padding(8.dp, 16.dp)
                .background(Color.Red)

        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp, 16.dp)
                    .background(Color.Cyan)
                    .fillMaxWidth()
            ) {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column(
                modifier = Modifier
                    .padding(8.dp, 16.dp)
                    .background(Color.Yellow)
            ) {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }

        }
    }
}

@Composable
fun MyFirstCompose() {
    Text("Um textos")
    Text("Dois textos")
}

@Preview
@Composable
fun MyFirstComposePreview() {
    AluveryTheme() {
        Surface() {
            MyFirstCompose()
        }
    }
}