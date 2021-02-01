package kz.homecredit.splash

import android.content.Context
import androidx.navigation.navOptions
import kz.homecredit.core.navigator.NavigateTo
import kz.homecredit.core.navigator.fadeAnimation

object SplashDeeplink {

    private val deepLinkToLandingFragment = NavigateTo.DeepLink(
        "compose://landing",
        navOptions {
            fadeAnimation()
        }
    )

    fun deepLinkToLandingFragment() = deepLinkToLandingFragment

    fun linkToLandingActivity(context: Context) = NavigateTo.ActivityLink(
        context,
        "kz.homecredit.landing.ui.LandingActivity"
    )
}
