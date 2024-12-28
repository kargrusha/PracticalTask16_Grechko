package com.example.pr16

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.pr16.ui.theme.PR16Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PR16Theme {
                NachLay()
            }
        }
    }
}

@Composable
fun NachLay() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fonzahod),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 600.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.voytivakk),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 0.dp, y = -80.dp)
                    .width(260.dp)
                    .size(50.dp)
                    .clickable(onClick = {val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)} )


            )

            Text(
                text = "Еще не зарегестрированны?",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .offset(x= 0.dp,y=-75.dp)
                    .clickable(onClick = {
                        val intent = Intent(context, RegActivity::class.java)
                        context.startActivity(intent)})


            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PR16Theme {
        NachLay()
    }
}
