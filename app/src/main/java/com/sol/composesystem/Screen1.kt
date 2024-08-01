package com.sol.composesystem

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen1(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ShowListOfItems()
        Spacer(modifier = Modifier.padding(bottom = 10.dp))
        Text(stringResource(id = R.string.total_value_is, 1, 0))
        Button(onClick = { navController.navigate("screen2") }) {
            Text("Go to Screen 2")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Screen1Preview() {
    val navController = rememberNavController()
    Screen1(navController = navController)
}

@Composable
fun ShowListOfItems() {
    val context = LocalContext.current

    val mutableList = mutableListOf("a", "b", "c")
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(mutableList) {

            Row {
                Text(text = it)
                Button(onClick = { Toast.makeText(context, it, Toast.LENGTH_SHORT).show() }) {

                }
            }


        }
    }


    LazyRow {
        items(mutableList) {
            Text(text = it)
        }
    }
}

