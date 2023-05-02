package ai.doubletapp.sample.navigation.navigationimpl.di

import dagger.Component

@Component(
    modules = [NavigationImplModule::class],
    dependencies = [NavigationImplDependencies::class],
)
interface NavigationImplComponent : NavigationImplApi {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: NavigationImplDependencies,
        ): NavigationImplComponent
    }
}
