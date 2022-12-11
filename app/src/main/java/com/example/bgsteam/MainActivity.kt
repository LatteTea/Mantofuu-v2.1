package com.example.bgsteam

import android.os.Bundle
import android.support.customtabs.IPostMessageService.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.bgsteam.composable.FormLogin
import com.example.bgsteam.ui.HomeScreen
import com.example.bgsteam.ui.theme.BGSTeamTheme
import java.text.Normalizer.Form

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BGSTeamTheme {
                // BGSTeamLogin()
                Home()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home() {
    HomeScreen()
}

//@Composable
//fun BGSTeamLogin(){
//    FormLogin()
//}

@Preview
@Composable
fun DefaultPreview() {
//    BGSTeamLogin()
    Home()
}
