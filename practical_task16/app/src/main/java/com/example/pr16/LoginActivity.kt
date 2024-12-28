package com.example.pr16
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr16.ui.theme.PR16Theme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PR16Theme {
                LoginScreen()
            }
        }
    }
}
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val namelog = remember { mutableStateOf("") }
    val usernamelog = remember { mutableStateOf("") }
    val passwordlog = remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column( modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {

            OutlinedTextField(
                value = namelog.value,
                onValueChange = { namelog.value = it },
                label = { Text("Name") },
            )
            OutlinedTextField(
                value = usernamelog.value,
                onValueChange = { usernamelog.value = it },
                label = { Text("Login") }

            )
            OutlinedTextField(
                value = passwordlog.value,
                onValueChange = { passwordlog.value = it },
                label = { Text("Password") }
            )
            Image(
                painter = painterResource(id = R.drawable.voytivakk),
                contentDescription = null,
                modifier = Modifier
                    .clickable {}
                    .offset(x = 0.dp, y = 20.dp)
                    .width(260.dp)
                    .size(50.dp)
                    .clickable(onClick = {val intent = Intent(context, ProfileActivity::class.java)
                        context.startActivity(intent)} )


            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingTwoPreview() {
    PR16Theme {
        LoginScreen()
    }
}

