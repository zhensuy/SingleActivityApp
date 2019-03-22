package com.example.zhensuyang.singleactivityapp

import android.content.Context
import android.util.AttributeSet

class HomeView : BaseScreenView<HomeScreen> {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}