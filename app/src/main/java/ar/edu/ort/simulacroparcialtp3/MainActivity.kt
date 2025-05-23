package ar.edu.ort.simulacroparcialtp3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ar.edu.ort.simulacroparcialtp3.screens.CoffeeDetail
import ar.edu.ort.simulacroparcialtp3.screens.Home
import ar.edu.ort.simulacroparcialtp3.screens.Screens
import ar.edu.ort.simulacroparcialtp3.screens.Welcome
import ar.edu.ort.simulacroparcialtp3.ui.theme.SimulacroParcialTP3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimulacroParcialTP3Theme {
                val navController = rememberNavController()

                Scaffold { innerPadding ->
                    NavHost(
                        modifier = Modifier.padding(innerPadding),
                        navController = navController,
                        startDestination = Screens.Welcome.screen
                    ) {
                        composable(Screens.Welcome.screen) { Welcome(navController) }
                        composable(Screens.Home.screen) { Home(navController) }
                        composable(Screens.CoffeeDetail.screen) { CoffeeDetail(navController) }
                    }
                }
            }
        }
    }
}