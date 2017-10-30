package com.crypticcoder.dagger2rnd.di;

import com.crypticcoder.dagger2rnd.MainActivity;

import dagger.Component;

/**
 * Created by mahbub on 10/30/17.
 */

@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
