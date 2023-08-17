package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(color = Color(0xffd2e8d4)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            CardUser()
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            CardContacts()
        }
    }
}

@Composable
fun CardUser(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = image,
                modifier = modifier.height(120.dp).width(150.dp).background(color = Color(0xff073042)),
                contentDescription = null
            )
            Text(
                text = stringResource(R.string.jennifer_doe),
                fontSize = 42.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
            )
            Text(
                text = stringResource(R.string.jen_doe_description),
                color = Color(0xff006d3b),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
        }
}

@Composable
fun CardContacts(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier.padding(20.dp),
        ) {
            Row {
                Icon(Icons.Rounded.Call, tint = Color(0xff006d3b), contentDescription = "Call Icon")
                Spacer(Modifier.width(20.dp))
                Text(
                    text = stringResource(R.string.jen_doe_phone),
                    modifier = modifier.padding(bottom = 20.dp),
                )
            }
            Row {
                Icon(Icons.Rounded.Share, tint = Color(0xff006d3b), contentDescription = "Share Icon")
                Spacer(Modifier.width(20.dp))
                Text(
                    text = stringResource(R.string.jen_doe_username),
                    modifier = modifier.padding(bottom = 20.dp),
                )
            }
            Row {
                Icon(Icons.Rounded.Email, tint = Color(0xff006d3b), contentDescription = "Email Icon")
                Spacer(Modifier.width(20.dp))
                Text(
                    text = stringResource(R.string.jen_doe_email),
                )
            }
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Card()
    }
}