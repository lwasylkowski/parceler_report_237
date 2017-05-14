package com.example.samemodule;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

@Parcel(Parcel.Serialization.BEAN)
public class SameModuleClassWithString {

    private final int param;
    private final long param2;
    private final String param3;
    private final boolean param4;
    private final String param5;
    private final double param6;

    @ParcelConstructor
    public SameModuleClassWithString(int param, long param2, String param3, boolean param4, String param5, double param6) {
        this.param = param;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
    }

    public int getParam() {
        return param;
    }

    public long getParam2() {
        return param2;
    }

    public String getParam3() {
        return param3;
    }

    public boolean isParam4() {
        return param4;
    }

    public String getParam5() {
        return param5;
    }

    public double getParam6() {
        return param6;
    }
}
