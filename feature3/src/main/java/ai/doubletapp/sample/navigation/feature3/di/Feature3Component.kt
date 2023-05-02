package ai.doubletapp.sample.navigation.feature3.di

import dagger.Component

@Component(
    dependencies = [Feature3Dependencies::class],
)
interface Feature3Component : Feature3Api {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: Feature3Dependencies,
        ): Feature3Component
    }
}
