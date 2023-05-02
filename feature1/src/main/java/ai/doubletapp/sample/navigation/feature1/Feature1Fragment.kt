package ai.doubletapp.sample.navigation.feature1

import ai.doubletapp.sample.navigation.feature1.databinding.FragmentFeature1Binding
import ai.doubletapp.sample.navigation.feature1.di.Feature1ComponentHolder
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import javax.inject.Inject

class Feature1Fragment : Fragment() {

    private lateinit var binding: FragmentFeature1Binding

    @Inject
    lateinit var navigationApi: NavigationApi<Feature1Directions>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFeature1Binding.inflate(inflater, container, false)
        setClickListeners()
        return binding.root
    }

    override fun onAttach(context: Context) {
        Feature1ComponentHolder.get()
            .inject(this)
        super.onAttach(context)
    }

    override fun onDetach() {
        if (isRemoving) {
            Feature1ComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setClickListeners() {
        binding.button.setOnClickListener {
            navigationApi.navigate(Feature1Directions.ToFeature2)
        }
    }
}
