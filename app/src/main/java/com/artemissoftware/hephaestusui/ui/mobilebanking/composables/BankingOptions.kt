package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins


@Composable
fun BankingOptions() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {

        BankingOption(modifier = Modifier.weight(1f), icon = R.drawable.send, title = "Send")
        BankingOption(modifier = Modifier.weight(1f), icon = R.drawable.request, title = "Request")
        BankingOption(modifier = Modifier.weight(1f), icon = R.drawable.loan, title = "Loan")
        BankingOption(modifier = Modifier.weight(1f), icon = R.drawable.top_up, title = "TopUp")
    }
}

@Composable
private fun BankingOption(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    title: String
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .size(65.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "icon",
                modifier = Modifier.size(35.dp),
                colorFilter = ColorFilter.tint(BankColor)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = title,
            color = Color.White.copy(alpha = 0.5f),
            fontFamily = Poppins,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun BankingOptionPreview() {
    BankingOption(modifier = Modifier, icon = R.drawable.send, title = "Send")
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BankingOptions()
}