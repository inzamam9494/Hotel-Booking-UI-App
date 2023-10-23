package com.example.mytest.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.AccessTime
import androidx.compose.material.icons.outlined.CatchingPokemon
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun BookScreen(
    modifier: Modifier,
    onBackClick: () -> Unit
) {

    Box {
        Image(
            painter = painterResource(id = R.drawable.pandawa),
            contentDescription = "beach",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1000.dp)
        )

        Column {
            Row(modifier = Modifier.padding(20.dp)) {

                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Default.ArrowBackIos,
                        contentDescription = "Arrow",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.weight(0.1f))

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favorite",
                    tint = Color.White
                )
            }

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
                Column {
                    Text(text = "")
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(
                            text = "Pandawa Beach",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.headlineSmall,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.weight(0.1f))
                        Text(
                            text = "$48",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.headlineMedium,
                            textAlign = TextAlign.Center
                        )
                        Text(text = "/person")
                    }
                    Row() {
                        Spacer(modifier = Modifier.padding(5.dp))
                        Icon(
                            imageVector = Icons.Outlined.LocationOn,
                            contentDescription = ""
                        )
                        Text(text = "Bali, Indonesia")
                    }
                    Row {
                        CardTextIcon(text1 = "3 Days", text2 = "4.5 Rating", text3 = "win Guide")
                    }

                    Column {
                        Row(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = "Description",
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.titleLarge,
                                color = Blue40
                            )
                        }
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(text = "Pandawa Beach (or Pandava Beach) is a hidden beach in Bali. It's located on the island's southern Bukit Peninsula, about 8 km south of the BTDC complex in Nusa Dua. The beach is hidden behind large limestone cliffs that reveal wide views of the Indian Ocean.")
                        }
                    }

                    Box(
                        modifier = Modifier
                            .background(
                                brush = Brush.verticalGradient(
                                    0f to Color.Transparent,
                                    0.1f to Color.White
                                )
                            )
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Blue40),
                            modifier = Modifier
                                .height(80.dp)
                                .padding(10.dp)
                        ) {
                            Text(
                                text = "Book Now",
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
}


@Composable
fun CardTextIcon(
    text1: String,
    text2: String,
    text3: String
) {

    Row() {
        Card(modifier = Modifier.padding(10.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(5.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.AccessTime,
                    contentDescription = "clock"
                )
                Text(
                    text = text1,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }

        Card(modifier = Modifier.padding(10.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(5.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.StarOutline,
                    contentDescription = "clock"
                )
                Text(
                    text = text2,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }

        Card(modifier = Modifier.padding(10.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(5.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.CatchingPokemon,
                    contentDescription = "clock"
                )
                Text(
                    text = text3,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookScreenPreview() {
    MaterialTheme {
        BookScreen(modifier = Modifier, onBackClick = {})
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun BookScreenPreview() {
//    MaterialTheme {
//        CardTextIcon( "3 days", "4.5 star", "Win Guide")
//    }
//}