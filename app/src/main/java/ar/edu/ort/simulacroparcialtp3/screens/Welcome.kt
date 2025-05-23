package ar.edu.ort.simulacroparcialtp3.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ar.edu.ort.simulacroparcialtp3.R
import ar.edu.ort.simulacroparcialtp3.ui.theme.Brown
import ar.edu.ort.simulacroparcialtp3.ui.theme.White

@Preview
@Composable
fun WelcomePreview(){
    val navController = rememberNavController()
    Welcome(navController)
}

@Composable
fun Welcome(
    navController: NavController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .offset(y = (-150).dp)
                .verticalScroll(rememberScrollState()),
            contentScale = ContentScale.Fit
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(400.dp))
            Text(
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, bottom = 20.dp),
                text = stringResource(R.string.welcome_title),
                style = TextStyle(
                    fontSize = 32.sp,
                    lineHeight = 48.sp,
                    fontFamily = FontFamily(Font(R.font.sora_regular)),
                    fontWeight = FontWeight.W600,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.16.sp,
                )
            )
            Text(
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, bottom = 20.dp),
                text = stringResource(R.string.welcome_subtitle),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 21.sp,
                    fontFamily = FontFamily(Font(R.font.sora_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFA2A2A2),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.14.sp,
                )
            )
            //TODO Reemplazar por componente
            Button(
                onClick = { navController.navigate(Screens.Home.screen) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .padding(bottom = 8.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Brown),
                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 16.dp)
            ) {
                Text(
                    text = stringResource(R.string.welcome_button_text),
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily(Font(R.font.sora_regular)),
                        fontWeight = FontWeight(600),
                        color = White,
                    )
                )
            }
        }
    }
}
