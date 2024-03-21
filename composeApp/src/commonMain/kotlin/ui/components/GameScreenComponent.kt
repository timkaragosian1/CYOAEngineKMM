@file:OptIn(ExperimentalResourceApi::class, ExperimentalResourceApi::class,
    ExperimentalResourceApi::class
)

package ui.components

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import data.models.GameEvent
import data.models.Events.SpaceEvents
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@ExperimentalResourceApi
class GameSpaceScreenComponent(
    componentContext: ComponentContext,
    private val onClickButton1: () -> Unit,
    private val onClickButton2: () -> Unit,
    private val onClickButton3: () -> Unit,
    private val onClickButton4: () -> Unit,
    private val onClickButton5: () -> Unit,
    private val onClickButton6: () -> Unit,
    private val onClickStatusButton: () -> Unit
    ): ComponentContext by componentContext {
    private var _eventMessage = MutableValue("Welcome to cCommerce!")
    var eventMessage:Value<String> = _eventMessage

    private var _eventImage = MutableValue(Res.drawable.red_rocket_art1)
    var eventImage: Value<DrawableResource> = _eventImage

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
    private var _button6Text = MutableValue("Next")
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

    private var _companyFinances = MutableValue(5000000000.00)
    var companyFinances: Value<Double> = _companyFinances

    private var _eventStatus = MutableValue("gamestart")
    var eventStatus:Value<String> = _eventStatus

    private var _eventLocation = MutableValue("")
    var eventLocation:Value<String> = _eventLocation

private var _nextEvent = MutableValue(0)
    var nextEvent:Value<Int> = _nextEvent

    fun updateNextEvent(nextEvent:Int){
        _nextEvent.value = nextEvent
    }

    fun onEvent(event:GameScreenEvent, nextEvent: Int){
        _nextEvent.value = nextEvent
        when(event){
            GameScreenEvent.ClickStatusButton->{
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                    )
                onClickStatusButton()
            }
            GameScreenEvent.ClickButton1 -> {
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                )
                onClickButton1()
            }
            is GameScreenEvent.ClickButton2 -> {
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                )
                onClickButton2()
            }
            is GameScreenEvent.ClickButton3 -> {
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                )
                    onClickButton3()
            }
            is GameScreenEvent.ClickButton4 -> {
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                )
                onClickButton4()
            }
            is GameScreenEvent.ClickButton5 -> {
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                )
                onClickButton5()
            }
            is GameScreenEvent.ClickButton6 -> {
                handleNextEvent(
                    _eventMessage,
                    _eventImage,
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
                    _companyFinances
                )
                onClickButton6()
            }
        }
    }
}

fun setupSpaceEventUI(
    spaceEvent: GameEvent,
    eventMessage: MutableValue<String>,
    eventImage: MutableValue<DrawableResource>,
    button1Text: MutableValue<String>,
    button2Text: MutableValue<String>,
    button3Text: MutableValue<String>,
    button4Text: MutableValue<String>,
    button5Text: MutableValue<String>,
    button6Text: MutableValue<String>,
    button1Enabled: MutableValue<Boolean>,
    button2Enabled: MutableValue<Boolean>,
    button3Enabled: MutableValue<Boolean>,
    button4Enabled: MutableValue<Boolean>,
    button5Enabled: MutableValue<Boolean>,
    button6Enabled: MutableValue<Boolean>,
    button1NextEvent: MutableValue<Int>,
    button2NextEvent: MutableValue<Int>,
    button3NextEvent: MutableValue<Int>,
    button4NextEvent: MutableValue<Int>,
    button5NextEvent: MutableValue<Int>,
    button6NextEvent: MutableValue<Int>,
    companyFinances: MutableValue<Double>
) {
    eventMessage.value = spaceEvent.eventMessage
    eventImage.value = spaceEvent.eventImage
    button1Text.value = spaceEvent.eventDecision1.buttonText
    button2Text.value = spaceEvent.eventDecision2.buttonText
    button3Text.value = spaceEvent.eventDecision3.buttonText
    button4Text.value = spaceEvent.eventDecision4.buttonText
    button5Text.value = spaceEvent.eventDecision5.buttonText
    button6Text.value = spaceEvent.eventDecision6.buttonText
    button1Enabled.value = spaceEvent.eventDecision1.enabled
    button2Enabled.value = spaceEvent.eventDecision2.enabled
    button3Enabled.value = spaceEvent.eventDecision3.enabled
    button4Enabled.value = spaceEvent.eventDecision4.enabled
    button5Enabled.value = spaceEvent.eventDecision5.enabled
    button6Enabled.value = spaceEvent.eventDecision6.enabled
    button1NextEvent.value = spaceEvent.eventDecision1.nextEventId
    button2NextEvent.value = spaceEvent.eventDecision2.nextEventId
    button3NextEvent.value = spaceEvent.eventDecision3.nextEventId
    button4NextEvent.value = spaceEvent.eventDecision4.nextEventId
    button5NextEvent.value = spaceEvent.eventDecision5.nextEventId
    button6NextEvent.value = spaceEvent.eventDecision6.nextEventId
}

fun handleNextEvent(
    eventMessage: MutableValue<String>,
    eventImage: MutableValue<DrawableResource>,
    button1Text: MutableValue<String>,
    button2Text: MutableValue<String>,
    button3Text: MutableValue<String>,
    button4Text: MutableValue<String>,
    button5Text: MutableValue<String>,
    button6Text: MutableValue<String>,
    button1Enabled: MutableValue<Boolean>,
    button2Enabled: MutableValue<Boolean>,
    button3Enabled: MutableValue<Boolean>,
    button4Enabled: MutableValue<Boolean>,
    button5Enabled: MutableValue<Boolean>,
    button6Enabled: MutableValue<Boolean>,
    button1NextEvent: MutableValue<Int>,
    button2NextEvent: MutableValue<Int>,
    button3NextEvent: MutableValue<Int>,
    button4NextEvent: MutableValue<Int>,
    button5NextEvent: MutableValue<Int>,
    button6NextEvent: MutableValue<Int>,
    nextEvent:MutableValue<Int>,
    companyFinances: MutableValue<Double>
) {
    setupSpaceEventUI(
        SpaceEvents().getEventFromId(nextEvent),
        eventMessage,
        eventImage,
        button1Text,
        button2Text,
        button3Text,
        button4Text,
        button5Text,
        button6Text,
        button1Enabled,
    button2Enabled,
    button3Enabled,
    button4Enabled,
    button5Enabled,
    button6Enabled,
        button1NextEvent,
        button2NextEvent,
        button3NextEvent,
        button4NextEvent,
        button5NextEvent,
        button6NextEvent,
        companyFinances
    )
}