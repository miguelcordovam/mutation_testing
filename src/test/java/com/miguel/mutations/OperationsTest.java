package com.miguel.mutations;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {

    private Operations operations = new Operations();

    @Test
    public void addTest () {
        assertEquals(6 , operations.add(5 , 1));
    }

    @Test
    public void isGreaterThan() {
        assertTrue(operations.isGreaterThan(15, 10));
    }

    @Test
    public void isGreaterThan_Equals() {
        assertFalse(operations.isGreaterThan(15, 15));
    }

    @Test
    public void calculateDiscount_LessThan100() {
        assertTrue(0.15*60 == operations.calculateDiscount(60));
    }

    @Test
    public void calculateDiscount_Equals100() {
        assertTrue(0.25*100 == operations.calculateDiscount(100));
    }

    @Test
    public void calculateDiscountTest_GreaterThan100() {
        assertTrue(200*0.25 == operations.calculateDiscount(200));
    }
}
