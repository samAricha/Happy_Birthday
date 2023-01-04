package teka.mobile.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import teka.mobile.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithText(message = "Happy Birthday Aricha", from = "from Samson")

                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from:String){
    Column{
        Text(text = message, fontSize = 36.sp)
        Text(text = from, fontSize = 24.sp)
    }

}

@Preview(showBackground = true, name = "hii people")
@Composable
fun BirthdayGreetingWithTextPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Aricha", from = "from Samson")
    }
}