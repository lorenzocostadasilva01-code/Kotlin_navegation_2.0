package com.example.navegation_20

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MeuViewModel: ViewModel(){
     var contador by mutableStateOf(0)
         private set


    fun add(){
        contador ++
    }


}