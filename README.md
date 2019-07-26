# bugly
使用步骤
1.在Module的build.gradle文件中添加依赖和属性配置：

dependencies {
     //其中latest.release指代最新Bugly NDK版本号，也可以指定明确的版本号，例如3.0
    compile 'com.tencent.bugly:crashreport:latest.release'
    //其中latest.release指代最新Bugly SDK版本号，也可以指定明确的版本号，例如2.2.0
    compile 'com.tencent.bugly:nativecrashreport:latest.release'
}
2.在Module的build.gradle文件中添加依赖和属性配置：

android {
    defaultConfig {
        ndk {
            // 设置支持的SO库架构
            abiFilters 'armeabi' //, 'x86', 'armeabi-v7a', 'x86_64', 'arm64-v8a'
        }
    }
}
3.配置权限
  <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.READ_LOGS" />
4. 在myapplication 中初始化

  CrashReport.UserStrategy strategy=new CrashReport.UserStrategy(this);
        strategy.setAppChannel("bug");
        strategy.setAppVersion("1.0");
        strategy.setAppPackageName("com.aaa.buglyapplication");//包名
        CrashReport.initCrashReport(getApplicationContext(), "注册时申请的APPID", false,strategy);
