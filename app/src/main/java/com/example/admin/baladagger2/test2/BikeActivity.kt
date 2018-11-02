package com.example.admin.baladagger2.test2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

/**
 * Created by zjw on 2018/10/16.
 */
class BikeActivity: AppCompatActivity() {
    @Inject
    lateinit var brand: Brand
     inline fun onlyif(isDebug: Boolean, block: () -> Unit) {
        if (isDebug) block()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val brandComponent = DaggerBrandComponent.builder().build()
        brandComponent.inject(this)

        val supplyBike = brandComponent.supplyBikeComponentBuild().build().supplyBike()
        supplyBike.go()
        Log.d("eee=brand",brand.toString())


        val runnable = Runnable {
            println("Runnable::run")
        }
        val function: () -> Unit
        function = runnable::run

        onlyif(true,function)


    }


}