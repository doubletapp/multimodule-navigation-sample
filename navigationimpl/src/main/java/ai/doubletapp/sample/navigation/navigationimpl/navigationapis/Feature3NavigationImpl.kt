package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature3.Feature3FragmentDirections
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import androidx.navigation.NavController
import javax.inject.Inject
import javax.inject.Provider

internal class Feature3NavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
): NavigationApi<Feature3Directions> {

    override fun navigate(direction: Feature3Directions) {
        when (direction) {
            Feature3Directions.ToFeature1 -> {
                navController.get().navigate(
                    Feature3FragmentDirections.fromFeature3ToFeature1()
                )
            }
            Feature3Directions.Up -> {
                navController.get().navigateUp()
            }
        }
    }
}
