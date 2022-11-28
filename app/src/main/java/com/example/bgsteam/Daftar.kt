package com.example.bgsteam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bgsteam.ui.theme.BGSTeamTheme

class Daftar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BGSTeamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FormDaftar()
                }
            }
        }
    }
}

@Composable
fun FormDaftar(){
    var mail by remember {
        mutableStateOf("")
    }
    var pw by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Mantofuu",
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(
            text = "Silahkan Login",
            fontWeight = FontWeight.ExtraLight,
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 72.dp)
        )

        TextField(
            value = mail,
            onValueChange = { mail = it },
            label = { Text("E-Mail")},
            modifier = Modifier.padding(bottom = 40.dp)
        )

        TextField(
            value = pw,
            onValueChange = { pw = it },
            label = { Text("Password")},
            modifier = Modifier.padding(bottom = 5.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Text(
            text = "Lupa Password?",
            modifier = Modifier.padding(start = 150.dp, bottom = 40.dp)
        )

        Button(onClick = {}) {
            Text(text = "Login")
        }

        TextButton(onClick = { }) {
            Text(text = "Daftar")

        }

    }

}



@Preview(showBackground = true)
@Composable
fun fDaftar() {
    BGSTeamTheme {
        FormDaftar()
    }
}