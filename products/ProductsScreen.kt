package com.example.pulsar.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pulsar.R
import com.example.pulsar.navigation.ROUT_ABOUT
import com.example.pulsar.navigation.ROUT_ACCOUNTS
import com.example.pulsar.navigation.ROUT_ACCOUNTS2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(navController: NavController) {

    Column(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {

        TopAppBar(
            title = { Text(text = "Pulsar", color = Color.Red, fontFamily = FontFamily.Cursive) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.White
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "notification",
                        tint = Color.White
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "More",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "More",
                        tint = Color.White
                    )
                }
                IconButton(
                    onClick = { navController.navigate(ROUT_ACCOUNTS)}
                ){
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Accounts",
                        tint = Color.White
                    )


                }
            }

        )
        Row(
            modifier = androidx.compose.ui.Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            //Card1

            Card() {

                Box(
                    modifier = androidx.compose.ui.Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "home",
                        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }

            //End of Card1


            Card() {

                Box(
                    modifier = androidx.compose.ui.Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = "home",
                        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }


        }
        Row {
            Card() {

                Box(
                    modifier = androidx.compose.ui.Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "home",
                        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            Card() {

                Box(
                    modifier = androidx.compose.ui.Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "home",
                        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }


        }
        Row {
            Card() {
                Box(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_9),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            Card() {
                Box(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }


            }
        Row {
            Card(){
                Box(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(painter = painterResource(id = R.drawable.img_12),
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                        )
                }
            }
            Card(){
                Box(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(painter = painterResource(id = R.drawable.img_15),
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }




        }


        }
    }



@Composable
@Preview(showBackground = true)
fun ProductsScreenPreview() {
    ProductsScreen(rememberNavController())
}
