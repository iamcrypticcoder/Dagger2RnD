package com.crypticcoder.dagger2rnd.di;

import com.crypticcoder.dagger2rnd.entities.Brake;
import com.crypticcoder.dagger2rnd.entities.CarBugatti;
import com.crypticcoder.dagger2rnd.entities.Car;
import com.crypticcoder.dagger2rnd.entities.CarFerrari;
import com.crypticcoder.dagger2rnd.entities.DiskBrake;
import com.crypticcoder.dagger2rnd.entities.DrumBrake;
import com.crypticcoder.dagger2rnd.entities.Engine;
import com.crypticcoder.dagger2rnd.entities.V8Engine;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mahbub on 10/30/17.
 */

@Module
public class CarModule {

    @Provides
    @Named("CarBugatti")
    public Car provideBugattiCar(CarBugatti bugatti) {
        return bugatti;
    }

    @Provides
    @Named("CarFerrari")
    public Car provideFerrariCar(CarFerrari ferrari) {
        return ferrari;
    }

    @Provides
    @Named("V8Engine")
    public Engine provideV8Engine(V8Engine v8Engine) {
        return v8Engine;
    }

    @Provides
    @Named("DiskBrake")
    public Brake provideDiskBrake(DiskBrake brake) {
        return brake;
    }

    @Provides
    @Named("DrumBrake")
    public Brake provideDrumBrake(DrumBrake brake) {
        return brake;
    }

    @Provides
    public String provideCarName() {
        return "Mahbub";
    }
}
