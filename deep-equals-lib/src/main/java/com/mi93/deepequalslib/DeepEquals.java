package com.mi93.deepequalslib;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.mi93.deepequalslib.ReflectionUtils.getValue;
import static com.mi93.deepequalslib.ReflectionUtils.isCollectionType;
import static com.mi93.deepequalslib.ReflectionUtils.isMapType;
import static com.mi93.deepequalslib.ReflectionUtils.isPrimitiveType;

@SuppressWarnings("ALL")
public class DeepEquals {
    public static boolean deepEquals(Object o1, Object o2) {
        if (o1 == null && o2 == null)
            return true;
        else if ((o1 == null) != (o2 == null))
            return false;
        else if (!o1.getClass().equals(o2.getClass()))
            return false;
        else if (isPrimitiveType(o1.getClass()))
            return Utils.shallowEquals(o1, o2, false);
        else if (isCollectionType(o1))
            return collectionEquals((Collection) o1, (Collection) o2);
        else if (isMapType(o1))
            return mapEquals((Map) o1, (Map) o2);
        else if (o2.getClass().isArray())
            return ArraysDeepEquals.arrayDeepEquals(o1, o2);

        ArrayList<Field> fields = new ArrayList<>();
        ReflectionUtils.setAllDeclaredFields(o1.getClass(), fields);

        for (Field field : fields) {
            field.setAccessible(true);
            Object o1FieldValue = getValue(field, o1.getClass(), o1);
            Object o2FieldValue = getValue(field, o2.getClass(), o2);

            if (o1FieldValue == null && o2FieldValue == null || Modifier.isStatic(field.getModifiers()))
                continue;
            else if (!deepEquals(o1FieldValue, o2FieldValue))
                return false;
        }
        return true;
    }

    private static boolean mapEquals(Map o1, Map o2) {
        if (o1.size() != o2.size())
            return false;

        Set keysSet = o1.keySet();
        for (Object itr : keysSet)
            if (!deepEquals(o1.get(itr), o2.get(itr)))
                return false;

        return true;
    }

    private static boolean collectionEquals(Collection o1, Collection o2) {
        if(o1.size()!=o2.size())
            return false;
        Iterator iterator1 = o1.iterator();
        Iterator iterator2 = o2.iterator();
        while (iterator1.hasNext()) {
            Object obj1= iterator1.next();
            Object obj2= iterator2.next();

            if (!deepEquals(obj1, obj2))
                return false;
        }
        return true;
    }
}