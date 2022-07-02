package com.okihita.offlinecachingremotemediator.screens.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.okihita.offlinecachingremotemediator.navigation.Screen
import com.okihita.offlinecachingremotemediator.screens.common.ListContent

@ExperimentalPagingApi
@ExperimentalCoilApi
@Composable
fun HomeScreen(
    navHostController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {

    val getAllImages = homeViewModel.getAllImages.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            HomeTopBar {
                navHostController.navigate(Screen.Search.route)
            }
        },
        content = {
            ListContent(items = getAllImages)
        }
    )
}