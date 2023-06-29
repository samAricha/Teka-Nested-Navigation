package teka.android.tekanestednavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import teka.android.tekanestednavigation.navigation.RootNavGraph
import teka.android.tekanestednavigation.ui.theme.TekaNestedNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var navController: NavHostController
        super.onCreate(savedInstanceState)
        setContent {
            TekaNestedNavigationTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    navController = rememberNavController()
                    EntryScreen(navHostController = navController)
                }
            }
        }
    }
}

