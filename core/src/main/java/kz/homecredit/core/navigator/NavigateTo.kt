package kz.homecredit.core.navigator

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.annotation.IdRes
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions

/**
 * Defines ways of navigating to destination.
 */
sealed class NavigateTo {

    /**
     * To navigate back in back-stack.
     */
    object Back : NavigateTo()

    /**
     * To navigate back to specific destination in back-stack.
     *
     * @param destinationId The topmost destination to retain
     * @param inclusive Whether the given destination should also be popped.
     */
    data class BackTo(
        @IdRes val destinationId: Int,
        val inclusive: Boolean
    ) : NavigateTo()

    /**
     * To navigate using the type-safe [NavDirections]. Use it to navigate between screens within a module. To
     * navigate between modules use [DeepLink].
     */
    data class Action(val direction: NavDirections) : NavigateTo()

    /**
     * To navigate using deep-link in [Uri] format.
     */
    data class DeepLink(
        val uri: String,
        val navOptions: NavOptions? = null
    ) : NavigateTo() {

        fun uri(): Uri = Uri.parse(uri)
    }

    data class ActivityLink(
        val context: Context,
        val className: String
    ) : NavigateTo() {
        fun intent(): Intent = Intent().apply {
            setClassName(context, className)
        }
    }
}
