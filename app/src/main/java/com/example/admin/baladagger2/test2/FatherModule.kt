package com.example.admin.baladagger2.test2

import dagger.Module
import dagger.Provides

/**
 * Created by zjw on 2018/10/16.
 */
@Module
class FatherModule {
    @Provides
    fun provideFataher():Father{
        return Father()
    }
}