package teka.android.tekanestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import teka.android.tekanestednavigation.screens.DashboardScreen
import teka.android.tekanestednavigation.screens.HomeScreen
import teka.android.tekanestednavigation.screens.SettingsScreen


@Composable
fun MainNavGraph(navHostController: NavHostController,
    startDestination: String
) {
//    val navController = rememberNavController()

    NavHost(navController = navHostController,
        startDestination = Screen.Home.route,
        route = MAIN_GRAPH_ROUTE
    ) {

        composable(route = Screen.DashboardScreen.route) {
            DashboardScreen()
        }

        composable(route = Screen.Home.route) {
            HomeScreen()
        }

        composable(route = Screen.Settings.route) {
            SettingsScreen()
        }
    }

}