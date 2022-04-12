package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.BadgeColor
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.GreenColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun TransactionFilters() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Filter(title = "All")
        Filter(title = "Income", icon = R.drawable.arrow_down, color = GreenColor)
        Filter(title = "Expense", icon = R.drawable.arrow_up, color = BadgeColor)
    }
}


@Composable
private fun Filter(title: String) {
    
    Card(
        modifier = Modifier.padding(5.dp),
        elevation = 0.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            text = title,
            fontFamily = Poppins,
            color = BankColor,
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 5.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
private fun Filter(
    title: String,
    @DrawableRes icon: Int,
    color: Color
) {

    Card(
        modifier = Modifier.padding(5.dp),
        elevation = 0.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 5.dp)
                .alpha(0.4f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "Income",
                colorFilter = ColorFilter.tint(color)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = title,
                color = BankColor,
                fontFamily = Poppins,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FilterPreview() {
    Column {
        Filter(title = "All")
        Filter(title = "Income", icon = R.drawable.arrow_down, color = GreenColor)
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    TransactionFilters()
}