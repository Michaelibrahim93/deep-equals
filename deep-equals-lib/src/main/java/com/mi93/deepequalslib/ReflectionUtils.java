package com.mi93.deepequalslib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

class ReflectionUtils {
    static void setAllDeclaredFields(Class<?> aClass, ArrayList<Field> fields) {
        if (aClass == null || aClass.equals(Object.class))
            return;
        fields.addAll(CollectionsUtils.toList(aClass.getDeclaredFields()));
        setAllDeclaredFields(aClass.getSuperclass(), fields);
    }

    static boolean isCollectionType(Object object) {
        return object instanceof Collection;
    }

    static boolean isPrimitiveType(Class<?> type) {
        return type.isPrimitive() || type.equals(Date.class)
                || type.equals(String.class) || type.equals(Long.class)
                || type.equals(Double.class) || type.equals(Float.class)
                || type.equals(Integer.class) || type.equals(Boolean.class);
    }

    static Object getValue(Field field, Class aClass, Object o) {
        try {
            field.setAccessible(true);
            Object value = field.get(o);
            if (value != null)
                return value;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // MZ: Find the correct method
        for (Method method : aClass.getMethods()) {
            if ((method.getName().startsWith("get")) && (method.getName().length() == (field.getName().length() + 3))
                    && method.getName().toLowerCase().endsWith(field.getName().toLowerCase())) {
                // MZ: Method found, run it
                try {
                    return method.invoke(o);
                } catch (IllegalAccessException | InvocationTargetException ignored) {
                }
            }
        }
        return null;
    }
}
