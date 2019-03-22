package com.example.zhensuyang.singleactivityapp

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import java.lang.IllegalArgumentException

open class BaseScreenView<S : Screen> : FrameLayout, ScreenView<S> {

    private var screen: S?  = null

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun setScreen(screen: S) {
        this.screen = screen
    }

    override fun getScreen(): S {
        if (screen == null) {
            throw IllegalArgumentException("Screen cannot be null")
        }
        return screen!!
    }
}