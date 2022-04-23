package com.artemissoftware.hephaestusui.ui.people.screens

import android.app.Person
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.artemissoftware.hephaestusui.ui.people.screens.composables.PersonCard
import com.artemissoftware.hephaestusui.ui.theme.Purple500

@Composable
fun PeopleScreen (peopleViewModel: PeopleViewModel) {

    val userListItem = peopleViewModel.people.collectAsLazyPagingItems()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {
            items(userListItem) { item ->
                item?.let {
                    PersonCard(it)
                }
            }
        }
    }

}