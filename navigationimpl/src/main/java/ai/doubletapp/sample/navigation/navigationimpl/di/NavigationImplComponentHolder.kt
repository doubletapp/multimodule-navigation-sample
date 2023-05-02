package ai.doubletapp.sample.navigation.navigationimpl.di

import ai.doubletapp.sample.navigation.di.BaseComponentHolder

object NavigationImplComponentHolder : BaseComponentHolder<
    NavigationImplApi,
    NavigationImplDependencies,
>() {

    override fun build(dependencies: NavigationImplDependencies): NavigationImplApi =
        DaggerNavigationImplComponent.factory().create(dependencies)
}
