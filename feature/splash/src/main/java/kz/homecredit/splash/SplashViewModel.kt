package kz.homecredit.splash

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import kz.homecredit.core.base.IBaseViewModel
import kz.homecredit.core.navigator.Navigator
import kz.homecredit.core.util.NetworkHelper
import kz.homecredit.splash.SplashDeeplink.deepLinkToLandingFragment
import kz.homecredit.splash.SplashDeeplink.linkToLandingActivity


class SplashViewModel @ViewModelInject constructor(
    networkHelper: NetworkHelper,
    val navigator: Navigator,
) : IBaseViewModel(networkHelper) {

    fun navigateToLandingFragment() {
        navigator.navigate(deepLinkToLandingFragment())
    }

    fun navigateToLandingActivity(context: Context) {
        navigator.navigate(linkToLandingActivity(context))
    }
}