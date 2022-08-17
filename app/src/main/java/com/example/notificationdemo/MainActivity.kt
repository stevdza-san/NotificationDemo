package com.example.notificationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.notificationdemo.navigation.SetupNavGraph
import com.example.notificationdemo.screen.MainScreen
import com.example.notificationdemo.ui.theme.NotificationDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationDemoTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }
}