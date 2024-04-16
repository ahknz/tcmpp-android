package com.yunsimon.miniapp;

import android.app.Application;

import com.tencent.tmf.mini.api.bean.MiniInitConfig;
import com.tencent.tmf.mini.api.proxy.MiniConfigProxy;
import com.tencent.tmfmini.sdk.annotation.ProxyService;

@ProxyService(proxy = MiniConfigProxy.class)
public class DemoMiniConfigProxyImpl extends MiniConfigProxy {
    /**
     * 应用Application
     * @return
     */
    @Override
    public Application getApp() {
        return MainApplication.mApplication;
    }

    /**
     * 创建初始化配置信息
     * @return
     */
    @Override
    public MiniInitConfig buildConfig() {
        MiniInitConfig.Builder builder = new MiniInitConfig.Builder();
        MiniInitConfig config = builder.configAssetName("tcmpp-android-configurations.json")//assets中配置文件名称
                .userX5Core(true)
                .debug(true)//日志开关，默认关闭的
                .build();
        return config;
    }
}