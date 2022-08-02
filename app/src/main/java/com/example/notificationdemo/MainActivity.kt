package com.example.notificationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.notificationdemo.screen.MainScreen
import com.example.notificationdemo.ui.theme.NotificationDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationDemoTheme {
                MainScreen()
            }
        }
    }
}