package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature2.Feature2FragmentDirections
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2To3Args
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Args
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import androidx.navigation.NavController
import javax.inject.Inject
import javax.inject.Provider

internal class Feature2NavigationImpl @Inject constructor(
    private val navController: Provider<NavController>,
): NavigationApi<Feature2Directions> {

    override fun navigate(direction: Feature2Directions) {
        when (direction) {
            is Feature2Directions.ToFeature3 -> {
                navController.get().navigate(
                    Feature2FragmentDirections.fromFeature2ToFeature3(
                        args = direction.args.toFeature3Args(),
                    )
                )
            }
            is Feature2Directions.Up -> {
                navController.get().navigateUp()
            }
        }
    }

    companion object {
        private fun Feature2To3Args.toFeature3Args(): Feature3Args = Feature3Args(
            value = "$someArg2 : $someArg1"
        )
    }
}
