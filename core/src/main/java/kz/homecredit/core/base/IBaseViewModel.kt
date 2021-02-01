package kz.homecredit.core.base

import androidx.lifecycle.ViewModel
import kz.homecredit.core.util.NetworkHelper

abstract class IBaseViewModel(private val networkHelper: NetworkHelper) : ViewModel() {

    protected fun isConnected(): Boolean = networkHelper.isNetworkConnected()

}
