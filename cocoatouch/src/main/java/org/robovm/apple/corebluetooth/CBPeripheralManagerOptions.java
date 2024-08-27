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
@Marshaler(/*<name>*/CBPeripheralManagerOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBPeripheralManagerOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CBPeripheralManagerOptions toObject(Class<CBPeripheralManagerOptions> cls, long handle, long flags) {
            NSDictionary<NSString, NSObject> o = (NSDictionary<NSString, NSObject>) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CBPeripheralManagerOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CBPeripheralManagerOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CBPeripheralManagerOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary<NSString, NSObject>> o = (NSArray<NSDictionary<NSString, NSObject>>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CBPeripheralManagerOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CBPeripheralManagerOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CBPeripheralManagerOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary<NSString, NSObject>> array = new NSMutableArray<>();
            for (CBPeripheralManagerOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CBPeripheralManagerOptions(NSDictionary<NSString, NSObject> data) {
        super(data);
    }
    public CBPeripheralManagerOptions() {}
    /*</constructors>*/

    /*<methods>*/


    /**
     * @since Available in iOS 7.0 and later.
     */
    public boolean isShowingPowerAlert() {
        NSString key = Keys.ShowPowerAlert();
        if (data.containsKey(key)) {
            NSObject result = null;
            NSString key1 = Keys.ShowPowerAlert();
            if (data.containsKey(key1)) {
                result = data.get(key1);
            }
            NSNumber val = (NSNumber) result;
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CBPeripheralManagerOptions setShowPowerAlert(boolean showAlert) {
        NSString key = Keys.ShowPowerAlert();
        NSObject value = NSNumber.valueOf(showAlert);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public String getRestoreIdentifier() {
        NSString key = Keys.RestoreIdentifier();
        if (data.containsKey(key)) {
            NSObject result = null;
            NSString key1 = Keys.RestoreIdentifier();
            if (data.containsKey(key1)) {
                result = data.get(key1);
            }
            NSString val = (NSString) result;
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CBPeripheralManagerOptions setRestoreIdentifier(String identifier) {
        NSString key = Keys.RestoreIdentifier();
        NSObject value = new NSString(identifier);
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreBluetooth")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="CBPeripheralManagerOptionShowPowerAlertKey", optional=true)
        public static native NSString ShowPowerAlert();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="CBPeripheralManagerOptionRestoreIdentifierKey", optional=true)
        public static native NSString RestoreIdentifier();
    }
    /*</keys>*/
}
