package com.example.admin.baladagger2.test2

import com.example.admin.baladagger2.test1.MainComponent
import dagger.Component

/**
 * Created by zjw on 2018/9/3.
 */
@Component(modules = [Module2::class],dependencies = [MainComponent::class])
interface Component2 {
    fun inject(activity:Test2)
}