/*
 * Copyright (C) 2012 Trillian Mobile AB
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
package org.robovm.cocoatouch.foundation;

import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.StructMember;

/**
 * 
 */
public final class NSRange extends Struct<NSRange> {

    public NSRange() {}
    public NSRange(int location, int length) {
        location(location);
        length(length);
    }
    
    @StructMember(0)
    public native int location();
    @StructMember(0)
    public native NSRange location(int location);
    @StructMember(1)
    public native int length();
    @StructMember(1)
    public native NSRange length(int length);
    
}
