package ai.doubletapp.sample.navigation.feature2.di

import ai.doubletapp.sample.navigation.di.BaseComponentHolder

object Feature2ComponentHolder : BaseComponentHolder<
    Feature2Api,
    Feature2Dependencies,
>() {

    override fun build(dependencies: Feature2Dependencies): Feature2Api =
        DaggerFeature2Component.factory().create(dependencies)
}
