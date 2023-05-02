package ai.doubletapp.sample.navigation.di

import javax.inject.Provider

abstract class BaseComponentHolder<
    COMPONENT: BaseApi,
    DEPENDENCIES: BaseDependencies
> {

    private var component: COMPONENT? = null

    private lateinit var dependencyProvider: Provider<DEPENDENCIES>

    protected abstract fun build(dependencies: DEPENDENCIES): COMPONENT

    fun get(): COMPONENT = component ?: build(dependencyProvider.get())
        .also { newComponent -> component = newComponent }

    fun init(provider: Provider<DEPENDENCIES>) {
        if (::dependencyProvider.isInitialized) {
            throw Exception("Component Holder should be initialized only once")
        }

        dependencyProvider = provider
    }

    fun clear() {
        component = null
    }
}
