@file:OptIn(ExperimentalResourceApi::class
)

package ui.components.GameScreen

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import data.models.GameStory
import data.models.UserAction
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
    private val gameEventStory: String,
    private val onNavigateBackToTitleScreen: () -> Unit,
    private val onAddUserAction: (UserAction) -> Unit,
    private val onAddGameStory: (GameStory) -> Unit,
    private val gameGameStory: GameStory,
    private val gameUserAction: UserAction
): ComponentContext by componentContext {
    private var _eventName = MutableValue("")
    val eventName:Value<String> = _eventName
    private var _eventMessage = MutableValue(gameEventMessage)
    val eventMessage:Value<String> = _eventMessage
    private var _eventImage = MutableValue(gameEventImage)
    val eventImage: Value<DrawableResource> = _eventImage
    private var _eventType = MutableValue(gameEventType)
    val eventType:Value<String> = _eventType
    private var _eventLocation = MutableValue(gameEventLocation)
    val eventLocation:Value<String> = _eventLocation
    private var _nextEvent = MutableValue(gameNextEvent)
    val nextEvent:Value<Int> = _nextEvent

    private var _button1Text = MutableValue(gameButton1Text)
    val button1Text:Value<String> = _button1Text
    private var _button2Text = MutableValue(gameButton2Text)
    val button2Text:Value<String> = _button2Text
    private var _button3Text = MutableValue(gameButton3Text)
    val button3Text:Value<String> = _button3Text
    private var _button4Text = MutableValue(gameButton4Text)
    val button4Text:Value<String> = _button4Text
    private var _button5Text = MutableValue(gameButton5Text)
    val button5Text:Value<String> = _button5Text
    private var _button6Text = MutableValue(gameButton6Text)
    val button6Text:Value<String> = _button6Text

    private var _button1Enabled = MutableValue(gameButton1Enabled)
    val button1Enabled:Value<Boolean> = _button1Enabled
    private var _button2Enabled = MutableValue(gameButton2Enabled)
    val button2Enabled:Value<Boolean> = _button2Enabled
    private var _button3Enabled = MutableValue(gameButton3Enabled)
    val button3Enabled:Value<Boolean> = _button3Enabled
    private var _button4Enabled = MutableValue(gameButton4Enabled)
    val button4Enabled:Value<Boolean> = _button4Enabled
    private var _button5Enabled = MutableValue(gameButton5Enabled)
    val button5Enabled:Value<Boolean> = _button5Enabled
    private var _button6Enabled = MutableValue(gameButton6Enabled)
    val button6Enabled:Value<Boolean> = _button6Enabled

    private var _button1NextEvent = MutableValue(gameButton1NextEvent)
    val button1NextEvent:Value<Int> = _button1NextEvent
    private var _button2NextEvent = MutableValue(gameButton2NextEvent)
    val button2NextEvent:Value<Int> = _button2NextEvent
    private var _button3NextEvent = MutableValue(gameButton3NextEvent)
    val button3NextEvent:Value<Int> = _button3NextEvent
    private var _button4NextEvent = MutableValue(gameButton4NextEvent)
    val button4NextEvent:Value<Int> = _button4NextEvent
    private var _button5NextEvent = MutableValue(gameButton5NextEvent)
    val button5NextEvent:Value<Int> = _button5NextEvent
    private var _button6NextEvent = MutableValue(gameButton6NextEvent)
    val button6NextEvent:Value<Int> = _button6NextEvent

    private var _companyFinances = MutableValue(gameCompanyFinances)
    val companyFinances: Value<Long> = _companyFinances
    private var _gameStatus = MutableValue(gameGameStatus)
    val gameStatus: Value<String> = _gameStatus
    private var _gameCrewStatus = MutableValue(gameShipCrewStatus)
    val gameCrewStatus: Value<Int> = _gameCrewStatus
    private var _gameShipHull = MutableValue(gameShipHullStatus)
    val gameShipHull: Value<Int> = _gameShipHull
    private var _gameShipSensors = MutableValue(gameShipSensorStatus)
    val gameShipSensors: Value<Int> = _gameShipSensors
    private var _gameShipEngines = MutableValue(gameShipEnginesStatus)
    val gameShipEngines: Value<Int> = _gameShipEngines
    private var _gameShipDestination = MutableValue(gameDestinationStatus)
    val gameShipDestination: Value<String> = _gameShipDestination
    private var _gameTime = MutableValue(gameGameTime)
    val gameTime: Value<Double> = _gameTime

    private var _ceoFirstname = MutableValue(gameCeoFirstname)
    val ceoFirstname:Value<String> = _ceoFirstname

    private var _ceoLastname = MutableValue(gameCeoLastName)
    val ceoLastname:Value<String> = _ceoLastname

    private var _companyName = MutableValue(gameCompanyName)
    val companyName:Value<String> = _companyName

    private var _crewSpecialAbilities = MutableValue(ArrayList<String>())
    val crewSpecialAbilities:Value<ArrayList<String>> = _crewSpecialAbilities

    private var _eventStory = MutableValue(gameEventStory)
    val eventStory:Value<String> = _eventStory

    fun updateNextEvent(nextEvent:Int){
        _nextEvent.value = nextEvent
    }

    private var _gameStory = MutableValue(GameStory(eventStory.value,0))
    val gameStory: Value<GameStory> = _gameStory

    private var _userAction = MutableValue(gameUserAction)
    val userAction: Value<UserAction> = _userAction

    fun handleGameOver() {
        onNavigateBackToTitleScreen()
    }

    fun setGameStoryValue(storyText:String){
        _gameStory.value.storyText = storyText
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
                    _gameStory,
                    _userAction,
                    this
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
                    _gameStory,
                    _userAction,
                    this
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
                    _gameStory,
                    _userAction,
                    this
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
                    _gameStory,
                    _userAction,
                    this
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
                    _gameStory,
                    _userAction,
                    this
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
                        _gameStory,
                        _userAction,
                        this
                    )
                } else {
                    handleGameOver()
                }
                onClickButton6()
            }

            is GameScreenEvent.AddUserAction -> onAddUserAction(_userAction.value)
            is GameScreenEvent.AddGameStory ->  onAddGameStory(_gameStory.value)
        }
    }
}

