package teka.android.tekanestednavigation.navigation

const val ROOT_GRAPH_ROUTE = "root_graph_route"
const val AUTH_GRAPH_ROUTE = "auth_graph_route"
const val HOME_GRAPH_ROUTE = "home_graph_route"


sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object DashboardScreen: Screen(route = "dashboard_screen")
    object Login: Screen(route = "login_screen")

}