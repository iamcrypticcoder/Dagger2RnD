package com.crypticcoder.dagger2rnd.entities;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by mahbub on 10/30/17.
 */

public class DiskBrake implements Brake {

    @Inject public DiskBrake() {

    }

    @Override
    public void pull() {
        Log.d("DiskBrake", "pull()");
    }
}
