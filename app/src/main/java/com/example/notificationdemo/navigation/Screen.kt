package com.example.notificationdemo.navigation

sealed class Screen(val route: String) {
    object Main : Screen(route = "main")
    object Details : Screen(route = "details/{$MY_ARG}") {
        fun passArgument(message: String) = "details/$message"
    }
}