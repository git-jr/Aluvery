package com.paradoxo.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.paradoxo.aluvery.ui.screens.HomeScreen
import com.paradoxo.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()

        }
    }
}

@Composable
fun App() {
    AluveryTheme {
        Surface {
            HomeScreen()
        }
    }
}



