package com.example.admin.baladagger2.test1

import dagger.Module
import dagger.Provides

/**
 * Created by zjw on 2018/10/8.
 */
@Module
class Module {

    @Provides
    fun providePerson():Person{
        return Person()
    }
}