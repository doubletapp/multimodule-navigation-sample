package ai.doubletapp.sample.navigation.feature3.di

import ai.doubletapp.sample.navigation.di.BaseComponentHolder

object Feature3ComponentHolder : BaseComponentHolder<
    Feature3Api,
    Feature3Dependencies,
>() {

    override fun build(dependencies: Feature3Dependencies): Feature3Api =
        DaggerFeature3Component.factory().create(dependencies)
}
