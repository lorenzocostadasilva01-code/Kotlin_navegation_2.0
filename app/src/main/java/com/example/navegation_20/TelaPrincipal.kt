package com.example.navegation_20

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun TelaPrincipal() {
    val navInterno = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navController = navInterno) }
    ) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navInterno,
            startDestination = "home"
        ) {
            composable("home") { AbaHome() }
            composable("perfil") { AbaPerfil() }
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController) {


    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = { navController.navigate("home")},
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
            },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = true,
            onClick = { navController.navigate("perfil")},
            icon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Perfil")
            },
            label = { Text("Perfil") }
        )
    }
}