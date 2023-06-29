package teka.android.tekanestednavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import teka.android.tekanestednavigation.navigation.RootNavGraph
import teka.android.tekanestednavigation.navigation.Screen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun EntryScreen( navHostController: NavHostController){

    Scaffold(
        topBar = {
            TopAppBar(backgroundColor = MaterialTheme.colors.primary,
                title = {
                    Text(
                        text = "Teka Devs Project",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                })
        },

        bottomBar = {
            BottomNavigation {
                val navController = navHostController
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                BottomNavigationItem(
                    selected = currentRoute == Screen.Home.route,
                    onClick = {
                        navController.navigate(Screen.Home.route) {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.home),
                            contentDescription = "Home"
                        )
                    },
                    label = {
                        Text(text = "Home")
                    }
                )

                BottomNavigationItem(
                    selected = currentRoute == Screen.DashboardScreen.route,
                    onClick = {
                        navController.navigate(Screen.DashboardScreen.route) {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.monitoring),
                            contentDescription = "Dashboard"
                        )
                    },
                    label = {
                        Text(text = "Dashboard")
                    }
                )

                BottomNavigationItem(
                    selected = currentRoute?.startsWith(Screen.Login.route) == true,
                    onClick = {
                        navHostController.navigate(route = Screen.Login.route)
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.add_to_list),
                            contentDescription = "Login"
                        )
                    },
                    label = {
                        Text(text = "Login")
                    }
                )
            }
        }

    ) {

        RootNavGraph(navController = navHostController)



    }

}
