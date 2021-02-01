package kz.homecredit.landing.deeplink

import androidx.navigation.navOptions
import kz.homecredit.core.navigator.NavigateTo
import kz.homecredit.core.navigator.fadeAnimation

object LandingDeeplink {
    private fun linkToEditProfile(source: String) = NavigateTo.DeepLink(
        "compose://edit-profile/$source",
        navOptions {
            fadeAnimation()
        }
    )

    fun deepLinkToEditProfile(source: String) = linkToEditProfile(source)
}