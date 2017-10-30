package com.crypticcoder.dagger2rnd.entities;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by mahbub on 10/30/17.
 */

public class V8Engine implements Engine {

    @Inject public V8Engine() {

    }

    @Override
    public void spark() {
        Log.d("V8Engine", "spark()");
    }
}
