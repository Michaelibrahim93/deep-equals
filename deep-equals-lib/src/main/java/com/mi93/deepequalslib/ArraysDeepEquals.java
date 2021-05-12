package com.mi93.deepequalslib;

public class ArraysDeepEquals {
    public static boolean arrayDeepEquals(Object arr1, Object arr2) {
        if (!arr1.getClass().isArray() || !arr2.getClass().isArray() || !arr1.getClass().equals(arr2.getClass()))
            throw new RuntimeException("arr1, arr2 must be arrays, and both should be same array type");
        if (arr1 instanceof byte[])
            return primitiveArrayEquals((byte[]) arr1, (byte[]) arr2);
        else if (arr1 instanceof short[])
            return primitiveArrayEquals((short[]) arr1, (short[]) arr2);
        else if (arr1 instanceof int[])
            return primitiveArrayEquals((int[]) arr1, (int[]) arr2);
        else if (arr1 instanceof long[])
            return primitiveArrayEquals((long[]) arr1, (long[]) arr2);
        else if (arr1 instanceof float[])
            return primitiveArrayEquals((float[]) arr1, (float[]) arr2);
        else if (arr1 instanceof double[])
            return primitiveArrayEquals((double[]) arr1, (double[]) arr2);
        else if (arr1 instanceof char[])
            return primitiveArrayEquals((char[]) arr1, (char[]) arr2);
        else if (arr1 instanceof boolean[])
            return primitiveArrayEquals((boolean[]) arr1, (boolean[]) arr2);
        else
            return objectArrayEquals((Object[]) arr1, (Object[]) arr2);
    }

    private static boolean objectArrayEquals(Object[] arr1, Object[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (!DeepEquals.deepEquals(arr1[i], arr2[i]))
                return false;
        
        return true;
    }

    private static boolean primitiveArrayEquals(byte[] arr1, byte[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(short[] arr1, short[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(long[] arr1, long[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(float[] arr1, float[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(double[] arr1, double[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static boolean primitiveArrayEquals(boolean[] arr1, boolean[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    private static<T> boolean genericArrayEquals(T[] arr1, T[] arr2) {
        return true;
    }
}
