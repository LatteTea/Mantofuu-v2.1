package com.example.bgsteam.composable

import androidx.compose.runtime.Composable
import android.os.Bundle
import android.text.TextUtils
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bgsteam.R
import com.example.bgsteam.ui.theme.BGSTeamTheme


@Composable
fun FormLogin(){
    var mail by remember {
        mutableStateOf("")
    }
    var pw by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .background(Color.White)
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
            fontWeight = FontWeight.Normal,
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
            Text(text = "Belum Punya Akun?")
        }

    }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(id = R.drawable.ic_circle_bottom),
            contentDescription = stringResource(id = R.string.app_name ),
            modifier = Modifier.size(1200.dp) .padding(top = 710.dp)
        )
    }
}

data class LoginUiState(
    val email: String = "",
    val password: String = ""
)

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BGSTeamTheme {
        FormLogin()
    }
}