package ai.doubletapp.sample.navigation.feature3.navigation

sealed interface Feature3Directions {

    object Up : Feature3Directions
    object ToFeature1 : Feature3Directions
}
