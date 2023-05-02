package ai.doubletapp.sample.navigation.feature1.di

import ai.doubletapp.sample.navigation.di.BaseComponentHolder

object Feature1ComponentHolder : BaseComponentHolder<
    Feature1Api,
    Feature1Dependencies,
>() {

    override fun build(dependencies: Feature1Dependencies): Feature1Api =
        DaggerFeature1Component.factory().create(dependencies)
}
