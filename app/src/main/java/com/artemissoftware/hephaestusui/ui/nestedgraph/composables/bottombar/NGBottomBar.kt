package com.artemissoftware.hephaestusui.ui.nestedgraph.composables.bottombar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.artemissoftware.hephaestusui.ui.nestedgraph.models.BottomBarItem
import com.artemissoftware.hephaestusui.ui.nestedgraph.models.NGBottomBarTabs

@Composable
fun NGBottomBar(navController: NavHostController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    with(NGBottomBarTabs){

        val bottomBarDestination = TABS.any { it.route == currentDestination?.route }
        if (bottomBarDestination) {
            BottomNavigation {
                TABS.forEach { tab ->
                    AddItem(
                        item = tab,
                        currentDestination = currentDestination,
                        navController = navController
                    )
                }
            }
        }
    }

}

@Composable
fun RowScope.AddItem(
    item: BottomBarItem,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(text = item.title)
        },
        icon = {
            Icon(
                imageVector = item.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == item.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(item.route) {

                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}

