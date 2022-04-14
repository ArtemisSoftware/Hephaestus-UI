package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.mobilebanking.navigation.Screen
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun BottomBar(navController: NavHostController) {

    BottomNavigation(
        backgroundColor = Color.White,
        elevation = 0.dp
    ) {
        BottomNavigationItem(
            selected = true,
            onClick = { navController.navigate(Screen.Home.route) },
            alwaysShowLabel = true,
            icon = {
                Icon(
                    Icons.Outlined.Home,
                    contentDescription = "Home",
                    tint = BankColor
                )
            },
            label = {
                Text(
                    text = "Home",
                    fontSize = 10.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    color = BankColor
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = { },
            alwaysShowLabel = true,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_history_toggle_off),
                    contentDescription = "History",
                    tint = BankColor
                )
            },
            label = {
                Text(
                    text = "History",
                    fontSize = 10.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    color = BankColor
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = { },
            alwaysShowLabel = true,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.addition),
                    contentDescription = "Add",
                    tint = BankColor,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = { navController.navigate(Screen.Cards.route) },
            alwaysShowLabel = true,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.cards),
                    contentDescription = "Cards",
                    tint = BankColor
                )
            },
            label = {
                Text(
                    text = "Cards",
                    fontSize = 10.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    color = BankColor
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = { },
            alwaysShowLabel = true,
            icon = {
                Icon(
                    Icons.Outlined.Person,
                    contentDescription = "Profile",
                    tint = BankColor
                )
            },
            label = {
                Text(
                    text = "Profile",
                    fontSize = 10.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    color = BankColor
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    val navController = rememberNavController()
    BottomBar(navController)
}