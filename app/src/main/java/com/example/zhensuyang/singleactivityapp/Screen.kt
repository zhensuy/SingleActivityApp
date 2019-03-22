package com.example.zhensuyang.singleactivityapp

import android.app.Activity
import android.view.ViewGroup

abstract class Screen<V> where V : ViewGroup,
                               V : ScreenView {

    private lateinit var activity: Activity
    private lateinit var navigator: Navigator

    fun createView(activity: Activity, navigator: Navigator) {
        this.activity = activity
        this.navigator = navigator
    }

    fun onHide() {}

    fun onShow() {}

    fun onResume() {}

    fun onPause() {}

}