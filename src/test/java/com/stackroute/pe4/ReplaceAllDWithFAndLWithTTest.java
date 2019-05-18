package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDWithFAndLWithTTest {

    public static ReplaceAllDWithFAndLWithT replaceAllDWithFAndLWithT;
    @BeforeClass
    public static void  setUp()   {
        replaceAllDWithFAndLWithT =new ReplaceAllDWithFAndLWithT();
    }

    @AfterClass
    public static void tearDown()  {
        replaceAllDWithFAndLWithT =null;
    }
    @Test
    public void testReplaceAddDWithFAndLWithT_GivenString_ShouldReplace_d_With_f_And_l_With_t() {
        assertEquals("faity fry", replaceAllDWithFAndLWithT.replaceAllDWithFAndLWithT("daily dry"));
    }

    @Test
    public void testReplaceAddDWithFAndLWithT_GivenStringWithMultiple_d_ShouldReturnStringWith_t() {
        assertEquals("fffaitty ftry", replaceAllDWithFAndLWithT.replaceAllDWithFAndLWithT("dddailly dtry"));
    }

    @Test
    public void testReplaceAddDWithFAndLWithT_GivenNull_ShouldReturnNull() {
        assertEquals(null, replaceAllDWithFAndLWithT.replaceAllDWithFAndLWithT(null));
    }


}