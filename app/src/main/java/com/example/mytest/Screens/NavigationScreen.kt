package com.example.mytest.Screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class NavScreen{
    Home,
    Select,
    Book
}

@Composable
fun NavigationScreen(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
    ) {
    NavHost(navController = navController,
        startDestination = NavScreen.Home.name ){
        composable(NavScreen.Home.name){
            HomeScreen(modifier = Modifier,
                onClick = { navController.navigate(NavScreen.Select.name) })
        }
        composable(NavScreen.Select.name){
            SearchScreen(modifier = Modifier,
                onCardClick = { navController.navigate(NavScreen.Book.name) })
        }
        composable(NavScreen.Book.name){
            BookScreen(modifier = Modifier)
        }
    }
}