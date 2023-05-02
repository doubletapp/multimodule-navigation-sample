package ai.doubletapp.sample.navigation.feature2.di

import dagger.Component

@Component(
    dependencies = [Feature2Dependencies::class],
)
interface Feature2Component : Feature2Api {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: Feature2Dependencies,
        ): Feature2Component
    }
}
