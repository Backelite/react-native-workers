package com.rnapp;

import android.os.Bundle;

import com.fabricio.vergal.RNWorkers.RNWorkersManager;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "rnapp";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RNWorkersManager.start(getMainComponentName());
        super.onCreate(savedInstanceState);
    }
}
