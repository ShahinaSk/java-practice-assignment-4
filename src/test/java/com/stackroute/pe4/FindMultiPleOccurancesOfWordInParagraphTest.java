package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class FindMultiPleOccurancesOfWordInParagraphTest {

    public static FindMultiPleOccurancesOfWordInParagraph findMultiPleOccurancesOfWordInParagraph;
    @BeforeClass
    public static void setUp() {
        findMultiPleOccurancesOfWordInParagraph =new FindMultiPleOccurancesOfWordInParagraph();
    }

    @AfterClass
    public static void tearDown()   {
        findMultiPleOccurancesOfWordInParagraph =null;
    }

    @Deprecated
    @Test
    public void testFindMultipleOccurancesOfString_GivenStringAndSearchKey_ShouldReturnNoOFOccurances() {
        assertEquals(new String[]{"Found at:4-6","Found at:10-12","Found at:27-29"},
                findMultiPleOccurancesOfWordInParagraph.findMultipleOccurancesOfString("She sells seashells by the seashore","se"));
    }
    @Deprecated
    @Test
    public void testFindMultipleOccurancesOfString_GivenNullAndSearchKey_ShouldReturnNull() {
        assertEquals(null,
                findMultiPleOccurancesOfWordInParagraph.findMultipleOccurancesOfString(null,"se"));
    }

    @Deprecated
    @Test
    public void testFindMultipleOccurancesOfString_GivenStringAndSearchNull_ShouldReturnNull() {
        assertEquals(null,
                findMultiPleOccurancesOfWordInParagraph.findMultipleOccurancesOfString("She sells seashells by the seashore",null));
    }


}