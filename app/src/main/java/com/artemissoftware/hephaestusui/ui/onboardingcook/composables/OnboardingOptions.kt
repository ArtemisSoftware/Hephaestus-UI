package com.artemissoftware.hephaestusui.ui.onboardingcook.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
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
import com.artemissoftware.hephaestusui.ui.onboardingcook.models.OnboardingDetail
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun OnboardingOptions(
    onboardingDetail: OnboardingDetail,
    isLastPage: Boolean,
    onNextClick: () -> Unit,
){
    if(isLastPage){
        OnboardingStartOption(onboardingDetail = onboardingDetail)
    }
    else{
        OnboardingSkipOption(onboardingDetail, onNextClick = onNextClick)
    }
}



@Composable
private fun OnboardingSkipOption(
    onboardingDetail: OnboardingDetail,
    onNextClick: () -> Unit
) {

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
            onClick = onNextClick,
            border = BorderStroke(
                14.dp,
                onboardingDetail.mainColor
            ),
            shape = CircleShape,
            colors = ButtonDefaults.outlinedButtonColors(contentColor = onboardingDetail.mainColor),
            modifier = Modifier.size(65.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_right_arrow),
                contentDescription = "",
                tint = onboardingDetail.mainColor,
                modifier = Modifier.size(20.dp)
            )
        }
    }
    
}

@Preview(showBackground = true)
@Composable
private fun OnboardingSkipOptionPreview() {
    OnboardingSkipOption(OnboardingDetail.mockOnboardingDetailList[0], onNextClick = {})
}


@Composable
private fun OnboardingStartOption(onboardingDetail: OnboardingDetail) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){

        Button(
            onClick = {
                //show home screen
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = onboardingDetail.mainColor
            ),
            contentPadding = PaddingValues(vertical = 12.dp),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp
            )
        ) {
            Text(
                text = "Get Started",
                color = Color.White,
                fontSize = 16.sp
            )
        }

    }

}




@Preview(showBackground = true)
@Composable
private fun OnboardingStartOptionPreview() {
    OnboardingStartOption(OnboardingDetail.mockOnboardingDetailList[0])
}

