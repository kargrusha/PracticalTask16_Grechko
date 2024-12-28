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

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PR16Theme {
                ProfLay()
            }
        }
    }
}

@Composable
fun ProfLay(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.akk),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.pojar),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = -100.dp, y = 100.dp)
                    .width(180.dp)
                    .size(120.dp)
                    .clickable(onClick = {
                        val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)
                    })
            )
            Image(
                painter = painterResource(id = R.drawable.zacat),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = -100.dp, y = 120.dp)
                    .width(180.dp)
                    .size(120.dp)
                    .clickable(onClick = {
                        val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)
                    })
            )

        }
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.rectangle5),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 100.dp, y = 100.dp)
                    .width(180.dp)
                    .size(120.dp)
                    .clickable(onClick = {
                        val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)
                    })
            )
            Image(
                painter = painterResource(id = R.drawable.ectangle4),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 100.dp, y = 120.dp)
                    .width(180.dp)
                    .size(120.dp)
                    .clickable(onClick = {
                        val intent = Intent(context, LoginActivity::class.java)
                        context.startActivity(intent)
                    })
            )
        }
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.pluss),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 0.dp, y = 320.dp)
                    .width(180.dp)
                    .size(120.dp)
                    .clickable(onClick = {
                            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
                            context.startActivity(intent)
                    })

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingFourPreview() {
    PR16Theme {
        ProfLay()
    }
}