package com.example.admin.baladagger2.test2

import dagger.Component

/**
 * Created by zjw on 2018/10/16.
 */
@Component(modules =[ BrandModule::class])
interface BrandComponent {
    fun inject(activity: BikeActivity)

    fun supplyBikeComponentBuild():BikeComponent.Builder
}