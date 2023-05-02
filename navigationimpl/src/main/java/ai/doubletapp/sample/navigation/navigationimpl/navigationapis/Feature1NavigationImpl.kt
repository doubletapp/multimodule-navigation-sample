package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature1.Feature1FragmentDirections
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import androidx.navigation.NavController
import javax.inject.Inject
import javax.inject.Provider

internal class Feature1NavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
): NavigationApi<Feature1Directions> {

    override fun navigate(direction: Feature1Directions) {
        when (direction) {
            Feature1Directions.ToFeature2 -> {
                navController.get().navigate(
                    Feature1FragmentDirections.fromFeature1ToFeature2()
                )
            }
        }
    }
}
