package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.backgroundSpace_011
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.components.GameOverStory.GameOverStoryComponent

@OptIn(ExperimentalResourceApi::class)
@Composable
fun GameOverStoryScreen(component: GameOverStoryComponent) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(Res.drawable.backgroundSpace_011),
                contentScale = ContentScale.FillBounds
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "User Actions",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            component.getUserActions()//SHOW USER ACTIONS AS TEST
            Spacer(
                modifier = Modifier
                    .padding(top = 25.dp)
            )
            Text(
                text = "Company & CEO Story",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            component.getCompanyCEOStory()
            Spacer(
                modifier = Modifier
                    .padding(top = 25.dp)
            )
            Button(
                onClick = { component.backToTitleScreen() }
            ){
                Text(
                    text = "Play Again"
                )
            }
        }
    }
}