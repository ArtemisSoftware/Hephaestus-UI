package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.CardType

@Composable
fun MobileCards(visaType: CardType) {

    Column {
        CardSelector()
        MobileCard(visaType)
    }

}

@Composable
private fun CardSelector() {

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .padding(5.dp),
            elevation = 0.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Physical Card",
                color = BankColor,
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 5.dp),
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
        }

        Card(
            modifier = Modifier
                .padding(5.dp),
            elevation = 0.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Virtual Card",
                color = BankColor.copy(alpha = 0.4f),
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 5.dp),
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun MobileCard(visaType: CardType) {

    val animatedColor = animateColorAsState(targetValue = Color(0xFF1C478B))

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height(220.dp),
            shape = RoundedCornerShape(25.dp),
            backgroundColor = animatedColor.value,
            elevation = 18.dp
        ) {
            ConstraintLayout(
                modifier = Modifier.fillMaxSize()
            ) {
                val (symbol, logo, cardName, cardNameLabel, number, expiryLabel) = createRefs()

                Image(
                    painter = painterResource(id = R.drawable.card_symbol),
                    contentDescription = "Symbol",
                    modifier = Modifier
                        .padding(20.dp)
                        .constrainAs(symbol) {
                            start.linkTo(parent.start)
                            top.linkTo(parent.top)
                        }
                )

                Image(
                    painter = painterResource(id = visaType.image),
                    contentDescription = "Card Type",
                    modifier = Modifier
                        .padding(20.dp)
                        .constrainAs(logo) {
                            end.linkTo(parent.end)
                            top.linkTo(parent.top)
                        }
                )

                Text(
                    text = "************1234".chunked(4).joinToString("  "),
                    style = MaterialTheme.typography.h5,
                    maxLines = 1,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .animateContentSize(spring())
                        .padding(vertical = 16.dp, horizontal = 16.dp)
                        .constrainAs(number) {
                            linkTo(
                                start = parent.start,
                                end = parent.end
                            )
                            linkTo(
                                top = parent.top,
                                bottom = parent.bottom
                            )
                        }
                )

                Text(
                    text = "CARD HOLDER",
                    style = MaterialTheme.typography.caption,
                    color = Color.White.copy(alpha = 0.5f),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .constrainAs(cardNameLabel) {
                            start.linkTo(parent.start)
                            bottom.linkTo(cardName.top)
                        }
                )
                Text(
                    text = "Artemis Software",
                    style = MaterialTheme.typography.body1,
                    color = Color.White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .animateContentSize(TweenSpec(300))
                        .padding(start = 16.dp, bottom = 16.dp)
                        .constrainAs(cardName) {
                            start.linkTo(parent.start)
                            bottom.linkTo(parent.bottom)
                        }
                )
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .constrainAs(expiryLabel) {
                            end.linkTo(parent.end)
                            bottom.linkTo(parent.bottom)
                        }
                ) {
                    Column(
                        modifier = Modifier.padding(bottom = 16.dp)
                    ) {
                        Text(
                            text = "EXPIRES",
                            style = MaterialTheme.typography.caption,
                            color = Color.White.copy(alpha = 0.5f),
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 16.dp)
                        )
                        Text(
                            text = "03 / 14",
                            style = MaterialTheme.typography.body1,
                            color = Color.White,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 16.dp)
                        )
                    }
                    Column(
                        modifier = Modifier.padding(bottom = 16.dp)
                    ) {
                        Text(
                            text = "CVV",
                            style = MaterialTheme.typography.caption,
                            color = Color.White.copy(alpha = 0.5f),
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 16.dp),
                            textAlign = TextAlign.End
                        )
                        Text(
                            text = "314",
                            style = MaterialTheme.typography.body1,
                            color = Color.White,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 16.dp),
                            textAlign = TextAlign.End
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardSelectorDefaultPreview() {
    CardSelector()
}

@Preview(showBackground = true)
@Composable
private fun MobileCardDefaultPreview() {
    MobileCard(CardType.Visa)
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileCards(CardType.Visa)
}