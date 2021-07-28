package com.example.test;

import android.app.Application;

import com.moengage.core.LogLevel;
import com.moengage.core.MoEngage;
import com.moengage.core.config.LogConfig;

import static com.moengage.core.LogLevel.VERBOSE;

public class MyAPP extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        MoEngage moEngage = new MoEngage.Builder(this,"I4ILKCE47727347O6LER1P85")
                .configureLogs( new LogConfig(
                      LogLevel.VERBOSE, true
                        )
                )
                .build();
        MoEngage.initialise(moEngage);
    }
}
