package ai.doubletapp.sample.navigation.feature3.di

import ai.doubletapp.sample.navigation.di.BaseApi
import ai.doubletapp.sample.navigation.feature3.Feature3Fragment

interface Feature3Api : BaseApi {

    fun inject(fragment: Feature3Fragment)
}
