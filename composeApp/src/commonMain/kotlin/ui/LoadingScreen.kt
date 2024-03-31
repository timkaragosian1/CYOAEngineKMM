package ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext

@Composable
fun LoadingScreen(component: LoadingScreenComponent) {
    var checkVerUserActionUploadProgress = 0
    var dBDownloadProgress = 0

    val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
        throwable.printStackTrace()
        /**
         * Unfortunately without this handler, it crashes when you select the start game button too fast
         * It tries to call the start game from the worker thread and this handles it until
         * The UI can properly handle everything on the main thread
         */
    }

    CoroutineScope(EmptyCoroutineContext, ).launch (coroutineExceptionHandler){
            delay(1000)
            component.onLoadDataComplete()
    }.start()

    Column (
        modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Loading Screen")
    }
}