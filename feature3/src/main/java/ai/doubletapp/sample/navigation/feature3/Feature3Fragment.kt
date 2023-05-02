package ai.doubletapp.sample.navigation.feature3

import ai.doubletapp.sample.navigation.feature3.databinding.FragmentFeature3Binding
import ai.doubletapp.sample.navigation.feature3.di.Feature3ComponentHolder
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Args
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import javax.inject.Inject

class Feature3Fragment : Fragment() {

    private lateinit var binding: FragmentFeature3Binding

    private val args by getArgs<Feature3Args>()

    @Inject
    lateinit var navigationApi: NavigationApi<Feature3Directions>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFeature3Binding.inflate(inflater, container, false)
        setArgs()
        setClickListeners()
        return binding.root
    }

    override fun onAttach(context: Context) {
        Feature3ComponentHolder.get()
            .inject(this)
        super.onAttach(context)
    }

    override fun onDetach() {
        if (isRemoving) {
            Feature3ComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setArgs() {
        binding.args.text = getString(R.string.feature3_args, args.value)
    }

    private fun setClickListeners() {
        binding.run {
            buttonToFeature1.setOnClickListener {
                navigationApi.navigate(Feature3Directions.ToFeature1)
            }
            buttonBack.setOnClickListener {
                navigationApi.navigate(Feature3Directions.Up)
            }
        }
    }

    companion object {
        private const val ARGS_KEY = "args"

        private val noArgsException: IllegalArgumentException
            get() = IllegalArgumentException("No args provided")

        private val invalidArgsException: IllegalArgumentException
            get() = IllegalArgumentException("Invalid args")

        private fun <ARGS : Parcelable> Fragment.getArgs(): Lazy<ARGS> = lazy {
            (arguments?.takeIf { args -> !args.isEmpty } ?: throw noArgsException)
                .getParcelable<ARGS>(ARGS_KEY)
                ?: throw invalidArgsException
        }
    }
}
