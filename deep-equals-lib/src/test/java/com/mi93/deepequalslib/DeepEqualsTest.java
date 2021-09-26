package com.mi93.deepequalslib;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeepEqualsTest {
    // region primitive boolean
    @Test
    public void deepEquals_TrueValues_Equals() {
        boolean result = DeepEquals.deepEquals(true, true);
        assertTrue(result);
    }
    @Test
    public void deepEquals_FalseValues_Equals() {
        boolean result = DeepEquals.deepEquals(false, false);
        assertTrue(result);
    }
    @Test
    public void deepEquals_BooleanDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(true, false);
        assertFalse(result);
    }
    //endregion

    //region primitive byte
    @Test
    public void deepEquals_BytePositiveValues_Equals() {
        boolean result = DeepEquals.deepEquals((byte)1, (byte) 1);
        assertTrue(result);
    }

    @Test
    public void deepEquals_ByteNegativeValues_Equals() {
        boolean result = DeepEquals.deepEquals((byte) -1, (byte) -1);
        assertTrue(result);
    }

    @Test
    public void deepEquals_ByteDifferentPositiveValues_NotEquals() {
        boolean result = DeepEquals.deepEquals((byte) 1, (byte) 2);
        assertFalse(result);
    }

    @Test
    public void deepEquals_ByteDifferentNegativeValues_NotEquals() {
        boolean result = DeepEquals.deepEquals((byte) -1, (byte) -2);
        assertFalse(result);
    }

    @Test
    public void deepEquals_ByteDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals((byte) 1, (byte) -2);
        assertFalse(result);
    }

    //endregion

    //region primitive short
    @Test
    public void deepEquals_ShortPositiveValues_Equals() {
        boolean result = DeepEquals.deepEquals((short)1, (short) 1);
        assertTrue(result);
    }

    @Test
    public void deepEquals_ShortNegativeValues_Equals() {
        boolean result = DeepEquals.deepEquals((short) -1, (short) -1);
        assertTrue(result);
    }

    @Test
    public void deepEquals_ShortDifferentPositiveValues_NotEquals() {
        boolean result = DeepEquals.deepEquals((short) 1, (short) 2);
        assertFalse(result);
    }

    @Test
    public void deepEquals_ShortDifferentNegativeValues_NotEquals() {
        boolean result = DeepEquals.deepEquals((short) -1, (short) -2);
        assertFalse(result);
    }

    @Test
    public void deepEquals_ShortDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals((short) 1, (short) -2);
        assertFalse(result);
    }

    //endregion

    //region primitive int
    @Test
    public void deepEquals_IntPositiveValues_Equals() {
        boolean result = DeepEquals.deepEquals(1, 1);
        assertTrue(result);
    }

    @Test
    public void deepEquals_IntNegativeValues_Equals() {
        boolean result = DeepEquals.deepEquals(-1, -1);
        assertTrue(result);
    }

    @Test
    public void deepEquals_IntDifferentPositiveValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1, 2);
        assertFalse(result);
    }

    @Test
    public void deepEquals_IntDifferentNegativeValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(-1, -2);
        assertFalse(result);
    }

    @Test
    public void deepEquals_IntDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1, -2);
        assertFalse(result);
    }

    //endregion

    //region primitive long
    @Test
    public void deepEquals_LongPositiveValues_Equals() {
        boolean result = DeepEquals.deepEquals(1L, 1L);
        assertTrue(result);
    }

    @Test
    public void deepEquals_LongNegativeValues_Equals() {
        boolean result = DeepEquals.deepEquals(-1L, -1L);
        assertTrue(result);
    }

    @Test
    public void deepEquals_LongDifferentPositiveValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1L, 2L);
        assertFalse(result);
    }

    @Test
    public void deepEquals_LongDifferentNegativeValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(-1L, -2L);
        assertFalse(result);
    }

    @Test
    public void deepEquals_LongDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1L, -2L);
        assertFalse(result);
    }
    //endregion

    //region primitive float
    @Test
    public void deepEquals_FloatPositiveValues_Equals() {
        boolean result = DeepEquals.deepEquals(1.0F, 1.0F);
        assertTrue(result);
    }

    @Test
    public void deepEquals_FloatNegativeValues_Equals() {
        boolean result = DeepEquals.deepEquals(-1.0F, -1.0F);
        assertTrue(result);
    }

    @Test
    public void deepEquals_FloatDifferentPositiveValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1.0F, 2.0F);
        assertFalse(result);
    }

    @Test
    public void deepEquals_FloatDifferentNegativeValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(-1.0F, -2.0F);
        assertFalse(result);
    }

    @Test
    public void deepEquals_FloatDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1.0F, -2.0F);
        assertFalse(result);
    }
    //endregion

    //region primitive double
    @Test
    public void deepEquals_DoublePositiveValues_Equals() {
        boolean result = DeepEquals.deepEquals(1.0, 1.0);
        assertTrue(result);
    }

    @Test
    public void deepEquals_DoubleNegativeValues_Equals() {
        boolean result = DeepEquals.deepEquals(-1.0, -1.0);
        assertTrue(result);
    }

    @Test
    public void deepEquals_DoubleDifferentPositiveValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1.0, 2.0);
        assertFalse(result);
    }

    @Test
    public void deepEquals_DoubleDifferentNegativeValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(-1.0, -2.0);
        assertFalse(result);
    }

    @Test
    public void deepEquals_DoubleDifferentValues_NotEquals() {
        boolean result = DeepEquals.deepEquals(1.0, -2.0);
        assertFalse(result);
    }
    //endregion
}