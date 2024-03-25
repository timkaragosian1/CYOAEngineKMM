@file:OptIn(ExperimentalResourceApi::class, ExperimentalDecomposeApi::class)

package ui.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.childContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.gamescreencomponent_eventtype_gamestart
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.stringResource
import ui.components.ViewModels.CreditsScreenComponent
import ui.components.ViewModels.GameScreenComponent
import ui.components.ViewModels.NamesSelectScreenComponent
import ui.components.ViewModels.TitleScreenComponent

class RootComponent(
    componentContext: ComponentContext
): ComponentContext by componentContext {

    private val navigation = StackNavigation<Configuration>()
    private var gameCeoFirstname = ""
    private var gameCeoLastName = ""
    private var gameCompanyName = ""
    private var gameEventMessage = ""
    private var gameEventImage = Res.drawable.red_rocket_art1
    private var gameEventType = ""
    private var gameEventLocation = ""
    private var gameNextEvent = 0
    private var gameButton1Text = ""
    private var gameButton2Text = ""
    private var gameButton3Text = ""
    private var gameButton4Text = ""
    private var gameButton5Text = ""
    private var gameButton6Text = "NEXT"
    private var gameButton1Enabled = false
    private var gameButton2Enabled = false
    private var gameButton3Enabled = false
    private var gameButton4Enabled = false
    private var gameButton5Enabled = false
    private var gameButton6Enabled = true
    private var gameButton1NextEvent = 0
    private var gameButton2NextEvent = 0
    private var gameButton3NextEvent = 0
    private var gameButton4NextEvent = 0
    private var gameButton5NextEvent = 0
    private var gameButton6NextEvent = 0
    private var gameCompanyFinances = 10000000000
    private var gameScreenStatus = "start"
    private var gameScreenShipCrewStatus = 0
    private var gameScreenShipHullStatus = 0
    private var gameScreenShipEnginesStatus = 0
    private var gameScreenShipSensorStatus = 0
    private var gameScreenDestinationStatus = "UNKN"
    private var gameScreenTime = 50.0

    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.TitleScreen,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        config: Configuration,
        context: ComponentContext
    ): Child {
        return when(config){
            Configuration.TitleScreen -> Child.TitleScreen(
                    TitleScreenComponent(
                        componentContext = context,
                        onNavigateToCreditsScreen = {
                            navigation.pushNew(Configuration.CreditsScreen)
                        },
                        onNavigateToNamesGameStartScreen = {
                            resetGameData()
                            navigation.pushNew(Configuration.NamesSelectScreen)
                        }
                    ),
                )
            is Configuration.CreditsScreen -> Child.CreditsScreen(
                CreditsScreenComponent(
                    componentContext = context,
                    onNavigateBackToTitleScreen = {
                        navigation.pop()
                    }
                ),
            )
            is Configuration.GameSpaceScreen -> Child.GameScreen(
                GameScreenComponent(
                    componentContext = context,
                    initEventType = gameEventType,
                    gameEventType = gameEventType,
                    gameEventMessage = gameEventMessage,
                    gameEventImage = gameEventImage,
                    gameEventLocation = gameEventLocation,
                    gameNextEvent  = gameNextEvent,
                    gameButton1Text  = gameButton1Text,
                    gameButton2Text   = gameButton2Text,
                    gameButton3Text   = gameButton3Text,
                    gameButton4Text   = gameButton4Text,
                    gameButton5Text       = gameButton5Text,
                    gameButton6Text       = gameButton6Text,
                    gameButton1Enabled = gameButton1Enabled,
                    gameButton2Enabled = gameButton2Enabled,
                    gameButton3Enabled = gameButton3Enabled,
                    gameButton4Enabled = gameButton4Enabled,
                    gameButton5Enabled = gameButton5Enabled,
                    gameButton6Enabled = gameButton6Enabled,
                    gameButton1NextEvent = gameButton1NextEvent,
                    gameButton2NextEvent = gameButton2NextEvent,
                    gameButton3NextEvent = gameButton3NextEvent,
                    gameButton4NextEvent = gameButton4NextEvent,
                    gameButton5NextEvent = gameButton5NextEvent,
                    gameButton6NextEvent = gameButton6NextEvent,
                    gameCompanyFinances = gameCompanyFinances,
                    gameGameStatus  = gameScreenStatus,
                    gameShipCrewStatus = gameScreenShipCrewStatus,
                    gameShipHullStatus = gameScreenShipHullStatus,
                    gameShipEnginesStatus = gameScreenShipEnginesStatus,
                    gameShipSensorStatus = gameScreenShipSensorStatus,
                    gameDestinationStatus  = gameScreenDestinationStatus,
                    gameGameTime = gameScreenTime,
                    gameCeoFirstname = gameCeoFirstname,
                    gameCeoLastName = gameCeoLastName,
                    gameCompanyName = gameCompanyName,
                    onClickButton1 = {},
                    onClickButton2 = {},
                    onClickButton3 = {},
                    onClickButton4 = {},
                    onClickButton5 = {},
                    onClickButton6 = {},
                    onNavigateBackToTitleScreen = {
                        navigation.pop()
                        navigation.pop()
                    }
                ),
            )

            Configuration.NamesSelectScreen -> Child.NamesSelectScreen(
                NamesSelectScreenComponent(
                    componentContext = context,
                    onNavigateToGameScreen = {
                        navigation.pushNew(Configuration.GameSpaceScreen)
                    },
                    this
                ),
            )
        }
    }

    fun resetGameData(){
        setCEOAndCompanyNames("","","")
        setGameScreenData(
            eventMessage = "Welcome new user. Fill this out better soon!",
            eventImage = Res.drawable.red_rocket_art1,
            eventType = "gamestart",
            eventLocation = "earth",
            nextEvent = 1,
            button1Text = "",
            button2Text = "",
            button3Text = "",
            button4Text = "",
            button5Text = "",
            button6Text = "NEXT",
            button1Enabled = false,
            button2Enabled = false,
            button3Enabled = false,
            button4Enabled = false,
            button5Enabled = false,
            button6Enabled = true,
            button1NextEvent = 0,
            button2NextEvent = 0,
            button3NextEvent = 0,
            button4NextEvent = 0,
            button5NextEvent = 0,
            button6NextEvent = 0,
            shipCrewStatus = 0,
            shipEnginesStatus = 0,
            shipHullStatus = 0,
            shipSensorStatus = 0,
            gameTime = 50.0,
            gameStatus = "gamestart",
            companyFinances = 10000000000,
            destinationStatus = "UNKN",
            companyName = "",
            ceoFirstname = "",
            ceoLastName = ""
        )
    }

    fun setGameScreenData(
        eventMessage:String,
        eventImage: DrawableResource,
        eventType:String,
        eventLocation:String,
        nextEvent:Int,
        button1Text:String,
        button2Text:String,
        button3Text:String,
        button4Text:String,
        button5Text:String,
        button6Text:String,
        button1Enabled:Boolean,
        button2Enabled:Boolean,
        button3Enabled:Boolean,
        button4Enabled:Boolean,
        button5Enabled:Boolean,
        button6Enabled: Boolean,
        button1NextEvent:Int,
        button2NextEvent:Int,
        button3NextEvent:Int,
        button4NextEvent:Int,
        button5NextEvent:Int,
        button6NextEvent:Int,
        companyFinances:Long,
        gameStatus:String,
        shipCrewStatus:Int,
        shipHullStatus:Int,
        shipEnginesStatus:Int,
        shipSensorStatus:Int,
        destinationStatus: String,
        gameTime:Double,
        ceoFirstname:String,
        ceoLastName:String,
        companyName:String,
    ){
        gameEventMessage = eventMessage
        gameEventImage = eventImage
        gameEventType = eventType
        gameEventLocation = eventLocation
        gameNextEvent = nextEvent
        gameButton1Text = button1Text
        gameButton2Text = button2Text
        gameButton3Text = button3Text
        gameButton4Text = button4Text
        gameButton5Text = button5Text
        gameButton6Text = button6Text
        gameButton1Enabled = button1Enabled
        gameButton2Enabled = button2Enabled
        gameButton3Enabled = button3Enabled
        gameButton4Enabled = button4Enabled
        gameButton5Enabled = button5Enabled
        gameButton6Enabled = button6Enabled
        gameButton1NextEvent = button1NextEvent
        gameButton2NextEvent = button2NextEvent
        gameButton3NextEvent = button3NextEvent
        gameButton4NextEvent = button4NextEvent
        gameButton5NextEvent = button5NextEvent
        gameButton6NextEvent = button6NextEvent
        gameCompanyFinances = companyFinances
        gameScreenStatus = gameStatus
        gameScreenShipCrewStatus = shipCrewStatus
        gameScreenShipHullStatus = shipHullStatus
        gameScreenShipEnginesStatus = shipEnginesStatus
        gameScreenShipSensorStatus = shipSensorStatus
        gameScreenDestinationStatus = destinationStatus
        gameScreenTime = gameTime
        gameCeoFirstname = ceoFirstname
        gameCeoLastName = ceoLastName
        gameCompanyName = companyName
    }
    fun setCEOAndCompanyNames(ceoFirstname:String, ceoLastName:String, companyName:String){
        gameCeoFirstname = ceoFirstname
        gameCeoLastName = ceoLastName
        gameCompanyName = companyName
    }

    sealed class Child {
        data class TitleScreen(val component: TitleScreenComponent):Child()
        data class CreditsScreen(val component: CreditsScreenComponent):Child()
        data class GameScreen(val component: GameScreenComponent):Child()
        data class NamesSelectScreen(val component: NamesSelectScreenComponent):Child()
    }

    @Serializable
    sealed class Configuration {
        @Serializable
        data object TitleScreen: Configuration()

        @Serializable
        data object CreditsScreen: Configuration()

        @Serializable
        data object NamesSelectScreen: Configuration()

        @Serializable
        data object GameSpaceScreen: Configuration()
    }
}