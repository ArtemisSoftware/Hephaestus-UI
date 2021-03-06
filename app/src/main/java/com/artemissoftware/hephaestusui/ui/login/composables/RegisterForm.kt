package com.artemissoftware.hephaestusui.ui.login.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@ExperimentalFoundationApi
@Composable
fun RegisterForm(
    onRegister: (String, String, String, String, String) -> Unit,
    onBack: () -> Unit,
){

    val nameValue = remember { mutableStateOf("") }
    val emailValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val confirmPasswordValue = remember { mutableStateOf("") }

    var passwordVisibility by remember { mutableStateOf(false) }
    var confirmPasswordVisibility by remember { mutableStateOf(false) }

    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {


        TransparentTextField(
            textFieldValue = nameValue,
            textLabel = "Name",
            keyboardType = KeyboardType.Text,
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ),
            imeAction = ImeAction.Next
        )

        TransparentTextField(
            textFieldValue = emailValue,
            textLabel = "Email",
            keyboardType = KeyboardType.Email,
            keyboardActions = KeyboardActions(
                onNext = { focusManager.moveFocus(FocusDirection.Down) }
            ),
            imeAction = ImeAction.Next
        )

        TransparentTextField(
            textFieldValue = phoneValue,
            textLabel = "Phone Number",
            maxChar = 10,
            keyboardType = KeyboardType.Phone,
            keyboardActions = KeyboardActions(
                onNext = { focusManager.moveFocus(FocusDirection.Down) }
            ),
            imeAction = ImeAction.Next
        )

        TransparentTextField(
            textFieldValue = passwordValue,
            textLabel = "Password",
            keyboardType = KeyboardType.Password,
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ),
            imeAction = ImeAction.Next,
            trailingIcon = {
                IconButton(
                    onClick = {
                        passwordVisibility = !passwordVisibility
                    }
                ) {
                    Icon(
                        imageVector = if (passwordVisibility) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                        contentDescription = "Toggle Password Icon"
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation()
        )

        TransparentTextField(
            textFieldValue = confirmPasswordValue,
            textLabel = "Confirm Password",
            keyboardType = KeyboardType.Password,
            keyboardActions = KeyboardActions(
                onDone = {
                    focusManager.clearFocus()

                    onRegister(
                        nameValue.value,
                        emailValue.value,
                        phoneValue.value,
                        passwordValue.value,
                        confirmPasswordValue.value
                    )
                }
            ),
            imeAction = ImeAction.Done,
            trailingIcon = {
                IconButton(
                    onClick = {
                        confirmPasswordVisibility = !confirmPasswordVisibility
                    }
                ) {
                    Icon(
                        imageVector = if (confirmPasswordVisibility) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                        contentDescription = "Toggle Password Icon"
                    )
                }
            },
            visualTransformation = if (confirmPasswordVisibility) VisualTransformation.None else PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))

        RoundedButton(
            text = "Sign Up",
            displayProgressBar = false,
            onClick = {

                onRegister(
                    nameValue.value,
                    emailValue.value,
                    phoneValue.value,
                    passwordValue.value,
                    confirmPasswordValue.value
                )
            }
        )

        ClickableText(
            text = buildAnnotatedString {
                append("Already have an account?")

                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.primary,
                        fontWeight = FontWeight.Bold
                    )
                ){
                    append("Log in")
                }
            },
            onClick = {
                onBack()
            },
            style = MaterialTheme.typography.body1
        )

    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RegisterForm(
        onRegister = {_,_,_,_,_ ->},
        onBack = {}
    )
}