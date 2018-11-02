package com.example.admin.baladagger2.test1

import javax.inject.Inject

/**
 * Created by zjw on 2018/10/9.
 */
class SetBananaBean @Inject constructor(val set:Set<BananaBean>) {

    override fun toString(): String {
        return super.toString()
    }
}