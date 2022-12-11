package com.example.bgsteam.navigation

sealed class Screens(val route: String) {
    object Login: Screens("login")
    object Home: Screens("home_screen")
}
