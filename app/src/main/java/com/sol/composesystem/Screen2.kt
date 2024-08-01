package com.sol.composesystem


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen2(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("This is Screen 2")
        Button(onClick = {
            navController.navigate("screen3") {
                // This will remove Screen 2 from the stack
                popUpTo("screen2") { inclusive = true }
            }
        }) {
            Text("Go to Screen 3")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewScreen2() {
    val navController = rememberNavController()
    Screen2(navController)
}


