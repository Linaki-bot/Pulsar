package com.example.pulsar.ui.theme.screens.accounts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pulsar.R
import com.example.pulsar.data.AuthViewModel
import com.example.pulsar.navigation.ROUT_ACCOUNTS
import com.example.pulsar.navigation.ROUT_ACCOUNTS2
import com.example.pulsar.navigation.ROUT_LOGIN
import com.example.pulsar.navigation.ROUT_PRODUCTS
import com.example.pulsar.navigation.ROUT_SIGNUP


@Composable
fun AccountsScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.baseline_account_circle_24),
            contentDescription = "home",
            modifier = Modifier
                .size(200.dp),
        )

        Spacer(modifier = Modifier.width(40.dp))
        Text(
            text = "Welcome Back!",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
        )

        Spacer(modifier = Modifier.width(40.dp))

        Text(
            text = "Already have an account.Please enter your credentials",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.width(40.dp))

        var name by remember {mutableStateOf("")}
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember {mutableStateOf("")}

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = name ,
            onValueChange ={name = it},
            label = { Text(text = "Full name")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "",) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )



        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email Address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "",) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password ,
            onValueChange ={password= it},
            label = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "",) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = confpassword , onValueChange = { confpassword = it }, label = { Text(text = "Confirm Password") }, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp), leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


    }
}
@Composable
@Preview(showBackground = true)
fun AccountsScreenPreview(){
    AccountsScreen(rememberNavController() )

}