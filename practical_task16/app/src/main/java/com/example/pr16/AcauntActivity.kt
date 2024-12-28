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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr16.ui.theme.PR16Theme


class AcauntActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PR16Theme {
                AcLay()
            }
        }
    }
}
@Composable
fun AcLay(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.glavniy),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column( modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.meditac),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 0.dp, y = 120.dp)
                    .width(350.dp)
                    .size(200.dp)
                    .clickable(onClick = {val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)} )
            )
            Image(
                painter = painterResource(id = R.drawable.hert),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 0.dp, y = 130.dp)
                    .width(350.dp)
                    .size(200.dp)
                    .clickable(onClick = {val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)} )
            )
        }
        Column( modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {

            Image(
                painter = painterResource(id = R.drawable.profileglavn),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 150.dp, y = 20.dp)
                    .width(55.dp)
                    .size(50.dp)
                    .clickable(onClick = {val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)} )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingThreePreview() {
    PR16Theme {
        AcLay()
    }
}