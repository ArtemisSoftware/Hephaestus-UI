package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@ExperimentalMaterialApi
@Composable
fun BottomBar(){

    BottomAppBar(
        backgroundColor = Color.White,
        cutoutShape = RoundedCornerShape(50),
        elevation = 0.dp,
    ) {

        BottomNavigation(
            backgroundColor = Color.White,
            elevation = 0.dp
        ) {

            BottomNavigationItem(
                selected = true,
                onClick = { },
                icon = {
                    Icon(
                        Icons.Outlined.Home,
                        contentDescription = "Home"
                    )
                },
                selectedContentColor = FoodColor,
                unselectedContentColor = Color.LightGray
            )


            BottomNavigationItem(
                selected = false,
                onClick = { },
                icon = {
                    Icon(
                        Icons.Outlined.FavoriteBorder,
                        contentDescription = "Favorite"
                    )
                },
                selectedContentColor = FoodColor,
                unselectedContentColor = Color.LightGray
            )


            Spacer(modifier = Modifier.weight(1f, true))

            BottomNavigationItem(
                selected = false,
                onClick = { },
                icon = {
                    Icon(
                        Icons.Outlined.Notifications,
                        contentDescription = "Notifications"
                    )
                },
                selectedContentColor = FoodColor,
                unselectedContentColor = Color.LightGray
            )

            BottomNavigationItem(
                selected = false,
                onClick = { },
                icon = {

                    BadgedBox(
                        badge = {
                            Badge(
                                backgroundColor = FoodColor

                                ) {
                                Text(
                                    text = "5",
                                    color = Color.White,
                                    fontFamily = Poppins,
                                    fontWeight = FontWeight.Light,
                                )
                            }
                        }
                    ) {
                        Icon(
                            Icons.Outlined.ShoppingCart,
                            contentDescription = "Cart"
                        )
                    }


//                    BadgedBox(
//                        modifier = Modifier.background(FoodColor),
//                        badgeContent = {
//                            Text(
//                                text = "5",
//                                color = Color.White,
//                                fontFamily = Poppins,
//                                fontWeight = FontWeight.Light,
//                                modifier = Modifier.align(Alignment.CenterVertically)
//                            )
//                        }
//                    ) {
//                        Icon(
//                            Icons.Outlined.ShoppingCart,
//                            contentDescription = "Cart"
//                        )
//                    }
                },
                selectedContentColor = FoodColor,
                unselectedContentColor = Color.LightGray
            )
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BottomBar()
}