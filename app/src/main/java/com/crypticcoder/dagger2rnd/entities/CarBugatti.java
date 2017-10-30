package com.crypticcoder.dagger2rnd.entities;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by mahbub on 10/30/17.
 */

public class CarBugatti implements Car {

    private String mName;

    @Inject @Named("V8Engine") Engine mEngine;
    @Inject @Named("DiskBrake") Brake mBrake;

    @Inject public CarBugatti(String name) {
        mName = name;
    }

    @Override
    public void start() {
        mEngine.spark();
        Log.d("CarBugatti", "start()");
    }
}
