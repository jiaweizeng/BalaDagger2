package com.example.admin.baladagger2.test2

import dagger.Module
import dagger.Provides

/**
 * Created by zjw on 2018/9/3.
 */
@Module
class Module2 {
    @Provides
    fun provideTest2():Person2{
        return Person2()
    }
}