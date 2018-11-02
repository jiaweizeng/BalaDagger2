package com.example.admin.baladagger2.test2;

import dagger.Component;

/**
 * Created by zjw on 2018/10/16.
 */
@Component(modules = CarModule.class, dependencies = ColorComponent.class)
public interface CarComponent {
    void inject(CarActivity activity);
}

