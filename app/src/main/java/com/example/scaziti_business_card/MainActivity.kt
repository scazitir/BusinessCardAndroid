package com.example.scaziti_business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scaziti_business_card.ui.theme.Scaziti_Business_CardTheme
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaziti_Business_CardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight(),
                    color = Color.LightGray
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    val backgroundProfilePicture = Color(0xFF181E3C)
    val occupationTextColor = Color(0xFF559936)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Profile part
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(100.dp)
                    .background(backgroundProfilePicture)
                    .align(CenterHorizontally)
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                text = "Raphael Scaziti",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 32.sp
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(
                text = "Software Developer",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(CenterHorizontally),
                color = occupationTextColor,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth() // Fill the maximum width for better layout
                .padding(18.dp)
        ) {

            // Row for email
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .align(CenterHorizontally)
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "raphaelscaziti@gmail.com", style = MaterialTheme.typography.bodyMedium)
            }

            // Row for phone
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .align(CenterHorizontally)
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "+1 (587) 123 4567", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Preview
@Composable
fun PreviewBusinessCard() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        color = Color.LightGray
    ){
        BusinessCardApp()
    }

}