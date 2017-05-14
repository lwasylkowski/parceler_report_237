package com.example.samemodule;

import com.example.othermodule.OtherModuleClassWithString;
import com.example.othermodule.OtherModuleClassWithoutString;

import org.parceler.ParcelClass;
import org.parceler.ParcelClasses;

@ParcelClasses({
        @ParcelClass(OtherModuleClassWithString.class),
        @ParcelClass(OtherModuleClassWithoutString.class)
})
public interface Registry {
}
