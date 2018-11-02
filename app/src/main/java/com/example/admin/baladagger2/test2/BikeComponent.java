package com.example.admin.baladagger2.test2;

import dagger.Subcomponent;

/**
 * Created by zjw on 2018/10/16.
 */
@Subcomponent(modules = BikeModule.class)
public interface BikeComponent {

    Bike supplyBike();

    @Subcomponent.Builder
    interface Builder{
        Builder bikeModule(BikeModule module);

        BikeComponent build();
    }
}

