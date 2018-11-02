package com.example.admin.baladagger2.test2

/**
 * Created by zjw on 2018/10/17.
 */
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }
    private object Holder {
        val instance = Single()
    }

    /*fun main(args:ArrayList<String>){
        Single.get()
    }*/
}