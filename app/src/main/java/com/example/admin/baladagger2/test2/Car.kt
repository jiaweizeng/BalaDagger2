package com.example.admin.baladagger2.test2

import android.util.Log

/**
 * Created by zjw on 2018/10/16.
 */
class Car(val brand:String,val color:VehicleColor) {
    fun go(){
        Log.d("eee=car",brand+"go --color is"+color.color)
    }
}