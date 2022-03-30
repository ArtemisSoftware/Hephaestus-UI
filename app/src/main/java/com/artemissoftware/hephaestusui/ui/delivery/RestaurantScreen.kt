package com.artemissoftware.hephaestusui.ui.delivery

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.delivery.composables.*
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.theme.FoodColor

@ExperimentalMaterialApi
@Composable
fun RestaurantHomeScreen(
    delivery: Delivery,
    navController: NavHostController
) {

    Scaffold(
        topBar = {
            DeliveryTopBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                shape = RoundedCornerShape(50),
                backgroundColor = FoodColor,
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    tint = Color.White,
                    contentDescription = "Search"
                )
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = { BottomBar() }
    ) {
        
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            
            BannerCard(delivery = delivery)

            Spacer(modifier = Modifier.height(24.dp))

            DeliveryCategories(delivery = delivery)

            Spacer(modifier = Modifier.height(24.dp))

            PopularNow(popularDelivery = delivery.popularDelivery, navController = navController)

        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    val navController = rememberNavController()
    RestaurantHomeScreen(delivery = Delivery.getMock(), navController)
}
