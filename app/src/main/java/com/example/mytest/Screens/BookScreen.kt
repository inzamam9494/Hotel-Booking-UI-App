package com.example.mytest.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mytest.R
import com.example.mytest.ui.theme.Blue40

@Composable
fun BookScreen(modifier: Modifier) {
    Column {

        Row {
            Icon(imageVector = Icons.Default.ArrowBackIos,
                contentDescription = "Arrow")

            Spacer(modifier = Modifier.weight(0.1f))
            
            Icon(imageVector = Icons.Default.Favorite,
                contentDescription = "favorite")
        }

        Image(painter = painterResource(id = R.drawable.pandawa),
            contentDescription = "Wallpaper")

        Row {
            Text(text = "Pandawa Beach")
            Spacer(modifier = Modifier.weight(0.1f))
            Text(text = "$48/person")
        }
        Row {
            Icon(imageVector = Icons.Default.LocationOn,
                contentDescription = "")
            Text(text = "Bali, Indonesia")
        }

        Column {
            Text(text = "Description")
            Column {
                Text(text = "describing of detail hhjvghvghvghv hvvvvvvvhvvjhv")
            }
        }

        Spacer(modifier = Modifier.weight(0.1f))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Blue40),
            modifier = Modifier
                .weight(0.1f)
                .height(5.dp)
                .padding(10.dp)
        ) {
            Text(text = "Book Now",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .weight(0.1f),
                textAlign = TextAlign.Center)
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun BookScreenPreview() {
    MaterialTheme{
        BookScreen(modifier = Modifier)
    }
}