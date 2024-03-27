@file:OptIn(ExperimentalResourceApi::class)

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
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_images_by
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_made_by
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_matt_schafer
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_music_by
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_sfx_by
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_story_by
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_tim_karagosian
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_title
import cyoaenginekmm.composeapp.generated.resources.creditsscreen_unknown_person
import cyoaenginekmm.composeapp.generated.resources.generic_back_button_text
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.components.ViewModels.CreditsScreenComponent
import ui.components.CreditsScreenEvent

@OptIn(ExperimentalResourceApi::class)
@Composable
fun CreditsScreen(component: CreditsScreenComponent) {
    Box (
        modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(Res.drawable.backgroundSpace_011),
            contentScale = ContentScale.FillBounds
        )
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ){
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                text = stringResource(Res.string.creditsscreen_title),
                modifier = Modifier.padding(top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp, top = 25.dp),
                text = stringResource(Res.string.creditsscreen_made_by),
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_tim_karagosian),
                modifier = Modifier.padding(10.dp)
            )

            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.creditsscreen_story_by),
                modifier = Modifier.padding(10.dp, top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_tim_karagosian),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_matt_schafer),
                modifier = Modifier.padding(10.dp)
            )

            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.creditsscreen_images_by),
                modifier = Modifier.padding(10.dp, top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.creditsscreen_music_by),
                modifier = Modifier.padding(10.dp, top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.creditsscreen_sfx_by),
                modifier = Modifier.padding(10.dp, top = 25.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                text = stringResource(Res.string.creditsscreen_unknown_person),
                modifier = Modifier.padding(10.dp)
            )
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            Button(
                onClick = {
                    component.onEvent(CreditsScreenEvent.ClickBackToTitleScreenButton)
                },
                modifier = Modifier.padding(5.dp)
            ){
                Text(text = stringResource(Res.string.generic_back_button_text))
            }
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}