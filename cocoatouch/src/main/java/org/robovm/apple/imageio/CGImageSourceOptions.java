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
@Marshaler(/*<name>*/CGImageSourceOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageSourceOptions/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImageSourceOptions toObject(Class<CGImageSourceOptions> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGImageSourceOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CGImageSourceOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImageSourceOptions> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImageSourceOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGImageSourceOptions(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImageSourceOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImageSourceOptions i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CGImageSourceOptions(CFDictionary data) {
        super(data);
    }
    public CGImageSourceOptions() {}
    /*</constructors>*/

    /*<methods>*/


    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getTypeIdentifierHint() {
        CFString key = Keys.TypeIdentifierHint();
        if (data.containsKey(key)) {
            CFString val = null;
            CFString key1 = Keys.TypeIdentifierHint();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFString.class);
            }
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageSourceOptions setTypeIdentifierHint(String typeIdentifier) {
        CFString key = Keys.TypeIdentifierHint();
        NativeObject value = new CFString(typeIdentifier);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean shouldCache() {
        CFString key = Keys.ShouldCache();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.ShouldCache();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageSourceOptions setShouldCache(boolean cache) {
        CFString key = Keys.ShouldCache();
        NativeObject value = CFBoolean.valueOf(cache);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public boolean shouldCacheImmediately() {
        CFString key = Keys.ShouldCacheImmediately();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.ShouldCacheImmediately();
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
    public CGImageSourceOptions setShouldCacheImmediately(boolean cache) {
        CFString key = Keys.ShouldCacheImmediately();
        NativeObject value = CFBoolean.valueOf(cache);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean shouldAllowFloat() {
        CFString key = Keys.ShouldAllowFloat();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.ShouldAllowFloat();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageSourceOptions setShouldAllowFloat(boolean allowFloat) {
        CFString key = Keys.ShouldAllowFloat();
        NativeObject value = CFBoolean.valueOf(allowFloat);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean shouldCreateThumbnailFromImageIfAbsent() {
        CFString key = Keys.CreateThumbnailFromImageIfAbsent();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.CreateThumbnailFromImageIfAbsent();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageSourceOptions setShouldCreateThumbnailFromImageIfAbsent(boolean createThumbnail) {
        CFString key = Keys.CreateThumbnailFromImageIfAbsent();
        NativeObject value = CFBoolean.valueOf(createThumbnail);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getThumbnailMaxPixelSize() {
        CFString key = Keys.ThumbnailMaxPixelSize();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.ThumbnailMaxPixelSize();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFNumber.class);
            }
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageSourceOptions setThumbnailMaxPixelSize(long maxSize) {
        CFString key = Keys.ThumbnailMaxPixelSize();
        NativeObject value = CFNumber.valueOf(maxSize);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean shouldCreateThumbnailWithTransform() {
        CFString key = Keys.CreateThumbnailWithTransform();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.CreateThumbnailWithTransform();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFBoolean.class);
            }
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageSourceOptions setShouldCreateThumbnailWithTransform(boolean transform) {
        CFString key = Keys.CreateThumbnailWithTransform();
        NativeObject value = CFBoolean.valueOf(transform);
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("ImageIO")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceTypeIdentifierHint", optional=true)
        public static native CFString TypeIdentifierHint();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceShouldCache", optional=true)
        public static native CFString ShouldCache();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceShouldCacheImmediately", optional=true)
        public static native CFString ShouldCacheImmediately();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceShouldAllowFloat", optional=true)
        public static native CFString ShouldAllowFloat();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceCreateThumbnailFromImageIfAbsent", optional=true)
        public static native CFString CreateThumbnailFromImageIfAbsent();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceCreateThumbnailFromImageAlways", optional=true)
        public static native CFString CreateThumbnailFromImageAlways();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceThumbnailMaxPixelSize", optional=true)
        public static native CFString ThumbnailMaxPixelSize();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageSourceCreateThumbnailWithTransform", optional=true)
        public static native CFString CreateThumbnailWithTransform();
    }
    /*</keys>*/
}
