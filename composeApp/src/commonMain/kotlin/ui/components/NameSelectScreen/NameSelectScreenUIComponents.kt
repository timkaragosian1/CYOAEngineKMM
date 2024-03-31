@file:OptIn(ExperimentalResourceApi::class)

package ui.components.NameSelectScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
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
import cyoaenginekmm.composeapp.generated.resources.getRandomName
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_ceo_firstname
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_ceo_last_name
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_company_name
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_submit_button
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_subtitle_text
import cyoaenginekmm.composeapp.generated.resources.nameselectscreen_title_text
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import ui.values.GameColors
import ui.values.GameDimensions
import ui.values.GameFontSizes
import ui.values.GameShapes

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
                    color = Color.Black, offset = offset, blurRadius = 8.0f
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
                    color = Color.Black, offset = offset, blurRadius = 8.0f
                )
            )
        )
    }

    @Composable
    fun NameSelectScreenTextFieldAndButtons(
        component: NamesSelectScreenComponent,
        gameCEOFirstname:String,
        gameCEOLastname:String,
        gameCompanyName:String,
        isButtonEnabled: Boolean
    ) {
        getNamesScreenTextInputRow(
                hintValue = stringResource(Res.string.nameselectscreen_ceo_firstname),
                attachedString = gameCEOFirstname,
                component,
            { component.getRandomFirstName() },
            "first"
        )
        getNamesScreenTextInputRow(
            hintValue = stringResource(Res.string.nameselectscreen_ceo_last_name),
            attachedString = gameCEOLastname,
            component,
            { component.getRandomLastName() },
            "last"
        )
        getNamesScreenTextInputRow(
            hintValue = stringResource(Res.string.nameselectscreen_company_name),
            attachedString = gameCompanyName,
            component,
            { component.getRandomCompanyName() },
            "company"
        )
        Spacer(modifier = Modifier.fillMaxHeight(.15f))
        Button(
            onClick = {
                component.onEvent(NamesSelectScreenEvent.ClickSubmitNamesButton)
            },
            modifier = Modifier
                .fillMaxWidth(.5f)
                .fillMaxHeight(.7f),
            enabled = isButtonEnabled,
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

    @Composable
    fun getNamesScreenTextInputRow(hintValue: String, attachedString: String, component: NamesSelectScreenComponent, onClick: () -> Unit, buttonType: String) {
        Row (
            modifier = Modifier
                .clip(shape = gameShapes.barelyRoundedRectange)
                .background(gameColors.MilkyBackgroundGray)
                .fillMaxWidth(.94f)
        ) {
            getNamesScreenTextFieldInput(hintValue, attachedString, component, buttonType)
            getRandomChoiceButton(onClick)
        }
    }

    @Composable
    fun getNamesScreenTextFieldInput(hintValue:String, attachedString:String, component: NamesSelectScreenComponent, buttonType:String) {
        TextField(
            value = attachedString,
            onValueChange = {
                if (it.length <= 10 && buttonType.equals("first")) {
                    component.setCEOFirstname(it)
                } else if (it.length <= 15 && buttonType.equals("last")) {
                    component.setCEOLastname(it)
                } else if (it.length <= 25 && buttonType.equals("company")) {
                    component.setCompanyName(it)
                } },
            label = { Text(hintValue) },
            textStyle = TextStyle.Default.copy(fontSize = gameFontSizes.normal),
            modifier = Modifier.fillMaxWidth(.75f)
        )
    }

    @Composable
    fun getRandomChoiceButton(onClick:()->Unit) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth(.9f),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = gameColors.TextWhite
            )
        ) {
            Text(
                text = stringResource(Res.string.getRandomName),
                textAlign = TextAlign.Center,
                fontSize = 10.sp,//gameFontSizes.default,
                color = Color.Black
            )
        }
    }
}