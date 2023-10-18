package com.example.pam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam.ui.theme.PAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()

                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "WEATHER APP",
            fontSize = 40.sp)
        BoxHeader()

        Spacer(modifier = Modifier.padding(10.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(10.dp))

        Keterangan()


    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.bgt),
                contentDescription = "",
                modifier = Modifier.size(150.dp))
            Text(
                text = "Rain",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}
@Composable
fun Lokasi(){
    Text(
        text = "19 C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )
    Row(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "", modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)

    }
    Spacer(modifier = Modifier.padding(5.dp))
    Text(text = "Kasihan, Kabupaten Bantul,\n Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray)
}
@Composable
fun Keterangan() {
    Box(
        Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Cyan)
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Humidity",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier,
                )
                Text(
                    text = "98%",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = "Sunrise",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier,
                )
                Text(
                    text = "05.00 AM",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(){
                Text(
                    text = "UV Index",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier,
                )
                Text(
                    text = "9 / 10",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = "Sunset",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier,
                )
                Text(
                    text = "05.40 PM",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    PAMTheme {
        Home()
    }
}