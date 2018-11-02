package com.example.admin.baladagger2.test2

import dagger.Module
import dagger.Provides



/**
 * Created by zjw on 2018/10/16.
 */
@Module(subcomponents = [BikeComponent::class])
class BrandModule {
    @Provides
    fun provideBrand(): Brand {
        return Brand("林肯加长版")
    }
}