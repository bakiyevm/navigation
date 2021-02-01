package kz.homecredit.landing.ui

import androidx.hilt.lifecycle.ViewModelInject
import kz.homecredit.core.base.IBaseViewModel
import kz.homecredit.core.navigator.NavigateTo
import kz.homecredit.core.navigator.Navigator
import kz.homecredit.core.util.NetworkHelper

class LandingViewModel @ViewModelInject constructor(
    networkHelper: NetworkHelper,
    val navigator: Navigator,
) : IBaseViewModel(networkHelper) {

    fun goBack() {
        navigator.navigate(NavigateTo.Back)
    }

}