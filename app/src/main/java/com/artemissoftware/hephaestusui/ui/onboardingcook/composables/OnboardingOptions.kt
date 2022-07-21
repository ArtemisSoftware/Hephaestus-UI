package com.artemissoftware.hephaestusui.ui.onboardingcook.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun OnboardingSkipOption() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        
        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "Skip Now",
                color = Color(0xFF292D32),
                fontFamily = Poppins,
                textAlign = TextAlign.Right,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }


        OutlinedButton(
            onClick = { /* Do something! */ },
            border = BorderStroke(
                14.dp,
                Color(0xFF292D32)//                item[pagerState.currentPage].mainColor
            ),
            shape = CircleShape,
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red/*item[pagerState.currentPage].mainColor*/),
            modifier = Modifier.size(65.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_right_arrow),
                contentDescription = "",
//                tint = item[pagerState.currentPage].mainColor,
                modifier = Modifier.size(20.dp)
            )
        }
    }
    
}

@Preview(showBackground = true)
@Composable
private fun OnboardingSkipOptionPreview() {
    OnboardingSkipOption()
}
