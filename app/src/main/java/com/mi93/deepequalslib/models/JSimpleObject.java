package com.mi93.deepequalslib.models;

import com.mi93.deepequalslib.annotations.IgnoreDeepEquals;

public class JSimpleObject {
    int mInt;
    float mFloat;
    double mDouble;
    String mString;
    @IgnoreDeepEquals
    float ignoredValue;

    public JSimpleObject( String mString, double mDouble, int mInt, float mFloat) {
        this.mInt = mInt;
        this.mFloat = mFloat;
        this.mDouble = mDouble;
        this.mString = mString;
    }
}
