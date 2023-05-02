package ai.doubletapp.sample.navigation.feature1.di

import dagger.Component

@Component(
    dependencies = [Feature1Dependencies::class],
)
interface Feature1Component : Feature1Api {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: Feature1Dependencies,
        ): Feature1Component
    }
}
