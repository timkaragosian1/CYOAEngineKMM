import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

import ui.screens.CYOAGameApp

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        CYOAGameApp()
        /**
         * THIS IS THE TO DO LIST IN ORDER FOR THIS ENGINE'S COMPLETION TO BECOME C-COMMERCE:
         *      - Implement Decompose library for Navigation and ViewModel use: https://www.youtube.com/watch?v=g4XSWQ7QT8g
         *          - Definition of Done:
         *              - Title Screen Buttons load Space Screen and Credit Screens
         *              - Credit Screen back to Title Screen
         *      - Space Screen loads a endless "game" of 1 of 5 random events where a decision must be made and a result is loaded before more decisions must be made
         *          - Definition of Done:
         *              - The above is achieved all programatically in the commonMain Kotlin as the model for MVVM pattern
         *      - Implement SQL Delight to house the data to be loaded in the game and queries for the events: https://www.youtube.com/watch?v=1w-LTUm_iDE&t=4491s, https://github.com/UR-Prospects-LLC/draftcard-mobile/blob/add_sqldelight/composeApp/build.gradle.kts
         *          - Definition of Done:
         *              - Events are driven from the SQL Delight database rather than programatically from Kotlin
         *              - The DB is a major part of the model with an interface for queries called in the ViewModel
         *      - Figure out Main Quests
         *          - Definition of Done:
         *              - Main Quests follow a path in the game
         *              - Paths go to a celestial object after a certain amount of space travel events
         *              - There are then the same amount of space travel events back to complete
         *              - Only words indicate what transpires at the locations
         *                  - you pick up valuables, you sold them on earth, etc
         *              - The player should then be able to endlessly begin the quest again
         *              - Implement a dollar amount bar for company "money"
         *                  - Interesting Thought: Is the the company money equal to company/player health?
         *      - Expand to other Locations
         *          - Definition of Done:
         *              - Main Quest begins at Earth
         *              - There is a launch event that is handled to get to space
         *              - There is a landing event on the celestial body
         *              - There is a launch event from the celestial body of choice
         *              - There is a landing event back on earth
         *              - The player should then be able to endlessly begin the quest again
         *      - Implement Simple UI Style
         *          - Definition of Done:
         *      - Polish Gameplay and Story
         *          - Definition of Done:
         *      - Begin Testing for Viability and Feedback
         *          - Definition of Done:
         */
    }
}