package ai.doubletapp.sample.navigation.navigationimpl

import android.app.Activity
import android.app.Application
import android.os.Bundle
import java.lang.ref.WeakReference

class NavigationActivityProvider(application: Application) {

    private var activityReference: WeakReference<NavigationActivity>? = null

    fun get(): NavigationActivity? = activityReference?.get()

    init {
        registerActivityCallbacks(application)
    }

    private fun registerActivityCallbacks(application: Application) {
        application.registerActivityLifecycleCallbacks(
            object : Application.ActivityLifecycleCallbacks {
                override fun onActivityCreated(activity: Activity, p1: Bundle?) {
                    if (activity is NavigationActivity) {
                        activityReference = WeakReference(activity)
                    }
                }

                override fun onActivityDestroyed(activity: Activity) {
                    if (activity is NavigationActivity) {
                        activityReference = null
                    }
                }

                override fun onActivityResumed(p0: Activity) {
                    // Nothing to do here
                }

                override fun onActivityPaused(p0: Activity) {
                    // Nothing to do here
                }

                override fun onActivityStarted(p0: Activity) {
                    // Nothing to do here
                }

                override fun onActivityStopped(p0: Activity) {
                    // Nothing to do here
                }

                override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
                    // Nothing to do here
                }
            }
        )
    }
}
