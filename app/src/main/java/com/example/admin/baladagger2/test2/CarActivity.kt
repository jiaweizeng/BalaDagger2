package com.example.admin.baladagger2.test2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

/**
 * Created by zjw on 2018/10/16.
 */
class CarActivity: AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerCarComponent.builder().colorComponent(DaggerColorComponent.create()).build().inject(this)
        car.go()
    }
}