package ai.doubletapp.sample.navigation.feature2.di

import ai.doubletapp.sample.navigation.di.BaseApi
import ai.doubletapp.sample.navigation.feature2.Feature2Fragment

interface Feature2Api : BaseApi {

    fun inject(fragment: Feature2Fragment)
}
