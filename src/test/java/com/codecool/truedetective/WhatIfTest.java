package com.codecool.truedetective;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhatIfTest {
    @Test
    public void testIsTwodigitOdd() {
        assertFalse(WhatIf.isTwoDigitOdd(5));
        assertTrue(WhatIf.isTwoDigitOdd(15));
        assertFalse(WhatIf.isTwoDigitOdd(44));
        assertFalse(WhatIf.isTwoDigitOdd(115));
    }

    @Test
    public void testHasAccess() {
        assertTrue(WhatIf.hasAccess(42, new int[] {142, 143}, 11, true, 10, true, true, false));
        assertTrue(WhatIf.hasAccess(42, new int[] {142, 143}, 11, true, 10, true, false, true));
        assertFalse(WhatIf.hasAccess(42, new int[] {142, 143}, 11, true, 10, true, false, false));
        assertTrue(WhatIf.hasAccess(42, new int[] {142, 143}, 11, true, 143, true, false, false));
        assertFalse(WhatIf.hasAccess(42, new int[] {142, 143}, 11, true, 143, false, false, false));
        assertTrue(WhatIf.hasAccess(42, new int[] {142, 143}, 11, true, 143, false, false, true));
        assertTrue(WhatIf.hasAccess(42, new int[] {142, 143}, 42, true, 10, false, false, false));
        assertFalse(WhatIf.hasAccess(42, new int[] {142, 143}, 42, false, 10, false, false, false));
        assertTrue(WhatIf.hasAccess(42, new int[] {142, 143}, 42, false, 10, false, false, true));
    }

    @Test
    public void testIsLeapYear() {
        assertFalse(WhatIf.isLeapYear(1995));
        assertTrue(WhatIf.isLeapYear(1996));
        assertFalse(WhatIf.isLeapYear(1997));
        assertFalse(WhatIf.isLeapYear(1998));
        assertFalse(WhatIf.isLeapYear(1999));
        assertTrue(WhatIf.isLeapYear(2000));
        assertFalse(WhatIf.isLeapYear(1900));
    }

    @Test
    public void testIsSunday() {
        assertFalse(WhatIf.isSunday(1, "M"));
        assertFalse(WhatIf.isSunday(6, "M"));
        assertTrue(WhatIf.isSunday(7, "M"));
        assertFalse(WhatIf.isSunday(7, "W"));
        assertFalse(WhatIf.isSunday(6, "W"));
        assertTrue(WhatIf.isSunday(5, "W"));
        assertFalse(WhatIf.isSunday(32, "F"));
    }

    @Test
    public void testShouldBringUmbrella() {
        assertTrue(WhatIf.shouldBringUmbrella(true, 2, true, false, false, false, false, false));
        assertFalse(WhatIf.shouldBringUmbrella(true, 7, true, false, false, false, false, false));
        assertFalse(WhatIf.shouldBringUmbrella(false, 0, true, false, false, false, false, false));
        assertTrue(WhatIf.shouldBringUmbrella(false, 0, true, false, true, false, false, false));
        assertTrue(WhatIf.shouldBringUmbrella(false, 0, true, false, false, false, true, false));
        assertTrue(WhatIf.shouldBringUmbrella(false, 6, true, true, true, true, true, false));
        assertFalse(WhatIf.shouldBringUmbrella(false, 7, true, true, true, true, true, false));
        assertFalse(WhatIf.shouldBringUmbrella(false, 0, false, false, false, false, false, false));
        assertTrue(WhatIf.shouldBringUmbrella(false, 0, false, false, false, false, false, true));
        assertFalse(WhatIf.shouldBringUmbrella(false, 8, false, false, false, false, false, true));
    }

    @Test
    public void testShouldTakeANap() {
        assertFalse(WhatIf.shouldTakeANap(false, false, false, false, false, false, false));
        assertFalse(WhatIf.shouldTakeANap(true, true, false, false, false, false, false));
        assertFalse(WhatIf.shouldTakeANap(true, false, true, false, false, false, false));
        assertFalse(WhatIf.shouldTakeANap(true, false, false, false, false, false, false));
        assertTrue(WhatIf.shouldTakeANap(true, false, false, false, false, true, false));
        assertTrue(WhatIf.shouldTakeANap(true, false, false, false, false, false, true));
        assertFalse(WhatIf.shouldTakeANap(true, false, false, true, true, false, false));
        assertTrue(WhatIf.shouldTakeANap(true, false, false, true, false, false, true));
        assertTrue(WhatIf.shouldTakeANap(true, false, false, true, false, true, true));
    }
}
