package ui.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import data.models.GameEvent
import data.models.SpaceEvents

class GameSpaceScreenComponent(
    componentContext: ComponentContext,
    private val onClickButton1: () -> Unit,
    private val onClickButton2: () -> Unit,
    private val onClickButton3: () -> Unit,
    private val onClickButton4: () -> Unit,
    private val onClickButton5: () -> Unit,
    private val onClickButton6: () -> Unit,
    ): ComponentContext by componentContext {

    private var _spaceEvent = MutableValue(SpaceEvents().getRandomSpaceScene())

    private var _titleText = MutableValue("")
    var titleText:Value<String> = _titleText

    private var _eventStartMessage1Text = MutableValue("")
    var eventStartMessage1Text:Value<String> = _eventStartMessage1Text

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
    private var _button6Text = MutableValue("")
    var button6Text:Value<String> = _button6Text


    fun onEvent(event:GameSpaceScreenEvent){
        when(event){
            GameSpaceScreenEvent.ClickButton1 -> {
                getNewRandomEvent(_spaceEvent)
                setupSpaceEventUI(
                    _spaceEvent,
                    _titleText,
                    _eventStartMessage1Text,
                    _button1Text,
                    _button2Text,
                    _button3Text,
                    _button4Text,
                    _button5Text,
                    _button6Text
                    )
                onClickButton1()

            }
            is GameSpaceScreenEvent.ClickButton2 -> onClickButton2()
            is GameSpaceScreenEvent.ClickButton3 -> onClickButton3()
            is GameSpaceScreenEvent.ClickButton4 -> onClickButton4()
            is GameSpaceScreenEvent.ClickButton5 -> onClickButton5()
            is GameSpaceScreenEvent.ClickButton6 -> onClickButton6()
        }
    }
}

fun setupSpaceEventUI(
    spaceEvent: MutableValue<GameEvent>,
    titleText:MutableValue<String>,
    eventStartMessage1Text: MutableValue<String>,
    button1Text: MutableValue<String>,
    button2Text: MutableValue<String>,
    button3Text: MutableValue<String>,
    button4Text: MutableValue<String>,
    button5Text: MutableValue<String>,
    button6Text: MutableValue<String>,
){
    getNewRandomEvent(spaceEvent)
    titleText.value = spaceEvent.value.eventName
    eventStartMessage1Text.value = spaceEvent.value.eventPreDecisionMessage1
    button1Text.value = spaceEvent.value.eventDecision1.decisionText
    button2Text.value = spaceEvent.value.eventDecision2.decisionText
    button3Text.value = spaceEvent.value.eventDecision3.decisionText
    button4Text.value = spaceEvent.value.eventDecision4.decisionText
    button5Text.value = spaceEvent.value.eventDecision5.decisionText
    button6Text.value = spaceEvent.value.eventDecision6.decisionText

}

fun getNewRandomEvent(spaceEvent: MutableValue<GameEvent>) {
    spaceEvent.value = SpaceEvents().getRandomSpaceScene()
}