package com.aaa.buglyapplication;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by  kingsley on 2019/7/26 0026.
 */

public class Myapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.UserStrategy strategy=new CrashReport.UserStrategy(this);
        strategy.setAppChannel("bug");
        strategy.setAppVersion("1.0");
        strategy.setAppPackageName("com.aaa.buglyapplication");
        CrashReport.initCrashReport(getApplicationContext(), "6656f69424", false,strategy);
    }
}
