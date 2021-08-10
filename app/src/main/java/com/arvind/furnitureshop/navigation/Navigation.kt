package com.arvind.furnitureshop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.furnitureshop.view.DashboardScreen
import com.arvind.furnitureshop.view.ProductDetailsScreen
import com.arvind.furnitureshop.view.ProductListScreen
import com.arvind.furnitureshop.view.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.DashboardScreen.route) {
            DashboardScreen()
        }
        composable(Screen.ProductListScreen.route) {
            ProductListScreen()
        }

        composable(Screen.ProductDetailScreen.route) {
            ProductDetailsScreen()
        }

    }
}