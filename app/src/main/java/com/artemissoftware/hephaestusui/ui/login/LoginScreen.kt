package com.artemissoftware.hephaestusui.ui.login

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.login.composables.LoginMenu
import com.artemissoftware.hephaestusui.ui.login.composables.RoundedButton
import com.artemissoftware.hephaestusui.ui.login.composables.TransparentTextField
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun LoginScreen(
    onNavigateToRegister: () -> Unit,
) {


    val emailValue = rememberSaveable{ mutableStateOf("") }
    val passwordValue = rememberSaveable{ mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)

    ) {

        Image(
            painter = painterResource(id = R.drawable.login_logo),
            contentDescription = "Login Image",
            contentScale = ContentScale.Inside
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            LoginMenu(
                modifier = Modifier,
                onNavigateToRegister = onNavigateToRegister
            )
        }

    }
}


@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        LoginScreen(
            onNavigateToRegister = {}
        )
    }
}