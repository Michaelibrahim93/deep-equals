package com.mi93.deepequalslib;

class Utils {
    public static boolean shallowEquals(Object o1, Object o2, boolean allowNull) {
        if(!allowNull && (o1 == null || o2 == null))
            return false;
        else if(allowNull && o1 == null && o2 == null)
            return true;
        else if(o1 != null)
            return o1.equals(o2);
        return false;
    }
}
