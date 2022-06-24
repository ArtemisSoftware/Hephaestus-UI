package com.artemissoftware.hephaestusui.ui.game

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.Greeting
import com.artemissoftware.hephaestusui.ui.game.composables.GameDescription
import com.artemissoftware.hephaestusui.ui.game.composables.GameImage
import com.artemissoftware.hephaestusui.ui.game.composables.PlayTrailer
import com.artemissoftware.hephaestusui.ui.game.models.GameDetail
import com.artemissoftware.hephaestusui.ui.theme.HephaestusUITheme

@Composable
fun GameDetailsScreen(gameDetail: GameDetail) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        GameImage(image = gameDetail.backgroundImage)

        PlayTrailer()

        // Title
        Text(modifier = Modifier.padding(
                start = 16.dp,
                top = 30.dp,
                end = 16.dp
            ),
            text = gameDetail.name,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        // About
        Text(
            modifier =
            Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp
            ),
            text = "About",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        //Description with show more/less toggle
        GameDescription(gameDetail.description)


        // Developer
        Text(
            modifier = Modifier.getDetailsModifier(),
            text = "Developer",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            modifier = Modifier.getDetailsModifier(),
            text = gameDetail.developer
        )

        // Publisher
        Text(
            modifier = Modifier.getDetailsModifier(),
            text = "Publisher",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            modifier = Modifier.padding(
                start = 16.dp,
                top = 8.dp,
                end = 16.dp,
                bottom = 16.dp
            ),
            text = gameDetail.publisher
        )
    }
}

fun Modifier.getDetailsModifier(): Modifier =
    this.padding(start = 16.dp, top = 8.dp, end = 16.dp)

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    GameDetailsScreen(GameDetail.getMock())
}