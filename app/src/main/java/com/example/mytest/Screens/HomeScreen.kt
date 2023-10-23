package com.example.mytest.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
    Box {
        Image(
            painter = painterResource(id = R.drawable.beach1),
            contentDescription = "beach",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1000.dp)
        )

        Column() {

            Spacer(modifier = Modifier.weight(0.1f))

                Box(
                    modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                0f to Color.Transparent,
                                0.1f to Color.White
                            )
                        )
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TextCenterAlign(text = "")
                        TextCenterAlign(text = "Explore Various")
                        TextCenterAlign(text = "Natural Beauty of")
                        TextCenterAlign(text = "Indonesia")

                        Text(
                            text = "You can visit anywhere easily" +
                                    "order your ticket now to get lot of promos",
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(20.dp)
                        )

                        Button(
                            onClick = onClick,
                            colors = ButtonDefaults.buttonColors(Blue40),
                            modifier = Modifier
                                .height(80.dp)
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
    }
}


@Composable
fun TextCenterAlign(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.headlineMedium,
        textAlign = TextAlign.Center
    )
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen(modifier = Modifier, onClick = {})
    }
}