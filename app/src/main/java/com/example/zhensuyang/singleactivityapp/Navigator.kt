package com.example.zhensuyang.singleactivityapp

import android.app.Activity
import android.view.ViewGroup
import java.util.*

class Navigator(rootScreen: Screen) {

    private lateinit var activity: Activity
    private lateinit var viewContainer: ViewGroup

    private var backStack: Deque<Screen>
    private var rootScreen: Screen

    init {
        this.rootScreen = rootScreen
        backStack = LinkedList()
        backStack.push(rootScreen)
    }

    fun currentScreen(): Screen {
        checkNotNull(backStack.peek())
        return backStack.peek()
    }

    fun atRoot(): Boolean {
        return backStack.size == 1
    }
}