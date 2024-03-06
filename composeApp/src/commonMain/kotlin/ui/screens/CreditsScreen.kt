@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.generic_back_button
import cyoaenginekmm.composeapp.generated.resources.matt_schafer
import cyoaenginekmm.composeapp.generated.resources.rocket
import cyoaenginekmm.composeapp.generated.resources.spacefield_a_000
import cyoaenginekmm.composeapp.generated.resources.tim_karagosian
import cyoaenginekmm.composeapp.generated.resources.titlescreen_credits_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_main_title
import cyoaenginekmm.composeapp.generated.resources.titlescreen_start_game_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_sub_title
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.components.CreditsScreenComponent
import ui.components.CreditsScreenEvent
import ui.components.TitleScreenEvent

@Composable
fun CreditsScreen(component: CreditsScreenComponent) {
    Box (

        modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(Res.drawable.spacefield_a_000),
            contentScale = ContentScale.FillBounds
        )
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                text = "Credits",
                modifier = Modifier.padding(top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                text = "Made By",
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.tim_karagosian),
                modifier = Modifier.padding(10.dp, bottom = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                text = "Story By",
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.tim_karagosian),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.matt_schafer),
                modifier = Modifier.padding(10.dp, bottom = 25.dp)
            )
            Button(
                onClick = {
                    component.onEvent(CreditsScreenEvent.ClickBackToTitleScreenButton)
                },
                modifier = Modifier.padding(5.dp)
            ){
                Text(text = stringResource(Res.string.generic_back_button))
            }
        }
    }
}