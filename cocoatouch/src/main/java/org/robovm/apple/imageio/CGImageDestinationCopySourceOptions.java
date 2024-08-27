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
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
@Marshaler(/*<name>*/CGImageDestinationCopySourceOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageDestinationCopySourceOptions/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImageDestinationCopySourceOptions toObject(Class<CGImageDestinationCopySourceOptions> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGImageDestinationCopySourceOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CGImageDestinationCopySourceOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImageDestinationCopySourceOptions> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImageDestinationCopySourceOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGImageDestinationCopySourceOptions(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImageDestinationCopySourceOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImageDestinationCopySourceOptions i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CGImageDestinationCopySourceOptions(CFDictionary data) {
        super(data);
    }
    public CGImageDestinationCopySourceOptions() {}
    /*</constructors>*/

    /*<methods>*/


    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageMetadata getMetadata() {
        CFString key = Keys.DestinationMetadata();
        if (data.containsKey(key)) {
            CGImageMetadata val = null;
            CFString key1 = Keys.DestinationMetadata();
            if (data.containsKey(key1)) {
                val = data.get(key1, CGImageMetadata.class);
            }
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageDestinationCopySourceOptions setMetadata(CGImageMetadata metadata) {
        CFString key = Keys.DestinationMetadata();
        data.put(key, metadata);
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public boolean isMergingMetadata() {
        CFString key = Keys.DestinationMergeMetadata();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.DestinationMergeMetadata();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageDestinationCopySourceOptions setMergeMetadata(boolean merge) {
        CFString key = Keys.DestinationMergeMetadata();
        NativeObject value = CFBoolean.valueOf(merge);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public boolean shouldExcludeXMP() {
        CFString key = Keys.MetadataShouldExcludeXMP();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.MetadataShouldExcludeXMP();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageDestinationCopySourceOptions setShouldExcludeXMP(boolean exclude) {
        CFString key = Keys.MetadataShouldExcludeXMP();
        NativeObject value = CFBoolean.valueOf(exclude);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 8.0 and later.
     */
    public boolean shouldExcludeGPS() {
        CFString key = Keys.MetadataShouldExcludeGPS();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.MetadataShouldExcludeGPS();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 8.0 and later.
     */
    public CGImageDestinationCopySourceOptions setShouldExcludeGPS(boolean exclude) {
        CFString key = Keys.MetadataShouldExcludeGPS();
        NativeObject value = CFBoolean.valueOf(exclude);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public String getDateTime() {
        CFString key = Keys.DestinationDateTime();
        if (data.containsKey(key)) {
            CFString val = null;
            CFString key1 = Keys.DestinationDateTime();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFString.class);
            }
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageDestinationCopySourceOptions setDateTime(String dateTime) {
        CFString key = Keys.DestinationDateTime();
        NativeObject value = new CFString(dateTime);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImagePropertyOrientation getOrientation() {
        CFString key = Keys.DestinationOrientation();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.DestinationOrientation();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFNumber.class);
            }
            return CGImagePropertyOrientation.valueOf(val.longValue());
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageDestinationCopySourceOptions setOrientation(CGImagePropertyOrientation orientation) {
        CFString key = Keys.DestinationOrientation();
        NativeObject value = CFNumber.valueOf(orientation.value());
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    public CGImageDestinationCopySourceOptions setDateTime(NSDate dateTime) {
        CFString key = Keys.DestinationDateTime();
        data.put(key, dateTime);
        return this;
    }
    
    /*<keys>*/
    @Library("ImageIO")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImageDestinationMetadata", optional=true)
        public static native CFString DestinationMetadata();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImageDestinationMergeMetadata", optional=true)
        public static native CFString DestinationMergeMetadata();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImageMetadataShouldExcludeXMP", optional=true)
        public static native CFString MetadataShouldExcludeXMP();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="kCGImageMetadataShouldExcludeGPS", optional=true)
        public static native CFString MetadataShouldExcludeGPS();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImageDestinationDateTime", optional=true)
        public static native CFString DestinationDateTime();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImageDestinationOrientation", optional=true)
        public static native CFString DestinationOrientation();
    }
    /*</keys>*/
}
