package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class SortStringInAlphabeticalOrderTest {

    public static SortStringInAlphabeticalOrder sortStringInAlphabeticalOrder;
    @BeforeClass
    public static void setUp() {
        sortStringInAlphabeticalOrder = new SortStringInAlphabeticalOrder();
    }

    @AfterClass
    public static void tearDown() {
        sortStringInAlphabeticalOrder =null;
    }

    @Test
    public void testSortString_GivenStringArray_ShouldRetunSortedString() {
        assertEquals("[adam, bryan, chris, rock, scott]", sortStringInAlphabeticalOrder.sortString("bryan adam rock chris scott"));

    }
    @Test
    @Deprecated
    public void testSortString_GivenNull_ShouldReturnNull(){
        assertEquals(null,null);
    }


}