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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.rocket
import cyoaenginekmm.composeapp.generated.resources.spacefield_a_000
import cyoaenginekmm.composeapp.generated.resources.titlescreen_credits_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_main_title
import cyoaenginekmm.composeapp.generated.resources.titlescreen_start_game_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_sub_title
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.components.ScreenAEvent
import ui.components.TitleScreenComponent
import ui.components.TitleScreenEvent

@Composable
fun TitleScreen(component: TitleScreenComponent) {
    Box (modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(Res.drawable.spacefield_a_000),
            contentScale = ContentScale.FillBounds
        )
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
            ){
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                text = stringResource( Res.string.titlescreen_main_title),
                modifier = Modifier.padding(top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                text = stringResource( Res.string.titlescreen_sub_title),
                modifier = Modifier.padding(10.dp, bottom = 25.dp)
            )
            Image(
                modifier = Modifier.padding(25.dp),
                painter = painterResource(Res.drawable.rocket),
                contentDescription = null
            )
            Button(
                onClick = {
                    component.onEvent(TitleScreenEvent.ClickStartGameButton)
                },
                modifier = Modifier.padding(5.dp)
            ){
                Text(text = stringResource(Res.string.titlescreen_start_game_button))
            }
            Button(
                onClick = {
                    component.onEvent(TitleScreenEvent.ClickCreditsButton)
                },
                modifier = Modifier.padding(5.dp)
            ){
                Text(text = stringResource(Res.string.titlescreen_credits_button))
            }
        }
    }
}