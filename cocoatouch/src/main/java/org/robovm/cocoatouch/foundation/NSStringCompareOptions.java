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

import org.robovm.rt.bro.ValuedEnum;

public enum NSStringCompareOptions implements ValuedEnum {
    CaseInsensitiveSearch(1),
    LiteralSearch(2),
    BackwardsSearch(4),
    AnchoredSearch(8),
    NumericSearch(64),
    DiacriticInsensitiveSearch(128),
    WidthInsensitiveSearch(256),
    ForcedOrderingSearch(512),
    RegularExpressionSearch(1024);

    private final long n;

    private NSStringCompareOptions(long n) { this.n = n; }
    public long value() { return n; }
}
