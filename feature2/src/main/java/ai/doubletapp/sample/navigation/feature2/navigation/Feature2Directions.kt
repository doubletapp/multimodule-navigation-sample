package ai.doubletapp.sample.navigation.feature2.navigation

sealed interface Feature2Directions {

    object Up : Feature2Directions
    data class ToFeature3(val args: Feature2To3Args) : Feature2Directions
}
