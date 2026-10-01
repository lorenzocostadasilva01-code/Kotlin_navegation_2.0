package com.example.navegation_20

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun AbaHome(){

    var contador by remember { mutableStateOf(0) }

    Column() {
        Text("Home - $contador")
        Button(onClick = { contador++ }) {
            Text("ADD")
        }
    }
}
@Composable
fun AbaPerfil(){
    Text("PERFIL")
}