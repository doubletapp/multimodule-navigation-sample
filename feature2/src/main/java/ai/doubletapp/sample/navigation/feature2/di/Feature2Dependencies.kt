package ai.doubletapp.sample.navigation.feature2.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi

interface Feature2Dependencies : BaseDependencies {

    val navigationApi: NavigationApi<Feature2Directions>
}
