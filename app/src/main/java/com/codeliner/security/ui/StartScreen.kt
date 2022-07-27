package com.codeliner.security.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codeliner.security.ScreenRoute


@Composable
fun StartScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "We will help you \n with your first cleaning",
            color = Color.White,
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "85%",
                    fontSize = 48.sp,
                    color = Color.LightGray,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "Used space",
                    color = Color.LightGray
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "8 GB",
                    fontSize = 48.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "Free space",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        } // Row


        Box(
            modifier = Modifier
                // TODO: реализовать переход на новый экран при нажатии Start
                .clickable {
                    navController.navigate(ScreenRoute.SplashScreen.route)
                }
                .size(200.dp)
                .background(Color.Cyan, shape = CircleShape),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Start",
                fontSize = 48.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )
        }
    } // Column
}