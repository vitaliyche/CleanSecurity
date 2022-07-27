package com.codeliner.security

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.codeliner.security.ui.*

@Composable
fun NavigationComponent() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenRoute.StartScreen.route
    ) {

        composable(route = ScreenRoute.StartScreen.route) {
            StartScreen(navController = navController)
        }

        composable(route = ScreenRoute.SplashScreen.route) {
            SplashScreen()
        }

        composable(route = ScreenRoute.MainScreen.route) {
            MainScreen()
        }
    }

}