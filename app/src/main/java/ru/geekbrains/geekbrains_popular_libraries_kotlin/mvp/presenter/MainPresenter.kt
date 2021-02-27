package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.presenter

import ru.geekbrains.geekbrains_popular_libraries_kotlin.R
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.CountersModel
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.view.MainView

class MainPresenter(val mainView: MainView) {

    val model = CountersModel()

    fun counterOneClick() {
        val nextValue = model.next(0)
        mainView.setOneButtonText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(1)
        mainView.setTwoButtonText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(2)
        mainView.setThreeButtonText(nextValue.toString())
    }
}