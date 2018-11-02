package com.example.admin.baladagger2.test1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.admin.baladagger2.R
import com.example.admin.baladagger2.test2.BikeActivity
import com.example.admin.baladagger2.test2.CarActivity
import com.example.admin.baladagger2.test2.Test2
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var person: Person
    @Inject
    lateinit var bananaSet: Set<BananaBean>
    @Inject
    lateinit var setBananaBean: SetBananaBean

    @Inject
    lateinit var bananaByString: Map<String, BananaBean>
    @Inject
    lateinit var bananaByClass: Map<Class<*>, BananaBean>

    /*private val testActtivity by lazy {
        findViewById<Button>(R.id.btn_test2)
    }
    private val carActtivity by lazy {
        findViewById<Button>(R.id.btn_car)
    }
    private val bikeActtivity by lazy {
        findViewById<Button>(R.id.btn_bike)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainComponent.builder().module(Module()).build().injectMain(this)
        Log.d("eee=person", "" + person.hashCode())

//        DaggerBikeComponent.builder().bikeModule(BikeModule()).build().inject(this)
//        DaggerCarComponent.builder().carModule(CarModule()).build().inject(this)

        val build = DaggerMainComponent.builder().build()
        build.injectMain(this)

        val banana = build.setBanana()
        Log.d("eee=banana1", banana.toString())
        Log.d("eee=banana2", banana.toString())
        Log.d("eee=banana3", banana.toString())
        Log.d("eee=bananaSet", bananaSet.toString())
        Log.d("eee=setBananaBean", setBananaBean.toString())

        Log.d("eee=component string", build.bananaByString().toString())
        Log.d("eee=component class", build.bananaByClass().toString())
        Log.d("eee=Inject string", bananaByString.toString())
        Log.d("eee=Inject class", bananaByClass.toString())



    }

    fun mainClick(view:View){
        when(view.id){
            R.id.btn_test2->startActivity(Intent(this,Test2::class.java))
            R.id.btn_car->startActivity(Intent(this,CarActivity::class.java))
            else->startActivity(Intent(this,BikeActivity::class.java))
        }
    }
}
