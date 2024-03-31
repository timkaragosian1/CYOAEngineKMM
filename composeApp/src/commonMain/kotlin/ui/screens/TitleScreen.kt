@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.open_screen_bkg1
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.components.TitleScreen.TitleScreenButtons
import ui.components.TitleScreen.TitleScreenComponent
import ui.components.TitleScreen.TitleScreenTitleText

@Composable
fun TitleScreen(component: TitleScreenComponent) {
    Box (modifier = Modifier
        .fillMaxSize()
        .paint(painter = painterResource(Res.drawable.open_screen_bkg1),
            contentScale = ContentScale.FillBounds
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            TitleScreenTitleText()
            Spacer(modifier = Modifier.fillMaxHeight(.8f))
            TitleScreenButtons(component)
        }
    }
}