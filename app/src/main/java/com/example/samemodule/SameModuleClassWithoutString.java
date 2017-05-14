package com.example.samemodule;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

@Parcel(Parcel.Serialization.BEAN)
public class SameModuleClassWithoutString {

    private final int param;
    private final long param2;
    private final boolean param4;
    private final double param6;

    @ParcelConstructor
    public SameModuleClassWithoutString(int param, long param2, boolean param4, double param6) {
        this.param = param;
        this.param2 = param2;
        this.param4 = param4;
        this.param6 = param6;
    }

    public int getParam() {
        return param;
    }

    public long getParam2() {
        return param2;
    }

    public boolean isParam4() {
        return param4;
    }

    public double getParam6() {
        return param6;
    }
}
