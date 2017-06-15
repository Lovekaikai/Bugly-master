package com.example.yhdj.ad0410bugly;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "cd19e7e40e", true);
    }
}
