package ui.components.GameOverStory

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.ComponentContext
import data.models.GameHistory
import data.models.UserAction

class GameOverStoryComponent(
    componentContext: ComponentContext,
    gameUserActionsList: ArrayList<UserAction>,
    gameHistoryList: ArrayList<GameHistory>,
    private val onNavigateBackToTitleScreen: () -> Unit
): ComponentContext by componentContext {
    val userActionsList = gameUserActionsList
    val historyList = gameHistoryList

    @Composable
    fun getUserActions() {
        Text(
            text = "Sample User Action Line",
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
        )
        for (userActions in userActionsList){
            Text(
                text = "End of game: ${userActions.isEndOfGame}. Start of Game: ${userActions.isStartOfGame}. Next event: ${userActions.eventIdNext}. Notes: ${userActions.notes}, timestamp: ${userActions.timestamp}",
                color = Color.White,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }

    @Composable
    fun getCompanyCEOStory() {
        Text(
            text = "Sample Company Story Line",
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            modifier = Modifier.padding(5.dp)
            )
        for (gameHistory in historyList){
            Text(
                text = "history" + gameHistory.history,
                color = Color.White,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }

    fun backToTitleScreen() {
        onNavigateBackToTitleScreen()
    }
}