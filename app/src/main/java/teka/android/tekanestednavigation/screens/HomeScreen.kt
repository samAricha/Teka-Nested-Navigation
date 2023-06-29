package teka.android.tekanestednavigation.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import teka.android.tekanestednavigation.ui.theme.TekaNestedNavigationTheme

@Composable
fun HomeScreen(){
    Greeting(name = "Teka Devs - this is home screen")
}




@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TekaNestedNavigationTheme {
        Greeting("Android")
    }
}