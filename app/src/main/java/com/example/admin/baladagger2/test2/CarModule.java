package com.example.admin.baladagger2.test2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zjw on 2018/10/16.
 */
@Module
public class CarModule {
    @Provides
    Car provideCar(VehicleColor color){
        return new Car("兰博基尼",color);
    }
}
