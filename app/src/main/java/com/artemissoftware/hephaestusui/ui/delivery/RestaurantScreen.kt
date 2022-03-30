package com.artemissoftware.hephaestusui.ui.delivery

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.delivery.composables.BannerCard
import com.artemissoftware.hephaestusui.ui.delivery.composables.BottomBar
import com.artemissoftware.hephaestusui.ui.delivery.composables.DeliveryCategories
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.theme.FoodColor

@ExperimentalMaterialApi
@Composable
fun RestaurantHomeScreen(
    delivery: Delivery
/*navController: NavHostController*/
) {

//    val poppinsLight = Font(R.font.poppins_light)
//    val poppinsBold = Font(R.font.poppins_bold)

    Scaffold(
        topBar = {
            /*
            TopAppBar(
                backgroundColor = Color.White,
                elevation = 0.dp,
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Outlined.LocationOn,
                            contentDescription = "Location",
                            tint = FoodColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Pick Location",
                            fontFamily = FontFamily(poppinsBold),
                            fontSize = 16.sp
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { }
                    ) {
                        Icon(
                            Icons.Outlined.Person,
                            contentDescription = "Profile"
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = { }
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.four_dot),
                            contentDescription = "Navigation Menu",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
            )

             */
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
//            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            

            //Spacer(modifier = Modifier.height(15.dp))
            
            BannerCard(delivery = delivery)
            
            /*
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Categories",
                fontFamily = FontFamily(poppinsBold),
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth()
            )


             */
            Spacer(modifier = Modifier.height(24.dp))


            DeliveryCategories(delivery = delivery)


            Spacer(modifier = Modifier.height(24.dp))
            /*
Row(
    modifier = Modifier.padding(end = 25.dp)
) {
    Column(
        modifier = Modifier.weight(1f)
    ) {
        Text(
            text = "Popular Now",
            fontFamily = FontFamily(poppinsBold),
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
    Column(
        modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.End)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "View All",
                    fontFamily = FontFamily(poppinsLight),
                    color = ViewAllColor,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_arrow_circle_right_24),
                    contentDescription = "view all Image",
                    modifier = Modifier.size(20.dp),
                    colorFilter = ColorFilter.tint(ViewAllColor)
                )
            }
        }
    }
}
Spacer(modifier = Modifier.height(20.dp))
LazyRow{
    items(10) { index ->
        Card(
            modifier = Modifier
                .width(180.dp)
                .wrapContentHeight()
                .padding(start = 5.dp)
                .clickable {
                    navController.navigate("recipe_screen")
                },
            elevation = 5.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 20.dp)
            ) {
                Image(
                    painter = painterResource(
                        id = if (index % 2 == 0) {
                            R.drawable.burger
                        } else {
                            R.drawable.double_burger
                        }
                    ),
                    contentDescription = "Category Image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(120.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = when(index) {
                        0 -> "Beef Burger"
                        1 -> "Double Burger"
                        else -> "Cheese Burger"
                    },
                    fontFamily = FontFamily(poppinsBold),
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = when(index) {
                            0 -> "Cheesy"
                            1 -> "Beef"
                            else -> "Chilli"
                        },
                        fontFamily = FontFamily(poppinsLight),
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = painterResource(
                            id = if (index % 2 == 0) {
                                R.drawable.cheese
                            } else {
                                R.drawable.beef
                            }
                        ),
                        contentDescription = "Category Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                AndroidView(
                    factory = { context ->
                        TextView(context).apply {
                            text = if (index % 2 == 0) {
                                Html.fromHtml("<string><b><span style = \"color:#F54748\"><big>$ </big></span><span style = \"color:#000000\"><big><big>14.10</big></big></span></b></string>")
                            } else {
                                Html.fromHtml("<string><b><span style = \"color:#F54748\"><big>$ </big></span><span style = \"color:#000000\"><big><big>8.35</big></big></span></b></string>")
                            }
                        }
                    }
                )
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
    }
}

 */
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RestaurantHomeScreen(delivery = Delivery.getMock())
}
