package com.joni.profile.components

import android.graphics.drawable.Icon
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.draw
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.withSave
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joni.profile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .height(170.dp)
            .fillMaxWidth()
            .paint(
                painter = painterResource(id = R.drawable.background),
                contentScale = ContentScale.FillBounds
            )
    ) {
    }
}

@Composable
fun ProfilePicture(modifier: Modifier = Modifier) {
    Image(painter= painterResource(R.drawable.profile),
        "", alignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .size(180.dp)
            .offset(y = -135.dp)
            .clip(CircleShape))


}

@Composable
fun ProfileDetaills(modifier: Modifier = Modifier) {
    Column {
        Text(
            "Melissa peters",
            modifier = modifier
                .fillMaxWidth()
                .offset(y = (-120).dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00b4d8),
            fontSize = 18.sp
        )
        Row(modifier
            .offset(y = (-110).dp)
            .align(Alignment.CenterHorizontally)) {
            Icon(Icons.Default.Phone, "")
            Text("-  9000000090")
        }
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun CardScreen(modifier: Modifier = Modifier.padding(8.dp)) {
    CardView(modifier, Icons.Default.AccountCircle, text = "Accounts")
    CardView(modifier, text = "Refer And Earn", icon = Icons.Default.AccountBox)
    CardView(modifier, text ="Setting", icon =Icons.Default.Settings)
    CardView(modifier, text = "Coupons", icon = Icons.Default.Email)
    CardView(modifier, text = "Terms and Conditions", icon = Icons.Default.Info)
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun CardView(modifier: Modifier = Modifier, icon: ImageVector, text: String) {
    Card(
        modifier = modifier
            .padding(horizontal = 8.dp)
            .fillMaxWidth()
            .height(50.dp)
            .offset(y = -90.dp),
        shape = ShapeDefaults.ExtraSmall,
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(
            contentColor = Color.Black,
            containerColor = Color.Gray,
            disabledContentColor = Color.Red,
            disabledContainerColor = Color.White
        ),
        border = BorderStroke(1.dp, color = Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(22.dp))
                Text(text, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier.size(24.dp) 
            )
        }
    }
}


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column {
        AppBar()
        ProfilePicture()
        ProfileDetaills()
        CardScreen()
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun AppBarPrev() {
    Column {
        AppBar()
        ProfilePicture()
        ProfileDetaills()
        CardScreen()
}}