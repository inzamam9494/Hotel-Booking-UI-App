package com.example.mytest.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mytest.R
import com.example.mytest.ui.theme.Blue40

@Composable
fun HomeScreen(
    modifier: Modifier,
    onClick: () -> Unit
) {
    Column {

        Box(modifier = Modifier.size(450.dp)) {
            Image(
                painter = painterResource(id = R.drawable.beach1),
                contentDescription = "beach",
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Explore Various",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = "Natural Beauty of",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = "Indonesia",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium
                )
            }

            Text(
                text = "You can visit anywhere easily" +
                        "order your ticket now to get lot of promos"
            )

            Spacer(modifier = Modifier.weight(0.1f))


            Button(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(Blue40),
                modifier = Modifier
                    .weight(0.1f)
                    .height(50.dp)
                    .padding(10.dp)
            ) {
                Text(
                    text = "Get Started",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .weight(0.1f),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen(modifier = Modifier, onClick = {})
    }
}