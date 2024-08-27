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
@Marshaler(/*<name>*/CGImageProperties/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageProperties/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImageProperties toObject(Class<CGImageProperties> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGImageProperties(o);
        }
        @MarshalsPointer
        public static long toNative(CGImageProperties o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImageProperties> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImageProperties> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGImageProperties(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImageProperties> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImageProperties i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    public CGImageProperties(CFDictionary data) {
        super(data);
    }
    public CGImageProperties() {}
    /*</constructors>*/

    /*<methods>*/


    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyTIFFData getTIFFData() {
        CFString key = Keys.TIFFDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.TIFFDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyTIFFData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setTIFFData(CGImagePropertyTIFFData metadata) {
        CFString key = Keys.TIFFDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyGIFData getGIFData() {
        CFString key = Keys.GIFDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.GIFDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyGIFData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setGIFData(CGImagePropertyGIFData metadata) {
        CFString key = Keys.GIFDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyJFIFData getJFIFData() {
        CFString key = Keys.JFIFDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.JFIFDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyJFIFData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setJFIFData(CGImagePropertyJFIFData metadata) {
        CFString key = Keys.JFIFDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyExifData getExifData() {
        CFString key = Keys.ExifDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.ExifDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyExifData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setExifData(CGImagePropertyExifData metadata) {
        CFString key = Keys.ExifDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyPNGData getPNGData() {
        CFString key = Keys.PNGDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.PNGDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyPNGData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setPNGData(CGImagePropertyPNGData metadata) {
        CFString key = Keys.PNGDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyIPTCData getIPTCData() {
        CFString key = Keys.IPTCDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.IPTCDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyIPTCData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setIPTCData(CGImagePropertyIPTCData metadata) {
        CFString key = Keys.IPTCDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyGPSData getGPSData() {
        CFString key = Keys.GPSDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.GPSDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyGPSData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setGPSData(CGImagePropertyGPSData metadata) {
        CFString key = Keys.GPSDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFDictionary getRawData() {
        CFString key = Keys.RawDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.RawDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setRawData(CFDictionary metadata) {
        CFString key = Keys.RawDictionary();
        data.put(key, metadata);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyCIFFData getCIFFData() {
        CFString key = Keys.CIFFDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.CIFFDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyCIFFData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setCIFFData(CGImagePropertyCIFFData metadata) {
        CFString key = Keys.CIFFDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyCanonData getMakerCanonData() {
        CFString key = Keys.MakerCanonDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.MakerCanonDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyCanonData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setMakerCanonData(CGImagePropertyCanonData metadata) {
        CFString key = Keys.MakerCanonDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyNikonData getMakerNikonData() {
        CFString key = Keys.MakerNikonDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.MakerNikonDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyNikonData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setMakerNikonData(CGImagePropertyNikonData metadata) {
        CFString key = Keys.MakerNikonDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFDictionary getMakerMinoltaData() {
        CFString key = Keys.MakerMinoltaDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.MakerMinoltaDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setMakerMinoltaData(CFDictionary metadata) {
        CFString key = Keys.MakerMinoltaDictionary();
        data.put(key, metadata);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFDictionary getMakerFujiData() {
        CFString key = Keys.MakerFujiDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.MakerFujiDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setMakerFujiData(CFDictionary metadata) {
        CFString key = Keys.MakerFujiDictionary();
        data.put(key, metadata);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFDictionary getMakerOlympusData() {
        CFString key = Keys.MakerOlympusDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.MakerOlympusDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setMakerOlympusData(CFDictionary metadata) {
        CFString key = Keys.MakerOlympusDictionary();
        data.put(key, metadata);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFDictionary getMakerPentaxData() {
        CFString key = Keys.MakerPentaxDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.MakerPentaxDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setMakerPentaxData(CFDictionary metadata) {
        CFString key = Keys.MakerPentaxDictionary();
        data.put(key, metadata);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperty8BIMData get8BIMData() {
        CFString key = Keys._8BIMDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys._8BIMDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImageProperty8BIMData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties set8BIMData(CGImageProperty8BIMData metadata) {
        CFString key = Keys._8BIMDictionary();
        NativeObject value = metadata.getDictionary();
        this.data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyDNGData getDNGData() {
        CFString key = Keys.DNGDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.DNGDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyDNGData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setDNGData(CGImagePropertyDNGData metadata) {
        CFString key = Keys.DNGDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyExifAuxData getExifAuxData() {
        CFString key = Keys.ExifAuxDictionary();
        if (data.containsKey(key)) {
            CFDictionary val = null;
            CFString key1 = Keys.ExifAuxDictionary();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFDictionary.class);
            }
            return new CGImagePropertyExifAuxData(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setExifAuxData(CGImagePropertyExifAuxData metadata) {
        CFString key = Keys.ExifAuxDictionary();
        NativeObject value = metadata.getDictionary();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getFileSize() {
        CFString key = Keys.FileSize();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.FileSize();
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
    public CGImageProperties setFileSize(long fileSize) {
        CFString key = Keys.FileSize();
        NativeObject value = CFNumber.valueOf(fileSize);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getPixelHeight() {
        CFString key = Keys.PixelHeight();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.PixelHeight();
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
    public CGImageProperties setPixelHeight(long height) {
        CFString key = Keys.PixelHeight();
        NativeObject value = CFNumber.valueOf(height);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getPixelWidth() {
        CFString key = Keys.PixelWidth();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.PixelWidth();
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
    public CGImageProperties setPixelWidth(long width) {
        CFString key = Keys.PixelWidth();
        NativeObject value = CFNumber.valueOf(width);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getDPIHeight() {
        CFString key = Keys.DPIHeight();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.DPIHeight();
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
    public CGImageProperties setDPIHeight(long dpi) {
        CFString key = Keys.DPIHeight();
        NativeObject value = CFNumber.valueOf(dpi);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public long getDPIWidth() {
        CFString key = Keys.DPIWidth();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.DPIWidth();
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
    public CGImageProperties setDPIWidth(long dpi) {
        CFString key = Keys.DPIWidth();
        NativeObject value = CFNumber.valueOf(dpi);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public int getDepth() {
        CFString key = Keys.Depth();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.Depth();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFNumber.class);
            }
            return val.intValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setDepth(int depth) {
        CFString key = Keys.Depth();
        NativeObject value = CFNumber.valueOf(depth);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyOrientation getOrientation() {
        CFString key = Keys.Orientation();
        if (data.containsKey(key)) {
            CFNumber val = null;
            CFString key1 = Keys.Orientation();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFNumber.class);
            }
            return CGImagePropertyOrientation.valueOf(val.longValue());
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setOrientation(CGImagePropertyOrientation orientation) {
        CFString key = Keys.Orientation();
        NativeObject value = CFNumber.valueOf(orientation.value());
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean isContainingFloatingPointPixels() {
        CFString key = Keys.IsFloat();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.IsFloat();
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
    public CGImageProperties setContainsFloatingPointPixels(boolean isFloat) {
        CFString key = Keys.IsFloat();
        NativeObject value = CFBoolean.valueOf(isFloat);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean isIndexed() {
        CFString key = Keys.IsIndexed();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.IsIndexed();
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
    public CGImageProperties setIndexed(boolean isIndexed) {
        CFString key = Keys.IsIndexed();
        NativeObject value = CFBoolean.valueOf(isIndexed);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public boolean hasAlphaChannel() {
        CFString key = Keys.HasAlpha();
        if (data.containsKey(key)) {
            CFBoolean val = null;
            CFString key1 = Keys.HasAlpha();
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
    public CGImageProperties setHasAlphaChannel(boolean alphaChannel) {
        CFString key = Keys.HasAlpha();
        NativeObject value = CFBoolean.valueOf(alphaChannel);
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImagePropertyColorModel getColorModel() {
        CFString key = Keys.ColorModel();
        if (data.containsKey(key)) {
            CFString val = null;
            CFString key1 = Keys.ColorModel();
            if (data.containsKey(key1)) {
                val = data.get(key1, CFString.class);
            }
            return CGImagePropertyColorModel.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CGImageProperties setColorModel(CGImagePropertyColorModel colorModel) {
        CFString key = Keys.ColorModel();
        NativeObject value = colorModel.value();
        data.put(key, value);
        return this;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getICCProfile() {
        CFString key = Keys.ProfileName();
        if (data.containsKey(key)) {
            CFString val = null;
            CFString key1 = Keys.ProfileName();
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
    public CGImageProperties setICCProfile(String profile) {
        CFString key = Keys.ProfileName();
        NativeObject value = new CFString(profile);
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
        @GlobalValue(symbol="kCGImagePropertyTIFFDictionary", optional=true)
        public static native CFString TIFFDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGIFDictionary", optional=true)
        public static native CFString GIFDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyJFIFDictionary", optional=true)
        public static native CFString JFIFDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifDictionary", optional=true)
        public static native CFString ExifDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGDictionary", optional=true)
        public static native CFString PNGDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCDictionary", optional=true)
        public static native CFString IPTCDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGPSDictionary", optional=true)
        public static native CFString GPSDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyRawDictionary", optional=true)
        public static native CFString RawDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyCIFFDictionary", optional=true)
        public static native CFString CIFFDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerCanonDictionary", optional=true)
        public static native CFString MakerCanonDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerNikonDictionary", optional=true)
        public static native CFString MakerNikonDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerMinoltaDictionary", optional=true)
        public static native CFString MakerMinoltaDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerFujiDictionary", optional=true)
        public static native CFString MakerFujiDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerOlympusDictionary", optional=true)
        public static native CFString MakerOlympusDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerPentaxDictionary", optional=true)
        public static native CFString MakerPentaxDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImageProperty8BIMDictionary", optional=true)
        public static native CFString _8BIMDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGDictionary", optional=true)
        public static native CFString DNGDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifAuxDictionary", optional=true)
        public static native CFString ExifAuxDictionary();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyMakerAppleDictionary", optional=true)
        public static native CFString MakerAppleDictionary();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyFileSize", optional=true)
        public static native CFString FileSize();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPixelHeight", optional=true)
        public static native CFString PixelHeight();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPixelWidth", optional=true)
        public static native CFString PixelWidth();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDPIHeight", optional=true)
        public static native CFString DPIHeight();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDPIWidth", optional=true)
        public static native CFString DPIWidth();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDepth", optional=true)
        public static native CFString Depth();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyOrientation", optional=true)
        public static native CFString Orientation();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIsFloat", optional=true)
        public static native CFString IsFloat();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIsIndexed", optional=true)
        public static native CFString IsIndexed();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHasAlpha", optional=true)
        public static native CFString HasAlpha();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyColorModel", optional=true)
        public static native CFString ColorModel();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyProfileName", optional=true)
        public static native CFString ProfileName();
    }
    /*</keys>*/
}
