package ai.doubletapp.sample.navigation.navigationimpl.di

import ai.doubletapp.sample.navigation.di.BaseApi
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi

interface NavigationImplApi : BaseApi {

    val feature1NavigationApi: NavigationApi<Feature1Directions>

    val feature2NavigationApi: NavigationApi<Feature2Directions>

    val feature3NavigationApi: NavigationApi<Feature3Directions>
}
