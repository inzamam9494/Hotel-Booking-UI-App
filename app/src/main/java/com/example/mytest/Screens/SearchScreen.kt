package com.example.mytest.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytest.R
import com.example.mytest.ui.theme.Purple40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    modifier: Modifier,
    onCardClick: (Int) -> Unit
) {

    Scaffold(bottomBar = {
        BottomAppBar {
            Row {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = ""
                )
            }
        }
    }) {
        Column(modifier = Modifier.padding(it)) {

        }
    }

    Column {

        Row {
            Column {
                Text(text = "Hi, Broodeen!")
                Text(text = "Where are You")
            }
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "bell icon"
            )
        }

        OutlinedTextField(value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            },
            label = { Text(text = "Search Your Location") })

        Row() {
            ScrollCard(text = "All")
            ScrollCard(text = "Beach")
            ScrollCard(text = "Mountain")
            ScrollCard(text = "Hotel")
            ScrollCard(text = "Restaurant")
        }

        Row {
            Text(text = "Popular Beach")
            Spacer(modifier = Modifier.weight(0.1f))
            Text(text = "See All")
        }

        ImageCard(
            image = R.drawable.pandawa,
            modifier = Modifier,
            onClickToRegister = onCardClick
        )

    }
}

@Composable
fun ImageCard(
    image: Int,
    onClickToRegister: (Int) -> Unit,
    modifier: Modifier
) {
    Card {
        Box {
            Image(
                painter = painterResource(id = image),
                contentDescription = "image"
            )
            Icon(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "heart"
            )
        }
        ClickableText(
            text = AnnotatedString("Pandawa Beach"),
            onClick = onClickToRegister,
            style = TextStyle(
                color = Purple40
            )
        )

    }
}

@Composable
fun ScrollCard(text: String) {
    Card {
        Text(text = text)
    }
}

@Preview(showSystemUi = true)
@Composable
fun SecondScreenPreview() {
    MaterialTheme {
        SearchScreen(modifier = Modifier, onCardClick = {})
    }
}