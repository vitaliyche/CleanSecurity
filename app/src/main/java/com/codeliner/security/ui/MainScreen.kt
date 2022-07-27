package com.codeliner.security.ui

import android.widget.ProgressBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.codeliner.security.R

@Preview(showBackground = true)
@Composable
fun MainScreen() {

    Column() {

        Text(text = "Device Health: 40%")

        Image(
            contentDescription = "progress bar",
            painter = painterResource(R.drawable.ic_circle),

        )


    }
}