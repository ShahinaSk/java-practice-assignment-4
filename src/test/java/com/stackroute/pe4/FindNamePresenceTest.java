package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class FindNamePresenceTest {

    public static FindNamePresence findNamePresence;
    @BeforeClass
    public static void setUp()   {
        findNamePresence =new FindNamePresence();
    }

    @AfterClass
    public static void tearDown()   {
        findNamePresence =null;
    }

    @Test
    public void testFindName_GivenStringAndTarget_ShouldReturnTrue() {
        assertEquals("Is Harry here ? true", findNamePresence.findName("This is Harry.","Harry"));
    }

    @Test
    public void testFindName_GivenStringAndTarget_ShouldReturnFalse() {
        assertEquals("Is Harry here ? false", findNamePresence.findName("This is Henry.","Harry"));
        assertEquals(null, findNamePresence.findName("This is Harry.",null));
    }

    @Test
    public void testFindName_GivenStringAndNull_ShouldReturnNull() {
        assertEquals(null, findNamePresence.findName("This is Harry.",null));
    }
}