package ai.doubletapp.sample.navigation.feature1.di

import ai.doubletapp.sample.navigation.di.BaseApi
import ai.doubletapp.sample.navigation.feature1.Feature1Fragment

interface Feature1Api : BaseApi {

    fun inject(fragment: Feature1Fragment)
}
