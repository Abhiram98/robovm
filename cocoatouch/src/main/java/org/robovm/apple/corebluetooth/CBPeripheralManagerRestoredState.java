/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.corebluetooth;

/*<imports>*/
import java.util.*;

import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreBluetooth")/*</annotations>*/
@Marshaler(/*<name>*/CBPeripheralManagerRestoredState/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBPeripheralManagerRestoredState/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CBPeripheralManagerRestoredState toObject(Class<CBPeripheralManagerRestoredState> cls, long handle, long flags) {
            NSDictionary<NSString, NSObject> o = (NSDictionary<NSString, NSObject>) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CBPeripheralManagerRestoredState(o);
        }
        @MarshalsPointer
        public static long toNative(CBPeripheralManagerRestoredState o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CBPeripheralManagerRestoredState> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary<NSString, NSObject>> o = (NSArray<NSDictionary<NSString, NSObject>>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CBPeripheralManagerRestoredState> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CBPeripheralManagerRestoredState(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CBPeripheralManagerRestoredState> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary<NSString, NSObject>> array = new NSMutableArray<>();
            for (CBPeripheralManagerRestoredState i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CBPeripheralManagerRestoredState(NSDictionary<NSString, NSObject> data) {
        super(data);
    }
    /*</constructors>*/

    /*<methods>*/


    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSArray<CBMutableService> getServices() {
        NSString key = Keys.Services();
        if (data.containsKey(key)) {
            NSObject result = null;
            NSString key1 = Keys.Services();
            if (data.containsKey(key1)) {
                result = data.get(key1);
            }
            NSArray<CBMutableService> val = (NSArray<CBMutableService>) result;
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CBAdvertisementData getAdvertisementData() {
        NSString key = Keys.AdvertisementData();
        if (data.containsKey(key)) {
            NSObject result = null;
            NSString key1 = Keys.AdvertisementData();
            if (data.containsKey(key1)) {
                result = data.get(key1);
            }
            NSDictionary<NSString, NSObject> val = (NSDictionary<NSString, NSObject>) result;
            return new CBAdvertisementData(val);
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreBluetooth")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="CBPeripheralManagerRestoredStateServicesKey", optional=true)
        public static native NSString Services();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="CBPeripheralManagerRestoredStateAdvertisementDataKey", optional=true)
        public static native NSString AdvertisementData();
    }
    /*</keys>*/
}
