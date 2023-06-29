package teka.android.tekanestednavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import teka.android.tekanestednavigation.screens.LoginScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){

        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }

    }
}