package com.example.navegation_20

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun TelaPrincipal() {
    val navInterno = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navInterno) }
    ) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navInterno,
            startDestination = RotasAbas.AbaHome
        ) {
            composable(RotasAbas.AbaHome) { AbaHome() }
            composable(RotasAbas.AbaPerfil) { AbaPerfil() }
        }
    }
}

@Composable
fun BottomNavBar(navInterno: NavHostController) {

    val backStackEntry by navInterno.currentBackStackEntryAsState()
    val rotaAtual = backStackEntry?.destination?.route


    NavigationBar {
        NavigationBarItem(
            selected = rotaAtual == RotasAbas.AbaHome,
            onClick = { navInterno.navigate(RotasAbas.AbaHome)},
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
            },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = rotaAtual == RotasAbas.AbaPerfil,
            onClick = { navInterno.navigate(RotasAbas.AbaPerfil)},
            icon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Perfil")
            },
            label = { Text("Perfil") }
        )
    }
}