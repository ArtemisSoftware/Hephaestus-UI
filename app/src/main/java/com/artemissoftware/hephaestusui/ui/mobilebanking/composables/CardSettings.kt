package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.CardSetting
import com.artemissoftware.hephaestusui.ui.theme.GreenColor

@Composable
fun CardSettings(
    contactless: MutableState<Boolean>,
    payment: MutableState<Boolean>,
    atm: MutableState<Boolean>
) {

    Column {
        Text(
            text = "Card Settings",
            color = BankColor,
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.height(10.dp))


        CardOption(optionSelected = contactless, setting = CardSetting.getMockList()[0])
        Spacer(modifier = Modifier.height(10.dp))
        CardOption(optionSelected = payment, setting = CardSetting.getMockList()[1])
        Spacer(modifier = Modifier.height(10.dp))
        CardOption(optionSelected = atm, setting = CardSetting.getMockList()[2])
    }


}

@Composable
private fun CardOption(
    optionSelected: MutableState<Boolean>,
    setting: CardSetting
) {

    Card(
        modifier = Modifier.padding(5.dp),
        elevation = 0.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(0.1f),
                horizontalAlignment = Alignment.End
            ) {
                Icon(
                    painter = painterResource(id = setting.icon),
                    contentDescription = "Contactless",
                    tint = BankColor
                )
            }
            Text(
                text = setting.description,
                color = BankColor,
                modifier = Modifier
                    .weight(0.7f)
                    .padding(start = 15.dp),
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp
            )
            Switch(
                checked = optionSelected.value,
                onCheckedChange = { optionSelected.value = it },
                colors = SwitchDefaults.colors(GreenColor),
                modifier = Modifier.weight(0.2f)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun CardOptionDefaultPreview() {
    val contactless = remember { mutableStateOf(false) }
    CardOption(contactless, CardSetting.getMockList()[0])
}

@Preview(showBackground = true)
@Composable
private fun MobileCardDefaultPreview() {
    val contactless = remember { mutableStateOf(false) }
    val payment = remember { mutableStateOf(false) }
    val atm = remember { mutableStateOf(false) }
    CardSettings(contactless, payment, atm)
}