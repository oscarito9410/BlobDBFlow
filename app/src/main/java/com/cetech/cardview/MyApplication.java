package com.cetech.cardview;

import com.facebook.stetho.Stetho;
import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by oemy9 on 10/02/2018.
 */

public class MyApplication extends android.app.Application {
    @Override
    public void onCreate () {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());
        Stetho.initializeWithDefaults(this);
    }
}
