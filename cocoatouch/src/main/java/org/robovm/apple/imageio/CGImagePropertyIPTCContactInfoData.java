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
package org.robovm.apple.imageio;

/*<imports>*/
import java.util.*;

import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
@Marshaler(/*<name>*/CGImagePropertyIPTCContactInfoData/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyIPTCContactInfoData/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyIPTCContactInfoData toObject(Class<CGImagePropertyIPTCContactInfoData> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGImagePropertyIPTCContactInfoData(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyIPTCContactInfoData o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyIPTCContactInfoData> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyIPTCContactInfoData> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGImagePropertyIPTCContactInfoData(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyIPTCContactInfoData> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyIPTCContactInfoData i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CGImagePropertyIPTCContactInfoData(CFDictionary data) {
        super(data);
    }
    public CGImagePropertyIPTCContactInfoData() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CGImagePropertyIPTCContactInfo property) {
        return data.containsKey(property.value());
    }

    /*</methods>*/
    public String getString(CGImagePropertyIPTCContactInfo property) {
        if (has(property)) {
            CFString val = null;
            if (has(property)) {
                val = data.get(property.value(), CFString.class);
            }
            return val.toString();
        }
        return null;
    }
    public double getNumber(CGImagePropertyIPTCContactInfo property) {
        if (has(property)) {
            CFNumber val = null;
            if (has(property)) {
                val = data.get(property.value(), CFNumber.class);
            }
            return val.doubleValue();
        }
        return 0;
    }
    public CGImagePropertyIPTCContactInfoData set(CGImagePropertyIPTCContactInfo property, String value) {
        NativeObject value1 = new CFString(value);
        data.put(property.value(), value1);
        return this;
    }
    public CGImagePropertyIPTCContactInfoData set(CGImagePropertyIPTCContactInfo property, double value) {
        NativeObject value1 = CFNumber.valueOf(value);
        data.put(property.value(), value1);
        return this;
    }
    
    /*<keys>*/
    /*</keys>*/
}
