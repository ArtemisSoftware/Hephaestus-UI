package com.artemissoftware.hephaestusui.ui.sneakershop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.artemissoftware.hephaestusui.ui.sneakershop.models.Sneaker

@Composable
fun SneakerCard(sneaker: Sneaker){

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
    ) {

        val (addButton, bgImage, shoeImage, priceTag) = createRefs()

        Surface(
            Modifier
                .fillMaxWidth(.5f)
                .fillMaxHeight()
                .clip(shape = RoundedCornerShape(50.dp))
                .constrainAs(bgImage) {
                    start.linkTo(parent.start, margin = 8.dp)
                },
            color = sneaker.color
        ) {}


        Box(
            Modifier
                .size(46.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color.White)
                .constrainAs(
                    addButton
                ) {
                    top.linkTo(parent.top)
                }, contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Default.Add, contentDescription = "")
        }


//        //we need to rotate the image

        Image(
            modifier = Modifier
                .fillMaxWidth(.6f)
                .constrainAs(shoeImage) {
                    centerVerticallyTo(parent)
                    start.linkTo(parent.start, margin = 30.dp)
                }
                .rotate(-25f)
            ,
            painter = painterResource(id = sneaker.image),
            contentDescription = ""
        )


//        //done with rotation now need to shift shoe image sligh to right side


        Text(
            modifier = Modifier.constrainAs(priceTag){
                end.linkTo(parent.end, margin = 30.dp)
                bottom.linkTo(parent.bottom, margin =20.dp)
            },
            text = sneaker.price,
            style = TextStyle(
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )

    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SneakerCard(Sneaker.getSneakerListMock()[0])
}