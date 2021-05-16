package com.mi93.deepequalslib.models

import com.mi93.deepequalslib.annotations.IgnoreDeepEquals

data class KSimpleObject(
    val mString: String,
    val mDouble: Double,
    val mInt: Int,
    val mFloat: Float,
    @IgnoreDeepEquals
    val ignoredValue: Float
)
