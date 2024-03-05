package ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import cyoaenginekmm.composeapp.generated.resources.SpaceBackground1
import cyoaenginekmm.composeapp.generated.resources.rocket
import cyoaenginekmm.composeapp.generated.resources.spacefield_a_000
import cyoaenginekmm.composeapp.generated.resources.spacescreen_title
import cyoaenginekmm.composeapp.generated.resources.titlescreen_credits_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_main_title
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun GameSpaceScreen() {
    Box (modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(Res.drawable.SpaceBackground1),
            contentScale = ContentScale.FillBounds
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                text = stringResource(Res.string.spacescreen_title),
                modifier = Modifier.padding(20.dp)
            )
            Row {
                Button(
                    onClick = {},
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "Button 1")
                }
                Button(
                    onClick = {},
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "Button 2")
                }
            }
            Image(
                modifier = Modifier.padding(20.dp),
                painter = painterResource(Res.drawable.rocket),
                contentDescription = null
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                text = "This is where the main text goes that tells you the story",
                modifier = Modifier.padding(20.dp)
            )
            Row {
                Button(
                    onClick = {},
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "Button 3")
                }
                Button(
                    onClick = {},
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = "Button 4")
                }
            }
        }
    }
}