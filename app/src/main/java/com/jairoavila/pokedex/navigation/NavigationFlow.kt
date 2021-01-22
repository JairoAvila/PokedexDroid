package com.jairoavila.pokedex.navigation

sealed class NavigationFlow {
    object HomeFlow : NavigationFlow()
    object DashboardFlow : NavigationFlow()
}