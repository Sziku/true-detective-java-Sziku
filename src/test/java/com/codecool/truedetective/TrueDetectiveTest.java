package com.codecool.truedetective;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrueDetectiveTest {
    @Test
    public void testIsTwodigitOdd() {
        assertFalse(TrueDetective.isTwoDigitOdd(5));
        assertTrue(TrueDetective.isTwoDigitOdd(15));
        assertFalse(TrueDetective.isTwoDigitOdd(44));
        assertFalse(TrueDetective.isTwoDigitOdd(115));
    }

    @Test
    public void testHasAccess() {
        assertTrue(TrueDetective.hasAccess(42, new int[] {142, 143}, 11, true, 10, true, true, false));
        assertTrue(TrueDetective.hasAccess(42, new int[] {142, 143}, 11, true, 10, true, false, true));
        assertFalse(TrueDetective.hasAccess(42, new int[] {142, 143}, 11, true, 10, true, false, false));
        assertTrue(TrueDetective.hasAccess(42, new int[] {142, 143}, 11, true, 143, true, false, false));
        assertFalse(TrueDetective.hasAccess(42, new int[] {142, 143}, 11, true, 143, false, false, false));
        assertTrue(TrueDetective.hasAccess(42, new int[] {142, 143}, 11, true, 143, false, false, true));
        assertTrue(TrueDetective.hasAccess(42, new int[] {142, 143}, 42, true, 10, false, false, false));
        assertFalse(TrueDetective.hasAccess(42, new int[] {142, 143}, 42, false, 10, false, false, false));
        assertTrue(TrueDetective.hasAccess(42, new int[] {142, 143}, 42, false, 10, false, false, true));
    }

    @Test
    public void testIsLeapYear() {
        assertFalse(TrueDetective.isLeapYear(1995));
        assertTrue(TrueDetective.isLeapYear(1996));
        assertFalse(TrueDetective.isLeapYear(1997));
        assertFalse(TrueDetective.isLeapYear(1998));
        assertFalse(TrueDetective.isLeapYear(1999));
        assertTrue(TrueDetective.isLeapYear(2000));
        assertFalse(TrueDetective.isLeapYear(1900));
    }

    @Test
    public void testIsSunday() {
        assertFalse(TrueDetective.isSunday(1, "M"));
        assertFalse(TrueDetective.isSunday(6, "M"));
        assertTrue(TrueDetective.isSunday(7, "M"));
        assertFalse(TrueDetective.isSunday(7, "W"));
        assertFalse(TrueDetective.isSunday(6, "W"));
        assertTrue(TrueDetective.isSunday(5, "W"));
        assertFalse(TrueDetective.isSunday(32, "F"));
    }

    @Test
    public void testShouldBringUmbrella() {
        assertTrue(TrueDetective.shouldBringUmbrella(true, 2, true, false, false, false, false, false));
        assertFalse(TrueDetective.shouldBringUmbrella(true, 7, true, false, false, false, false, false));
        assertFalse(TrueDetective.shouldBringUmbrella(false, 0, true, false, false, false, false, false));
        assertTrue(TrueDetective.shouldBringUmbrella(false, 0, true, false, true, false, false, false));
        assertTrue(TrueDetective.shouldBringUmbrella(false, 0, true, false, false, false, true, false));
        assertTrue(TrueDetective.shouldBringUmbrella(false, 6, true, true, true, true, true, false));
        assertFalse(TrueDetective.shouldBringUmbrella(false, 7, true, true, true, true, true, false));
        assertFalse(TrueDetective.shouldBringUmbrella(false, 0, false, false, false, false, false, false));
        assertTrue(TrueDetective.shouldBringUmbrella(false, 0, false, false, false, false, false, true));
        assertFalse(TrueDetective.shouldBringUmbrella(false, 8, false, false, false, false, false, true));
    }

    @Test
    public void testShouldTakeANap() {
        assertFalse(TrueDetective.shouldTakeANap(false, false, false, false, false, false, false));
        assertFalse(TrueDetective.shouldTakeANap(true, true, false, false, false, false, false));
        assertFalse(TrueDetective.shouldTakeANap(true, false, true, false, false, false, false));
        assertFalse(TrueDetective.shouldTakeANap(true, false, false, false, false, false, false));
        assertTrue(TrueDetective.shouldTakeANap(true, false, false, false, false, true, false));
        assertTrue(TrueDetective.shouldTakeANap(true, false, false, false, false, false, true));
        assertFalse(TrueDetective.shouldTakeANap(true, false, false, true, true, false, false));
        assertTrue(TrueDetective.shouldTakeANap(true, false, false, true, false, false, true));
        assertTrue(TrueDetective.shouldTakeANap(true, false, false, true, false, true, true));
    }
}
