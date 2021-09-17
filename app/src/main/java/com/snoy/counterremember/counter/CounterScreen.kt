package com.snoy.counterremember.counter

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.snoy.counterremember.ui.theme.CounterRememberTheme

@Composable
fun CounterScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Text(
                    "Counter Remember",
                    modifier = Modifier
                        .padding(10.dp),
                    color = MaterialTheme.colors.onPrimary
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "You have clicked the button this many times:",
            )
            Text(
                text = "0",
                style = MaterialTheme.typography.h4,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CounterRememberTheme {
        Surface(color = MaterialTheme.colors.background) {
            CounterScreen()
        }
    }
}