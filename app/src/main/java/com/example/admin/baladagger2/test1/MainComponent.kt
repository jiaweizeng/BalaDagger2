package com.example.admin.baladagger2.test1

import com.example.admin.baladagger2.test2.Father
import com.example.admin.baladagger2.test2.FatherModule
import dagger.Component

/**
 * Created by zjw on 2018/9/3.
 */
@Component(modules = [Module::class,FruitModule::class,DrinkModule::class,MultiModule::class,FatherModule::class])
interface MainComponent{
    fun injectMain(activity: MainActivity)
    fun setBanana():Set<BananaBean>

//    fun bananaBean():SetBananaBean

    fun bananaByString():Map<String,BananaBean>
    fun bananaByClass():Map<Class<*>,BananaBean>

    fun  getMain(): Father
}
