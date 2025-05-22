package ar.edu.ort.simulacroparcialtp3.screens

sealed class Screens(val screen: String){
    data object Welcome: Screens("welcome")
    data object Home: Screens("home")
    data object CoffeeDetail: Screens("coffeeDetail")
}