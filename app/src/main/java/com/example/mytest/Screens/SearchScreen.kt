package com.example.mytest.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytest.R
import com.example.mytest.ui.theme.Blue40
import com.example.mytest.ui.theme.PurpleGrey40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    modifier: Modifier,
    onCardClick: (Int) -> Unit
) {

    Scaffold(bottomBar = {
        BottomAppBar(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        0f to Color.Transparent,
                        0.2f to Color.White
                    )
                )
                .clip(RoundedCornerShape(topStartPercent = 30, topEndPercent = 30))
        ) {
            Row(modifier = Modifier.padding(10.dp)) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.weight(0.1f))
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.weight(0.1f))
                Icon(
                    imageVector = Icons.Outlined.Map,
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.weight(0.1f))
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = ""
                )
            }
        }
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .verticalScroll(rememberScrollState())
        ) {
            Column(modifier = Modifier) {
                Row(
                    modifier = Modifier.padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column() {
                        Text(text = "Hi, Broodeen!")
                        Text(
                            text = "Where are you going?",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.headlineSmall
                        )
                    }
                    Spacer(modifier = Modifier.weight(0.1f))
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(color = MaterialTheme.colorScheme.onPrimary),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Notifications,
                            contentDescription = "bell icon"
                        )
                    }

                }

                Row(modifier = Modifier.padding(20.dp)) {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text(text = "Search Your Location") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Search"
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            focusedIndicatorColor = Color.White,
                            unfocusedIndicatorColor = Color.White,
                            unfocusedLabelColor = Color.White,
                            containerColor = Color.White

                        ),
                        modifier = Modifier
                            .border(
                                BorderStroke(
                                    width = 1.dp,
                                    color = PurpleGrey40
                                ),
                                shape = RoundedCornerShape(20)
                            )
                            .weight(0.1f)
                    )
                }

                Row(
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                ) {
                    ScrollCard(text = "All")
                    ScrollCard(text = "Beach")
                    ScrollCard(text = "Mountain")
                    ScrollCard(text = "Hotel")
                    ScrollCard(text = "Restaurant")
                }

                Row(
                    modifier = Modifier.padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Popular Beach",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.weight(0.1f))
                    Text(
                        text = "See All",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleMedium,
                        color = Blue40
                    )
                }

                Column(modifier = Modifier.padding(5.dp)) {
                    Row() {
                        Column {
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.pandawa,
                                Height = 180.dp,
                                Widht = 180.dp,
                                text1 = "Pandawa Beach",
                                text2 = "Bali, Indonesia",
                                onClickToRegister = onCardClick
                            )
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.goa_beach,
                                Height = 250.dp,
                                Widht = 180.dp,
                                text1 = "Goa Beach",
                                text2 = "Goa,South India",
                                onClickToRegister = onCardClick
                            )
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.navagio,
                                Height = 250.dp,
                                Widht = 180.dp,
                                text1 = "Navagio",
                                text2 = " Zakynthos, Greece",
                                onClickToRegister = onCardClick
                            )
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.sanur_beach,
                                Height = 250.dp,
                                Widht = 180.dp,
                                text1 = "Sanur Beach",
                                text2 = "Bali, Indonesia",
                                onClickToRegister = onCardClick
                            )
                        }
                        Column {
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.colva_beach,
                                Height = 250.dp,
                                Widht = 180.dp,
                                text1 = "Colva Beach",
                                text2 = "South Gao, Margo",
                                onClickToRegister = onCardClick
                            )
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.siesta_beach,
                                Height = 250.dp,
                                Widht = 180.dp,
                                text1 = "Siesta Beach",
                                text2 = "Florida, United State",
                                onClickToRegister = onCardClick
                            )
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.palolem_beach,
                                Height = 250.dp,
                                Widht = 180.dp,
                                text1 = "Pandawa Beach",
                                text2 = "Canacona, Goa",
                                onClickToRegister = onCardClick
                            )
                            ImageBoxCard(
                                modifier = Modifier,
                                image = R.drawable.pandawa,
                                Height = 180.dp,
                                Widht = 180.dp,
                                text1 = "Pandawa Beach",
                                text2 = "Bali, Indonesia",
                                onClickToRegister = onCardClick
                            )
                        }
                    }
                }

            }
        }
    }

}

@Composable
fun ImageBoxCard(
    modifier: Modifier,
    image: Int,
    Height: Dp,
    Widht: Dp,
    text1: String,
    text2: String,
    onClickToRegister: (Int) -> Unit
) {
    Box {
        Box(
            modifier = Modifier
                .padding(5.dp)
                .height(Height)
                .width(Widht)
                .clip(shape = RoundedCornerShape(20.dp))

        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(1000.dp)
            )
            Row(modifier = Modifier.padding(20.dp)) {
                Spacer(modifier = Modifier.weight(0.1f))
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = "heart",
                    tint = Color.White,
                )
            }

            Box(
                modifier = Modifier.background(
                    brush = Brush.verticalGradient(
                        0.4f to Color.Transparent,
                        5f to Color.Black
                    )
                )
                    .fillMaxSize()
            ) {
                Column(modifier = Modifier.padding(15.dp)) {
                    Spacer(modifier = Modifier.weight(0.1f))
                    ClickableText(
                        text = AnnotatedString(text1),
                        onClick = onClickToRegister,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "map icon",
                            tint = Color.White
                        )
                        Text(text = text2,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color.White
                        )
                    }
                }
            }

        }
    }
}

@Composable
fun ScrollCard(text: String) {
    Card(modifier = Modifier.padding(10.dp)) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(12.dp)
        )


    }
}

@Preview(showSystemUi = true)
@Composable
fun SecondScreenPreview() {
    MaterialTheme {
        SearchScreen(modifier = Modifier, onCardClick = {})
    }
}