@file:OptIn(ExperimentalResourceApi::class)

package ui.components.TitleScreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.titlescreen_credits_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_start_game_button
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import ui.components.ViewModels.TitleScreenComponent

@Composable
fun TitleScreenButtons(component: TitleScreenComponent) {
    Button(
        onClick = {
            component.onEvent(TitleScreenEvent.ClickStartGameButton)
        },
        modifier = Modifier
            .fillMaxWidth(.5f)
            .fillMaxHeight(.4f),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsv(244f,1f,.5f,.9f))
    ){
        Text(
            text = stringResource(Res.string.titlescreen_start_game_button),
            fontSize = 20.sp,
            color = Color.White
        )
    }
    Spacer(modifier = Modifier
        .fillMaxHeight(.05f))
    Button(
        onClick = {
            component.onEvent(TitleScreenEvent.ClickCreditsButton)
        },
        modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth(.35f)
            .fillMaxHeight(.65f),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsv(5f,1f,.5f,.9f))
    ){
        Text(
            text = stringResource(Res.string.titlescreen_credits_button),
            fontSize = 18.sp,
            color = Color.White
        )
    }
}