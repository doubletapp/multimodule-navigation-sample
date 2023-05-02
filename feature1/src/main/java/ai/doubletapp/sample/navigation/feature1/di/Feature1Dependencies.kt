package ai.doubletapp.sample.navigation.feature1.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi

interface Feature1Dependencies : BaseDependencies {

    val navigationApi: NavigationApi<Feature1Directions>
}
