package ai.doubletapp.sample.navigation.feature3.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Feature3Args(
    val value: String,
) : Parcelable
