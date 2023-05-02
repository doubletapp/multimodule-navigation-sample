package ai.doubletapp.sample.navigation

import ai.doubletapp.sample.navigation.navigationimpl.NavigationActivity
import ai.doubletapp.sample.navigation.navigationimpl.NavigationFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

internal class MainActivity : AppCompatActivity(), NavigationActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getNavigationFragment(): NavigationFragment? = supportFragmentManager.fragments
        .filterIsInstance<NavigationFragment>()
        .firstOrNull()
}
