package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.theme.Gray
import com.artemissoftware.hephaestusui.ui.theme.IngedientShapes
import com.artemissoftware.hephaestusui.ui.theme.White

import com.artemissoftware.hephaestusui.R



@Composable
fun IconFlatButton(
    @DrawableRes iconResource: Int,
    color: Color = Gray,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        contentPadding = PaddingValues(),
        shape = IngedientShapes.small,
        colors = ButtonDefaults.buttonColors(backgroundColor = White, contentColor = color),
        elevation = elevation,
        modifier = Modifier
            .size(38.dp)
    ) {
        Icon(painterResource(id = iconResource), null)
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Column {
        IconFlatButton(iconResource = R.drawable.ic_launcher_background)
        IconFlatButton(iconResource = R.drawable.ic_launcher_foreground)
        IconFlatButton(iconResource = R.drawable.juice)
    }


}