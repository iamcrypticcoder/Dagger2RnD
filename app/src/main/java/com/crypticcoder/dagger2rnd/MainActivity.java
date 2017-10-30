package com.crypticcoder.dagger2rnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crypticcoder.dagger2rnd.di.CarComponent;
import com.crypticcoder.dagger2rnd.di.DaggerCarComponent;
import com.crypticcoder.dagger2rnd.entities.Car;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject @Named("CarBugatti") Car mBugattiCar;
    @Inject @Named("CarFerrari") Car mFerrariCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        mBugattiCar.start();
        mFerrariCar.start();
    }
}
