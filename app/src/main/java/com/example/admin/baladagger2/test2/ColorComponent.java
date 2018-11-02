package com.example.admin.baladagger2.test2;

import dagger.Component;

/**
 * Created by zjw on 2018/10/16.
 */
@Component(modules = ColorModule.class)
public interface ColorComponent {
    // 把颜色提供出来, 如果我不分享，那边其他人拿不到
    VehicleColor carColor();
}
