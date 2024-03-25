package ui.components.GameScreen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun GameScreenTextRow(eventMessage: String) {



    //Text Screen Row
    Row(modifier = Modifier
        .fillMaxHeight(.27f)
        .fillMaxWidth()
        .padding(top = 5.dp, start = 5.dp, end = 5.dp)
        .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
        .background(Color.hsv(10f,.1f,.1f,.5f))
    ) {
        Column {
            Row (modifier = Modifier
                .padding(3.dp)
                .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                .background(Color.hsv(5f,.7f,.3f,.9f))
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(vertical = 2.dp, horizontal = 7.dp),
                    color = Color.White,
                    text = eventMessage
                )
            }
        }
    }
}
