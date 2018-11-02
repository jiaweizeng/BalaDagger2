package com.example.admin.baladagger2.test2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.admin.baladagger2.R

class Test2 : AppCompatActivity() {

   /* @Inject
    lateinit var person2: Person2*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
//        DaggerComponent2.builder().module2(Module2()).build().inject(this)
//        Log.d("eee=person2",""+person2.hashCode())

//        DaggerComponent2.builder().mainComponent(DaggerMainComponent.create()).build().inject(this)
//        val mainComponent = DaggerComponent2.builder().mainComponent(DaggerMainComponent.create())



    }
}
