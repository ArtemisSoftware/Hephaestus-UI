package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun MobileCardHeader() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Your Cards",
                color = BankColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Text(
                text = "1 Physical Card",
                color = BankColor.copy(alpha = 0.5f),
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "Menu",
                modifier = Modifier
                    .rotate(90f)
                    .size(35.dp)
                    .align(Alignment.End),
                tint = BankColor.copy(alpha = 0.6f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileCardHeader()
}