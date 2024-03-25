@file:OptIn(ExperimentalResourceApi::class, ExperimentalResourceApi::class,
    ExperimentalResourceApi::class, ExperimentalResourceApi::class, ExperimentalResourceApi::class
)

package ui.components.ViewModels

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.blank
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.stringResource
import ui.components.GameScreen.GameScreenComponentEventController
import ui.components.GameScreen.GameScreenEvent

@ExperimentalResourceApi
class GameScreenComponent(
    componentContext: ComponentContext,
    private val onClickButton1: () -> Unit,
    private val onClickButton2: () -> Unit,
    private val onClickButton3: () -> Unit,
    private val onClickButton4: () -> Unit,
    private val onClickButton5: () -> Unit,
    private val onClickButton6: () -> Unit,
    private val gameCEOFirstname:String,
    private val gameCEOLastname:String,
    private val gameCompanyName: String,
    private val initEventType: String,
    private val onNavigateBackToTitleScreen: () -> Unit
): ComponentContext by componentContext {
    private var _eventMessage = MutableValue("Welcome new user! Please press the ID Scan Sign In button to continue.")
    var eventMessage:Value<String> = _eventMessage
    private var _eventImage = MutableValue(Res.drawable.red_rocket_art1)
    var eventImage: Value<DrawableResource> = _eventImage
    private var _eventType = MutableValue(initEventType)
    var eventType:Value<String> = _eventType
    private var _eventLocation = MutableValue("")
    var eventLocation:Value<String> = _eventLocation
    private var _nextEvent = MutableValue(0)
    var nextEvent:Value<Int> = _nextEvent

    private var _button1Text = MutableValue("")
    var button1Text:Value<String> = _button1Text
    private var _button2Text = MutableValue("")
    var button2Text:Value<String> = _button2Text
    private var _button3Text = MutableValue("")
    var button3Text:Value<String> = _button3Text
    private var _button4Text = MutableValue("")
    var button4Text:Value<String> = _button4Text
    private var _button5Text = MutableValue("")
    var button5Text:Value<String> = _button5Text
    private var _button6Text = MutableValue("ID Scan\n" +
            "Sign In")
    var button6Text:Value<String> = _button6Text

    private var _button1Enabled = MutableValue(false)
    var button1Enabled:Value<Boolean> = _button1Enabled
    private var _button2Enabled = MutableValue(false)
    var button2Enabled:Value<Boolean> = _button2Enabled
    private var _button3Enabled = MutableValue(false)
    var button3Enabled:Value<Boolean> = _button3Enabled
    private var _button4Enabled = MutableValue(false)
    var button4Enabled:Value<Boolean> = _button4Enabled
    private var _button5Enabled = MutableValue(false)
    var button5Enabled:Value<Boolean> = _button5Enabled
    private var _button6Enabled = MutableValue(true)
    var button6Enabled:Value<Boolean> = _button6Enabled

    private var _button1NextEvent = MutableValue(0)
    var button1NextEvent:Value<Int> = _button1NextEvent
    private var _button2NextEvent = MutableValue(0)
    var button2NextEvent:Value<Int> = _button2NextEvent
    private var _button3NextEvent = MutableValue(0)
    var button3NextEvent:Value<Int> = _button3NextEvent
    private var _button4NextEvent = MutableValue(0)
    var button4NextEvent:Value<Int> = _button4NextEvent
    private var _button5NextEvent = MutableValue(0)
    var button5NextEvent:Value<Int> = _button5NextEvent
    private var _button6NextEvent = MutableValue(0)
    var button6NextEvent:Value<Int> = _button6NextEvent

    private var _companyFinances = MutableValue(10000000000)
    var companyFinances: Value<Long> = _companyFinances
    var _gameStatus = MutableValue("start")
    var gameStatus: Value<String> = _gameStatus
    var _gameCrewStatus = MutableValue(0)
    var gameCrewStatus: Value<Int> = _gameCrewStatus
    var _gameShipHull = MutableValue(0)
    var gameShipHull: Value<Int> = _gameShipHull
    var _gameShipSensors = MutableValue(0)
    var gameShipSensors: Value<Int> = _gameShipSensors
    var _gameShipEngines = MutableValue(0)
    var gameShipEngines: Value<Int> = _gameShipEngines
    var _gameShipDestination = MutableValue("UNKN")
    var gameShipDestination: Value<String> = _gameShipDestination
    var _gameTime = MutableValue(50.0)
    var gameTime: Value<Double> = _gameTime

    var _ceoFirstname = MutableValue(gameCEOFirstname)
    var ceoFirstname:Value<String> = _ceoFirstname

    var _ceoLastname = MutableValue(gameCEOLastname)
    var ceoLastname:Value<String> = _ceoLastname

    var _companyName = MutableValue(gameCompanyName)
    var companyName:Value<String> = _companyName

    fun updateNextEvent(nextEvent:Int){
        _nextEvent.value = nextEvent
    }

    fun handleGameOver() {
        onNavigateBackToTitleScreen()
    }

    fun onEvent(event: GameScreenEvent, nextEvent: Int){
        _nextEvent.value = nextEvent
        when(event){
            GameScreenEvent.ClickButton1 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventMessage,
                    _eventImage,
                    _eventType,
                    _eventLocation,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text,
                    _button1Enabled,
                    _button2Enabled,
                    _button3Enabled,
                    _button4Enabled,
                    _button5Enabled,
                    _button6Enabled,
                    _button1NextEvent,
                    _button2NextEvent,
                    _button3NextEvent,
                    _button4NextEvent,
                    _button5NextEvent,
                    _button6NextEvent,
                    _nextEvent,
                    _companyFinances,
                    _gameStatus,
                    _gameCrewStatus,
                    _gameTime,
                    _gameShipHull,
                    _gameShipEngines,
                    _gameShipSensors,
                    this
                )
                onClickButton1()
            }
            is GameScreenEvent.ClickButton2 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventMessage,
                    _eventImage,
                    _eventType,
                    _eventLocation,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text,
                    _button1Enabled,
                    _button2Enabled,
                    _button3Enabled,
                    _button4Enabled,
                    _button5Enabled,
                    _button6Enabled,
                    _button1NextEvent,
                    _button2NextEvent,
                    _button3NextEvent,
                    _button4NextEvent,
                    _button5NextEvent,
                    _button6NextEvent,
                    _nextEvent,
                    _companyFinances,
                    _gameStatus,
                    _gameCrewStatus,
                    _gameTime,
                    _gameShipHull,
                    _gameShipEngines,
                    _gameShipSensors,
                    this
                )
                onClickButton2()
            }
            is GameScreenEvent.ClickButton3 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventMessage,
                    _eventImage,
                    _eventType,
                    _eventType,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text,
                    _button1Enabled,
                    _button2Enabled,
                    _button3Enabled,
                    _button4Enabled,
                    _button5Enabled,
                    _button6Enabled,
                    _button1NextEvent,
                    _button2NextEvent,
                    _button3NextEvent,
                    _button4NextEvent,
                    _button5NextEvent,
                    _button6NextEvent,
                    _nextEvent,
                    _companyFinances,
                    _gameStatus,
                    _gameCrewStatus,
                    _gameTime,
                    _gameShipHull,
                    _gameShipEngines,
                    _gameShipSensors,
                    this
                )
                    onClickButton3()
            }
            is GameScreenEvent.ClickButton4 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventMessage,
                    _eventImage,
                    _eventType,
                    _eventLocation,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text,
                    _button1Enabled,
                    _button2Enabled,
                    _button3Enabled,
                    _button4Enabled,
                    _button5Enabled,
                    _button6Enabled,
                    _button1NextEvent,
                    _button2NextEvent,
                    _button3NextEvent,
                    _button4NextEvent,
                    _button5NextEvent,
                    _button6NextEvent,
                    _nextEvent,
                    _companyFinances,
                    _gameStatus,
                    _gameCrewStatus,
                    _gameTime,
                    _gameShipHull,
                    _gameShipEngines,
                    _gameShipSensors,
                    this
                )
                onClickButton4()
            }
            is GameScreenEvent.ClickButton5 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventMessage,
                    _eventImage,
                    _eventType,
                    _eventLocation,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text,
                    _button1Enabled,
                    _button2Enabled,
                    _button3Enabled,
                    _button4Enabled,
                    _button5Enabled,
                    _button6Enabled,
                    _button1NextEvent,
                    _button2NextEvent,
                    _button3NextEvent,
                    _button4NextEvent,
                    _button5NextEvent,
                    _button6NextEvent,
                    _nextEvent,
                    _companyFinances,
                    _gameStatus,
                    _gameCrewStatus,
                    _gameTime,
                    _gameShipHull,
                    _gameShipEngines,
                    _gameShipSensors,
                    this
                )
                onClickButton5()
            }
            is GameScreenEvent.ClickButton6 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventMessage,
                    _eventImage,
                    _eventType,
                    _eventLocation,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text,
                    _button1Enabled,
                    _button2Enabled,
                    _button3Enabled,
                    _button4Enabled,
                    _button5Enabled,
                    _button6Enabled,
                    _button1NextEvent,
                    _button2NextEvent,
                    _button3NextEvent,
                    _button4NextEvent,
                    _button5NextEvent,
                    _button6NextEvent,
                    _nextEvent,
                    _companyFinances,
                    _gameStatus,
                    _gameCrewStatus,
                    _gameTime,
                    _gameShipHull,
                    _gameShipEngines,
                    _gameShipSensors,
                    this
                )

                onClickButton6()
            }
        }
    }
}
