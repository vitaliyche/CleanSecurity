package com.codeliner.security

sealed class ScreenRoute(val route: String) {

    object StartScreen: ScreenRoute("start_screen")
    object SplashScreen: ScreenRoute("splash_screen")
    object MainScreen: ScreenRoute("main_screen")
    object CleanScreen: ScreenRoute("clean_screen")

}
