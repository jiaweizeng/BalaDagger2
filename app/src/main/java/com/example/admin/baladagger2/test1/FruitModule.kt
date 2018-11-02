package com.example.admin.baladagger2.test1

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

/**
 * Created by zjw on 2018/10/9.
 */
@Module
class FruitModule {
    @Provides
    @IntoSet
    fun providerBanana(): BananaBean {
        return BananaBean("特朗普--香蕉")
    }
}