package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class FindTransposeOfStringTest {

    public static FindTransposeOfString findTransposeOfString;
    @BeforeClass
    public static void setUp() {
        findTransposeOfString =new FindTransposeOfString();
    }

    @AfterClass
    public static void tearDown() {
        findTransposeOfString =null;
    }

    @Test
    public void testTransposeString_GivenString_ShouldReturnTraverseOfString() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",
                findTransposeOfString.transposeString("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void testTransposeString_GivenString_ShouldNotReturnSReversetring() {
        assertNotEquals("evirsemmi lluf kcats gninia",
                findTransposeOfString.transposeString("immesrive full stack training"));
    }

    @Test
    public void testTransposeString_GivenNull_ShouldReturnNull() {

        assertEquals(null, findTransposeOfString.transposeString(null));
    }
}