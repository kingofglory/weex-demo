package com.xgr.weexdemo;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/**
 * Created by king on 16/7/3.
 */
public class WXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WXEnvironment.addCustomOptions("appName","TBSample");
        WXSDKEngine.initialize(this,
                new InitConfig.Builder()
                        .setImgAdapter(new ImageAdapter())
//                        .setDebugAdapter(new PlayDebugAdapter())
                        .build()

        );
//        try {
//            WXSDKEngine.registerComponent("wtRichText", WTRichText.class);
//
//            WXSDKEngine.registerModule("event", WXEventModule.class);
//        } catch (WXException e) {
//            e.printStackTrace();
//        }

    }
}
