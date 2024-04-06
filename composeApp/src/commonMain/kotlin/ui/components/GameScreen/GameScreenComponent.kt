@file:OptIn(ExperimentalResourceApi::class
)

package ui.components.GameScreen

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import data.models.GameHistory
import data.models.UserAction
import kotlinx.datetime.Clock
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@ExperimentalResourceApi
class GameScreenComponent(
    componentContext: ComponentContext,
    private val gameEventMessage:String,
    private val gameEventImage: DrawableResource,
    private val gameEventType:String,
    private val gameEventLocation:String,
    private val gameNextEvent:Int,
    private val gameButton1Text:String,
    private val gameButton2Text:String,
    private val gameButton3Text:String,
    private val gameButton4Text:String,
    private val gameButton5Text:String,
    private val gameButton6Text:String,
    private val gameButton1Enabled:Boolean,
    private val gameButton2Enabled:Boolean,
    private val gameButton3Enabled:Boolean,
    private val gameButton4Enabled:Boolean,
    private val gameButton5Enabled:Boolean,
    private val gameButton6Enabled: Boolean,
    private val gameButton1NextEvent:Int,
    private val gameButton2NextEvent:Int,
    private val gameButton3NextEvent:Int,
    private val gameButton4NextEvent:Int,
    private val gameButton5NextEvent:Int,
    private val gameButton6NextEvent:Int,
    private val gameCompanyFinances:Long,
    private val gameGameStatus:String,
    private val gameShipCrewStatus:Int,
    private val gameShipHullStatus:Int,
    private val gameShipEnginesStatus:Int,
    private val gameShipSensorStatus:Int,
    private val gameDestinationStatus: String,
    private val gameGameTime:Double,
    private val gameCeoFirstname:String,
    private val gameCeoLastName:String,
    private val gameCompanyName:String,
    private val onClickButton1: () -> Unit,
    private val onClickButton2: () -> Unit,
    private val onClickButton3: () -> Unit,
    private val onClickButton4: () -> Unit,
    private val onClickButton5: () -> Unit,
    private val onClickButton6: () -> Unit,
    private val gameEventHistory: String,
    private val onNavigateBackToTitleScreen: () -> Unit,
    private val onAddUserAction: (UserAction) -> Unit,
    private val onAddGameHistory: (GameHistory) -> Unit,
    private val gameGameHistory: GameHistory,
    private val gameUserAction: UserAction
): ComponentContext by componentContext {
    private var _eventName = MutableValue("")
    var eventName:Value<String> = _eventName
    private var _eventMessage = MutableValue(gameEventMessage)
    var eventMessage:Value<String> = _eventMessage
    private var _eventImage = MutableValue(gameEventImage)
    var eventImage: Value<DrawableResource> = _eventImage
    private var _eventType = MutableValue(gameEventType)
    var eventType:Value<String> = _eventType
    private var _eventLocation = MutableValue(gameEventLocation)
    var eventLocation:Value<String> = _eventLocation
    private var _nextEvent = MutableValue(gameNextEvent)
    var nextEvent:Value<Int> = _nextEvent

    private var _button1Text = MutableValue(gameButton1Text)
    var button1Text:Value<String> = _button1Text
    private var _button2Text = MutableValue(gameButton2Text)
    var button2Text:Value<String> = _button2Text
    private var _button3Text = MutableValue(gameButton3Text)
    var button3Text:Value<String> = _button3Text
    private var _button4Text = MutableValue(gameButton4Text)
    var button4Text:Value<String> = _button4Text
    private var _button5Text = MutableValue(gameButton5Text)
    var button5Text:Value<String> = _button5Text
    private var _button6Text = MutableValue(gameButton6Text)
    var button6Text:Value<String> = _button6Text

    private var _button1Enabled = MutableValue(gameButton1Enabled)
    var button1Enabled:Value<Boolean> = _button1Enabled
    private var _button2Enabled = MutableValue(gameButton2Enabled)
    var button2Enabled:Value<Boolean> = _button2Enabled
    private var _button3Enabled = MutableValue(gameButton3Enabled)
    var button3Enabled:Value<Boolean> = _button3Enabled
    private var _button4Enabled = MutableValue(gameButton4Enabled)
    var button4Enabled:Value<Boolean> = _button4Enabled
    private var _button5Enabled = MutableValue(gameButton5Enabled)
    var button5Enabled:Value<Boolean> = _button5Enabled
    private var _button6Enabled = MutableValue(gameButton6Enabled)
    var button6Enabled:Value<Boolean> = _button6Enabled

    private var _button1NextEvent = MutableValue(gameButton1NextEvent)
    var button1NextEvent:Value<Int> = _button1NextEvent
    private var _button2NextEvent = MutableValue(gameButton2NextEvent)
    var button2NextEvent:Value<Int> = _button2NextEvent
    private var _button3NextEvent = MutableValue(gameButton3NextEvent)
    var button3NextEvent:Value<Int> = _button3NextEvent
    private var _button4NextEvent = MutableValue(gameButton4NextEvent)
    var button4NextEvent:Value<Int> = _button4NextEvent
    private var _button5NextEvent = MutableValue(gameButton5NextEvent)
    var button5NextEvent:Value<Int> = _button5NextEvent
    private var _button6NextEvent = MutableValue(gameButton6NextEvent)
    var button6NextEvent:Value<Int> = _button6NextEvent

    private var _companyFinances = MutableValue(gameCompanyFinances)
    var companyFinances: Value<Long> = _companyFinances
    var _gameStatus = MutableValue(gameGameStatus)
    var gameStatus: Value<String> = _gameStatus
    var _gameCrewStatus = MutableValue(gameShipCrewStatus)
    var gameCrewStatus: Value<Int> = _gameCrewStatus
    var _gameShipHull = MutableValue(gameShipHullStatus)
    var gameShipHull: Value<Int> = _gameShipHull
    var _gameShipSensors = MutableValue(gameShipSensorStatus)
    var gameShipSensors: Value<Int> = _gameShipSensors
    var _gameShipEngines = MutableValue(gameShipEnginesStatus)
    var gameShipEngines: Value<Int> = _gameShipEngines
    var _gameShipDestination = MutableValue(gameDestinationStatus)
    var gameShipDestination: Value<String> = _gameShipDestination
    var _gameTime = MutableValue(gameGameTime)
    var gameTime: Value<Double> = _gameTime

    var _ceoFirstname = MutableValue(gameCeoFirstname)
    var ceoFirstname:Value<String> = _ceoFirstname

    var _ceoLastname = MutableValue(gameCeoLastName)
    var ceoLastname:Value<String> = _ceoLastname

    var _companyName = MutableValue(gameCompanyName)
    var companyName:Value<String> = _companyName

    var _crewSpecialAbilities = MutableValue(ArrayList<String>())
    var crewSpecialAbilities:Value<ArrayList<String>> = _crewSpecialAbilities

    private var _eventHistory = MutableValue(gameEventHistory)
    var eventHistory:Value<String> = _eventHistory

    fun updateNextEvent(nextEvent:Int){
        _nextEvent.value = nextEvent
    }

    private var _gameHistory = MutableValue(gameGameHistory)

    private var _userAction = MutableValue(gameUserAction)

    fun handleGameOver() {
        onNavigateBackToTitleScreen()
    }

    fun onEvent(event: GameScreenEvent, nextEvent: Int){
        _nextEvent.value = nextEvent
        when(event){
            GameScreenEvent.ClickButton1 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventName,
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
                    _eventHistory,
                    this
                )
                _userAction.value = UserAction(
                    isStartOfGame = _gameStatus.value == "gamestart",
                    isEndOfGame = _gameStatus.value == "gameend",
                    eventIdCurrent = 0,
                    eventIdNext = _nextEvent.value,
                    notes = _eventName.value,
                    timestamp = Clock.System.now().toEpochMilliseconds()
                )
                onClickButton1()
            }
            is GameScreenEvent.ClickButton2 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventName,
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
                    _eventHistory,
                    this
                )
                _userAction.value = UserAction(
                    isStartOfGame = _gameStatus.value == "gamestart",
                    isEndOfGame = _gameStatus.value == "gameend",
                    eventIdCurrent = 0,
                    eventIdNext = _nextEvent.value,
                    notes = _eventName.value,
                    timestamp = Clock.System.now().toEpochMilliseconds()
                )
                onClickButton2()
            }
            is GameScreenEvent.ClickButton3 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventName,
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
                    _eventHistory,
                    this
                )
                _userAction.value = UserAction(
                    isStartOfGame = _gameStatus.value == "gamestart",
                    isEndOfGame = _gameStatus.value == "gameend",
                    eventIdCurrent = 0,
                    eventIdNext = _nextEvent.value,
                    notes = _eventName.value,
                    timestamp = Clock.System.now().toEpochMilliseconds()
                )
                    onClickButton3()
            }
            is GameScreenEvent.ClickButton4 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventName,
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
                    _eventHistory,
                    this
                )
                _userAction.value = UserAction(
                    isStartOfGame = _gameStatus.value == "gamestart",
                    isEndOfGame = _gameStatus.value == "gameend",
                    eventIdCurrent = 0,
                    eventIdNext = _nextEvent.value,
                    notes = _eventName.value,
                    timestamp = Clock.System.now().toEpochMilliseconds()
                )
                onClickButton4()
            }
            is GameScreenEvent.ClickButton5 -> {
                GameScreenComponentEventController().handleNextEvent(
                    _eventName,
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
                    _eventHistory,
                    this
                )
                _userAction.value = UserAction(
                    isStartOfGame = _gameStatus.value == "gamestart",
                    isEndOfGame = _gameStatus.value == "gameend",
                    eventIdCurrent = 0,
                    eventIdNext = _nextEvent.value,
                    notes = _eventName.value,
                    timestamp = Clock.System.now().toEpochMilliseconds()
                )
                onClickButton5()
            }
            is GameScreenEvent.ClickButton6 -> {
                if (_nextEvent.value!=-1) {
                    GameScreenComponentEventController().handleNextEvent(
                        _eventName,
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
                        _eventHistory,
                        this
                    )
                } else {
                    handleGameOver()
                }

                _userAction.value = UserAction(
                    isStartOfGame = _gameStatus.value == "gamestart",
                    isEndOfGame = _gameStatus.value == "gameend",
                    eventIdCurrent = 0,
                    eventIdNext = _nextEvent.value,
                    notes = _eventName.value,
                    timestamp = Clock.System.now().toEpochMilliseconds()
                )
                onClickButton6()
            }

            is GameScreenEvent.AddUserAction -> onAddUserAction(_userAction.value)
            is GameScreenEvent.AddGameHistory -> onAddGameHistory(_gameHistory.value)
        }
    }
}

