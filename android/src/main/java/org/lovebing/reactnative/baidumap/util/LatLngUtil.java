/*
 * Copyright (c) 2016-present, lovebing.net.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package org.lovebing.reactnative.baidumap.util;

import com.baidu.mapapi.model.LatLng;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import org.lovebing.reactnative.baidumap.constant.LocationDataKey;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lovebing Created on Dec 09, 2018
 */
public class LatLngUtil {

    public static LatLng fromReadableMap(ReadableMap readableMap) {
        if (!readableMap.hasKey(LocationDataKey.LATITUDE) || !readableMap.hasKey(LocationDataKey.LONGITUDE)) {
            return null;
        }
        return new LatLng(readableMap.getDouble(LocationDataKey.LATITUDE), readableMap.getDouble(LocationDataKey.LONGITUDE));
    }

    public static List<LatLng> fromReadableArray(ReadableArray readableArray) {
        List<LatLng> list = new ArrayList<>();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            list.add(fromReadableMap(readableArray.getMap(i)));
        }
        return list;
    }
}
