package com.artemissoftware.hephaestusui.ui.dating.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.dating.models.Date
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.theme.purple
import kotlin.random.Random

@Composable
fun DateContent(
    date: Date,
    height: Dp
){


    Column(
        modifier = Modifier.height(height = height),
    ) {
        Image(
            painter = painterResource(date.imageId),
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = Modifier.weight(1f).align(Alignment.CenterHorizontally)
        )

        Row(
            modifier = Modifier
                .padding(
                    vertical = 8.dp,
                    horizontal = 16.dp
                )
        ){

            Text(
                text = date.name,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .weight(1f),
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Outlined.Place,
                modifier = Modifier
                    .padding(horizontal = 8.dp),
                tint = purple,
                contentDescription = null
            )
            Text(
                text = "${Random.nextInt(1, 15)} km",
                style = MaterialTheme.typography.body2,
                color = purple
            )

        }



        Text(
            text = date.description,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 4.dp),
            color = Color.Gray
        )
        Text(
            text = "Make it Easy",
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 16.dp),
            color = Color.Gray
        )
    }


}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DateContent(Date.getListMock()[1], height = 400.dp)
}