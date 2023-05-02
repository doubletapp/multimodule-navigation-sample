package ai.doubletapp.sample.navigation.feature3.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi

interface Feature3Dependencies : BaseDependencies {

    val navigationApi: NavigationApi<Feature3Directions>
}
