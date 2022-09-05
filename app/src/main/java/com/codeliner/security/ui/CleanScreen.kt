package com.codeliner.security.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codeliner.security.R
import com.codeliner.security.ScreenRoute

@Composable
fun CleanScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(16.dp)
    ) {

        Text(
            text = "Clean Memory",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )


        Box(
            modifier = Modifier.padding(top = 8.dp)
        ) {

            Divider(
                thickness = 6.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray, shape = RoundedCornerShape(12.dp))
            )

            Divider(
                thickness = 6.dp,
                modifier = Modifier
                    .fillMaxWidth(0.25f)
                    .background(Color.Yellow, shape = RoundedCornerShape(12.dp))
            )

        }

        Text(
            text = "While cleaning memory, Clean Security does not delete your personal data",
            fontSize = 15.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column() {
                Text(
                    text = "Cache Memory",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                    color = Color.White
                )

                Text(
                    text = "125 MB can be cleaned",
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.LightGray
                )

            }

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_forward),
                contentDescription = "forward"
            )

            Button(
                modifier = Modifier.padding(start = 8.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 10.dp),
                    text = "FIX",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

            }
        }

        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .background(Color.Gray)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column() {
                Text(
                    text = "Temporary Files",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                    color = Color.White
                )

                Text(
                    text = "50 MB can be cleaned",
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.LightGray
                )

            }

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_forward),
                contentDescription = "forward"
            )

            Button(
                modifier = Modifier.padding(start = 8.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 10.dp),
                    text = "FIX",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

            }
        }

        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .background(Color.Gray)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column() {
                Text(
                    text = "Residual Files",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                    color = Color.White
                )

                Text(
                    text = "123 MB can be cleaned",
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.LightGray
                )

            }

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_forward),
                contentDescription = "forward"
            )

            Button(
                modifier = Modifier.padding(start = 8.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 10.dp),
                    text = "FIX",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

            }
        }

        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .background(Color.Gray)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column() {
                Text(
                    text = "System Junk",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                    color = Color.White
                )

                Text(
                    text = "100 MB cleaned",
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.LightGray
                )

            }

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_forward),
                contentDescription = "forward"
            )

            Button(
                modifier = Modifier.padding(start = 8.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
                shape = RoundedCornerShape(10.dp)
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_ok),
                    contentDescription = "ok",
                    tint = Color.Green
                )

                Text(
                    text = "OK",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold),
                    color = Color.Green,
                    textAlign = TextAlign.Center
                )

            }
        }

        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .background(Color.Gray)
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = Modifier
                    .clickable {
                        /*navController.navigate(ScreenRoute.MainScreen.route)*/
                    }
                    .size(180.dp)
                    .background(Color.Cyan, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "CLEAN",
                    fontSize = 36.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CleanScreenPreview() {
    CleanScreen()
}