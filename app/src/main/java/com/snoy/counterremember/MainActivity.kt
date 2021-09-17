package com.snoy.counterremember

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.snoy.counterremember.counter.CounterScreen
import com.snoy.counterremember.ui.theme.CounterRememberTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterRememberTheme {
                Surface(color = MaterialTheme.colors.background) {
                    CounterScreen()
                }
            }
        }
    }
}