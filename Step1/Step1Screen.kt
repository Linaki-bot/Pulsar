package com.example.pulsar.ui.theme.screens.Step1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pulsar.R
import com.example.pulsar.navigation.ROUT_ACCOUNTS
import com.example.pulsar.navigation.ROUT_ACCOUNTS2
import com.example.pulsar.navigation.ROUT_PRODUCTS

@Composable
fun Step1Screen(navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Image(
            painter = painterResource(id = R.drawable.img_16),
            contentDescription = "home",
            modifier = Modifier
                .size(350.dp)
                .clip(shape = RectangleShape),
            contentScale = ContentScale.Crop

        )






        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { navController.navigate(ROUT_ACCOUNTS2) },

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Login", color = Color.Black)

        }

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = { navController.navigate(ROUT_ACCOUNTS) },

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "SignUp", color = Color.Black)

        }




    }
}
@Composable
@Preview(showBackground = true)
fun Step1ScreenPreview(){
    Step1Screen(rememberNavController())
}