/*
 * Copyright (c) 2016-present, lovebing.net.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package org.lovebing.reactnative.baidumap.module;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/**
 * Created by lovebing on 2016/10/28.
 */
abstract public class BaseModule extends ReactContextBaseJavaModule {

    protected ReactApplicationContext context;

    public BaseModule(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    /**
     *
     * @param eventName
     * @param params
     */
    protected void sendEvent(String eventName, WritableMap params) {
        context
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, params);
    }
}
