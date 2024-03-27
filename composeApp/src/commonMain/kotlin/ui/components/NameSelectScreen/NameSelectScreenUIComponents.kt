@file:OptIn(ExperimentalResourceApi::class)

package ui.components.NameSelectScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_ceo_firstname
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_ceo_last_name
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_company_name
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_submit_button
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_subtitle_text
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_title_text
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import ui.Values.GameColors
import ui.Values.GameDimensions
import ui.Values.GameFontSizes
import ui.Values.GameShapes
import ui.components.ViewModels.NamesSelectScreenComponent

class NameSelectScreenUIComponents {
    val gameColors = GameColors()
    val gameShapes = GameShapes()
    val gameDimensions = GameDimensions()
    val gameFontSizes = GameFontSizes()
    @Composable
    fun NameSelectScreenTitleText() {
        val offset = Offset(4.0f, 4.0f)
        Text(
            modifier = Modifier
                .clip(shape = gameShapes.semiSmallRoundedRectangle)
                .background(gameColors.NamesScreenShadow)
                .padding(horizontal = gameDimensions.extraLarge),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            text = stringResource(Res.string.nameselectscreen_title_text),
            style = TextStyle(
                fontSize = 60.sp,
                shadow = Shadow(
                    color = Color.Black, offset = offset, blurRadius = 8f
                )
            )
        )
        Text(
            modifier = Modifier
                .clip(shape = gameShapes.semiSmallRoundedRectangle)
                .background(gameColors.NamesScreenShadow)
                .padding(horizontal = gameDimensions.large),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = gameFontSizes.large,
            text = stringResource(Res.string.nameselectscreen_subtitle_text),
            style = TextStyle(
                fontSize = 60.sp,
                shadow = Shadow(
                    color = Color.Black, offset = offset, blurRadius = 8f
                )
            )
        )
    }

    @Composable
    fun NameSelectScreenTextFieldAndButtons(
        component: NamesSelectScreenComponent,
        gameCEOFirstname:String,
        gameCEOLastname:String,
        gameCompanyName:String
    ) {

        TextField(
            value = gameCEOFirstname,
            onValueChange = {
                if (it.length <= 10) {
                    component.setCEOFirstname(it)
                }},
            label = { Text(stringResource(Res.string.nameselectscreen_ceo_firstname)) },
            textStyle = TextStyle.Default.copy(fontSize = gameFontSizes.normal),
            modifier = Modifier
                .clip(shape = gameShapes.barelyRoundedRectange)
                .background(gameColors.NamesButtonRed)
        )
        TextField(
            value = gameCEOLastname,
            onValueChange = {
                if (it.length <= 15) {
                    component.setCEOLastname(it)
                }},
            textStyle = TextStyle.Default.copy(fontSize = gameFontSizes.normalLarge),
            label = { Text(stringResource(Res.string.nameselectscreen_ceo_last_name)) },
            modifier = Modifier
                .clip(shape = gameShapes.barelyRoundedRectange)
                .background(gameColors.NamesButtonRed)
        )
        TextField(
            value = gameCompanyName,
            onValueChange = {
                if (it.length <= 20) {
                    component.setCompanyName(it)
                }},            textStyle = TextStyle.Default.copy(fontSize = gameFontSizes.large),
            label = { Text(stringResource(Res.string.nameselectscreen_company_name)) },
            modifier = Modifier
                .clip(shape = gameShapes.barelyRoundedRectange)
                .background(gameColors.NamesButtonRed)
        )
        Spacer(modifier = Modifier.fillMaxHeight(.15f))
        Button(
            onClick = {
                component.onEvent(NamesSelectScreenEvent.ClickSubmitNamesButton)
            },
            modifier = Modifier
                .fillMaxWidth(.5f)
                .fillMaxHeight(.7f),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = gameColors.GameButtonBlue
            )
        ) {
            Text(
                text = stringResource(Res.string.nameselectscreen_submit_button),
                textAlign = TextAlign.Center,
                fontSize = gameFontSizes.normalLarge,
                color = Color.White
            )
        }
    }
}