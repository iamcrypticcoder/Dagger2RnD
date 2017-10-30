package com.crypticcoder.dagger2rnd.entities;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by mahbub on 10/30/17.
 */

public class DrumBrake implements Brake {

    @Inject public DrumBrake() {

    }

    @Override
    public void pull() {
        Log.d("DrumBrake", "pull()");
    }
}
