package teka.android.tekanestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import teka.android.tekanestednavigation.screens.DashboardScreen
import teka.android.tekanestednavigation.screens.HomeScreen
import teka.android.tekanestednavigation.screens.LoginScreen

@Composable
fun RootNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController,
        startDestination = Screen.DashboardScreen.route ){

        composable(route = Screen.DashboardScreen.route){
            DashboardScreen()
        }

        composable(route = Screen.Home.route){
            HomeScreen()
        }

        composable(route = Screen.Login.route){
            LoginScreen()
        }

    }
}