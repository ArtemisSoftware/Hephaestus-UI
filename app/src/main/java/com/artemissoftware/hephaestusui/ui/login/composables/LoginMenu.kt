package com.artemissoftware.hephaestusui.ui.login.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
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
import androidx.constraintlayout.widget.ConstraintLayout
import com.artemissoftware.hephaestusui.ui.login.LoginScreen
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme
import androidx.constraintlayout.compose.ConstraintLayout
import com.artemissoftware.hephaestusui.ui.login.states.LoginState

@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun LoginMenu(
    state: LoginState,
    modifier: Modifier = Modifier,
    onNavigateToRegister: () -> Unit,
    onLogin: (String, String) -> Unit,
) {

    val emailValue = rememberSaveable{ mutableStateOf("") }
    val passwordValue = rememberSaveable{ mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current
    val coroutineScope = rememberCoroutineScope()

    ConstraintLayout {

        val (surface, fab) = createRefs()


        Card(
            modifier = modifier
                .fillMaxWidth()
                .height(400.dp)
                .constrainAs(surface) {
                    bottom.linkTo(parent.bottom)
                },
            shape = RoundedCornerShape(
                topStartPercent = 8,
                topEndPercent = 8
            )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                Text(
                    text = "Welcome Back!",
                    style = MaterialTheme.typography.h4.copy(
                        fontWeight = FontWeight.Medium
                    )
                )

                Text(
                    text = "Login to your Account",
                    style = MaterialTheme.typography.h5.copy(
                        color = MaterialTheme.colors.primary
                    )
                )


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    TransparentTextField(
                        textFieldValue = emailValue,
                        textLabel = "Email",
                        keyboardType = KeyboardType.Email,
                        keyboardActions = KeyboardActions(
                            onNext = {
                                focusManager.moveFocus(FocusDirection.Down)
                            }
                        ),
                        imeAction = ImeAction.Next
                    )

                    TransparentTextField(
                        textFieldValue = passwordValue,
                        textLabel = "Password",
                        keyboardType = KeyboardType.Password,
                        keyboardActions = KeyboardActions(
                            onDone = {
                                focusManager.clearFocus()

                                onLogin(emailValue.value, passwordValue.value)
                            }
                        ),
                        imeAction = ImeAction.Done,
                        trailingIcon = {
                            IconButton(
                                onClick = {
                                    passwordVisibility = !passwordVisibility
                                }
                            ) {
                                Icon(
                                    imageVector = if (passwordVisibility) {
                                        Icons.Default.Visibility
                                    } else {
                                        Icons.Default.VisibilityOff
                                    },
                                    contentDescription = "Toggle Password Icon"
                                )
                            }
                        },
                        visualTransformation = if (passwordVisibility) {
                            VisualTransformation.None
                        } else {
                            PasswordVisualTransformation()
                        }
                    )


                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Forgot Password?",
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.End
                    )


                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        RoundedButton(
                            text = "Login",
                            displayProgressBar = state.displayProgressBar,
                            onClick = {
                                onLogin(emailValue.value, passwordValue.value)
                            }
                        )

                        ClickableText(
                            text = buildAnnotatedString {
                                append("Do not have an Account?")

                                withStyle(
                                    style = SpanStyle(
                                        color = MaterialTheme.colors.primary,
                                        fontWeight = FontWeight.Bold
                                    )
                                ) {
                                    append("Sign up")
                                }
                            },
                            style = MaterialTheme.typography.body1
                        ) {
                            onNavigateToRegister()
                        }
                    }
                }
            }
        }


        FloatingActionButton(
            modifier = Modifier
                .size(72.dp)
                .constrainAs(fab) {
                    top.linkTo(surface.top, margin = (-36).dp)
                    end.linkTo(surface.end, margin = 36.dp)
                },
            backgroundColor = MaterialTheme.colors.primary,
            onClick = {
                onNavigateToRegister()
            }
        ) {
            Icon(
                modifier = Modifier.size(42.dp),
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Forward Icon",
                tint = Color.White
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
        LoginMenu(
            state = LoginState(),
            onNavigateToRegister = {},
            onLogin = {_, _ ->}
        )
    }
}