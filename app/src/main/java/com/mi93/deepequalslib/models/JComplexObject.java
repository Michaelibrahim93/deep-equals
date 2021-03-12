package com.mi93.deepequalslib.models;

import java.util.List;
import java.util.Map;

public class JComplexObject {
    Long id;
    JSimpleObject simpleObject;
    List<JSimpleObject> list;
    Map<Long, JSimpleObject> map;
    JSimpleObject[] oArr;
    int[] iArr;

    public JComplexObject(Long id, JSimpleObject simpleObject, List<JSimpleObject> list, Map<Long, JSimpleObject> map, JSimpleObject[] oArr, int[] iArr) {
        this.id = id;
        this.simpleObject = simpleObject;
        this.list = list;
        this.map = map;
        this.oArr = oArr;
        this.iArr = iArr;
    }
}
