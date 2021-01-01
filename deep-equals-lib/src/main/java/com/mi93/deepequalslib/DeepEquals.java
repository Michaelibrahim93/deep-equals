package com.mi93.deepequalslib;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static com.mi93.deepequalslib.ReflectionUtils.getValue;
import static com.mi93.deepequalslib.ReflectionUtils.isCollectionType;
import static com.mi93.deepequalslib.ReflectionUtils.isPrimitiveType;

@SuppressWarnings("ALL")
public class DeepEquals {
    public static boolean deepEquals(Object o1, Object o2) {
        if ((o1 == null) != (o2 == null))
            return false;
        if (o1 == null && o2 == null)
            return true;
        if (!o1.getClass().equals(o2.getClass()))
            return false;

        else if (isCollectionType(o1))
            if (!collectionEquals((Collection) o1, (Collection) o2))
                return false;

        ArrayList<Field> fields = new ArrayList<>();
        ReflectionUtils.setAllDeclaredFields(o1.getClass(), fields);

        for (Field field : fields) {
            field.setAccessible(true);
            Object o1FieldValue = getValue(field, o1.getClass(), o1);
            Object o2FieldValue = getValue(field, o2.getClass(), o2);
            if ((o1FieldValue == null) != (o2FieldValue == null))
                return false;
            if (o1FieldValue == null && o2FieldValue == null || Modifier.isStatic(field.getModifiers()))
                continue;
            if (isPrimitiveType(field.getType()))
                if (!Utils.shallowEquals(o1FieldValue, o2FieldValue, false))
                    return false;
            else if (!isPrimitiveType(field.getType()))
                if (!deepEquals(o1FieldValue, o2FieldValue))
                    return false;
        }
        return true;
    }

    @SuppressWarnings("rawtypes")
    private static boolean collectionEquals(Collection o1FieldValue, Collection o2FieldValue) {
        if(o1FieldValue.size()!=o2FieldValue.size())
            return false;
        Iterator iterator1 = o1FieldValue.iterator();
        Iterator iterator2 = o2FieldValue.iterator();
        while (iterator1.hasNext()) {
            Object obj1= iterator1.next();
            Object obj2= iterator2.next();
            if (isPrimitiveType(obj1.getClass()))
                if (!Utils.shallowEquals(obj1, obj2, false))
                    return false;
            else if (!isPrimitiveType(obj1.getClass()))
                if (!deepEquals(obj1, obj2))
                    return false;
        }
        return true;
    }

    //TODO handle maps and arrays
}