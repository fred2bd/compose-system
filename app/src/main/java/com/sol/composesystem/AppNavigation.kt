package com.sol.composesystem

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") { Screen1(navController) }
        composable("screen2") { Screen2(navController) }
        composable("screen3") { Screen3(navController) }

        composable(
            "screen4/{data}"
        ) { backStackEntry ->
            val userId=backStackEntry.arguments?.getString("data")?:""
            Screen4(navController, userId)
        }



        composable(
            "screen5/{data}"
        ) { backStackEntry ->
            Screen5(backStackEntry.arguments?.getString("data") ?: "")
        }

    }
}