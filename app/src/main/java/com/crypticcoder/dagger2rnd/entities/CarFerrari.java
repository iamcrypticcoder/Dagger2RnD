package com.crypticcoder.dagger2rnd.entities;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by mahbub on 10/30/17.
 */

public class CarFerrari implements Car {

    private String mName;
    @Inject @Named("V8Engine") Engine mEngine;
    @Inject @Named("DiskBrake") Brake mBrake;

    @Inject public CarFerrari(String name) {
        mName = name;
    }

    @Override
    public void start() {

    }
}
