package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.feature1.di.Feature1Dependencies
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.feature2.di.Feature2Dependencies
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.feature3.di.Feature3Dependencies
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.NavigationActivityProvider
import ai.doubletapp.sample.navigation.navigationimpl.di.NavigationImplComponentHolder
import ai.doubletapp.sample.navigation.navigationimpl.di.NavigationImplDependencies
import dagger.Module
import dagger.Provides

@Module
internal class AppModule {
    
    @Provides
    fun provideNavigationDependencies(
        activityProvider: NavigationActivityProvider,
    ): NavigationImplDependencies = object : NavigationImplDependencies {
        override val activityProvider: NavigationActivityProvider = activityProvider
    }
    
    @Provides
    fun provideFeature1Dependencies(): Feature1Dependencies =
        object : Feature1Dependencies {
            override val navigationApi: NavigationApi<Feature1Directions> =
                NavigationImplComponentHolder.get().feature1NavigationApi
        }
    
    @Provides
    fun provideFeature2Dependencies(): Feature2Dependencies =
        object : Feature2Dependencies {
            override val navigationApi: NavigationApi<Feature2Directions> =
                NavigationImplComponentHolder.get().feature2NavigationApi
        }
    
    @Provides
    fun provideFeature3Dependencies(): Feature3Dependencies =
        object : Feature3Dependencies {
            override val navigationApi: NavigationApi<Feature3Directions> =
                NavigationImplComponentHolder.get().feature3NavigationApi
        }
}
