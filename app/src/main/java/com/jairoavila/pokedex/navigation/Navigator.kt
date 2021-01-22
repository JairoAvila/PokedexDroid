package com.jairoavila.pokedex.navigation

import androidx.navigation.NavController
import com.jairoavila.pokedex.MainNavGraphDirections

class Navigator {
    lateinit var navController: NavController

    fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.HomeFlow -> navController.navigate(MainNavGraphDirections.actionGlobalLoginNavGraph())
        NavigationFlow.DashboardFlow -> navController.navigate(MainNavGraphDirections.actionGlobalDashboardNavGraph())
    }
}