package com.mi93.deepequalslib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionsUtils {
    public static<T> List<T> toList(T[] arr) {
        ArrayList<T> list = new ArrayList<>(arr.length);
        if(arr != null)
            Collections.addAll(list, arr);
        return list;
    }
}
