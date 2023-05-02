package ai.doubletapp.sample.navigation.navigationimpl.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.navigationimpl.NavigationActivityProvider

interface NavigationImplDependencies : BaseDependencies {

    val activityProvider: NavigationActivityProvider
}
