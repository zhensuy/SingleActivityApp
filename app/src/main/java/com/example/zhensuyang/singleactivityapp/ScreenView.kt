package com.example.zhensuyang.singleactivityapp

interface ScreenView<S: Screen> {

    fun setScreen(screen: S)

    fun getScreen(): S
}