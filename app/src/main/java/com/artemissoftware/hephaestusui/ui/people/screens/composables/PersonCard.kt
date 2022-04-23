package com.artemissoftware.hephaestusui.ui.people.screens.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PersonDto
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun PersonCard(personDto: PersonDto) {

    //Coil Image
    val image = rememberCoilPainter(
        request = personDto.avatar,
        fadeIn = true
    )

    Card(
        modifier = Modifier
            .padding(10.dp, 5.dp, 10.dp, 5.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 12.dp
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(Color.White)
        ) {
            Surface(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp))
            ) {


                Image(
                    painter = image,
                    contentDescription = "User Image",
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 15.dp)
                    .align(CenterVertically)
            ) {
                Text(
                    text = "Name : ${personDto.firstName} ${personDto.lastName}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )

                Text(
                    text = "Email : ${personDto.email}",
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    color = Color.Black,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
        }
    }

}