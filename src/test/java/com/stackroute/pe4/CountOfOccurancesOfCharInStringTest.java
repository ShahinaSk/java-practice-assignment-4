package com.stackroute.pe4;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CountOfOccurancesOfCharInStringTest {

    public static CountOfOccurancesOfCharInString countOfOccurancesOfCharInString;
    @BeforeClass
    public static void  setUp() throws Exception {
        countOfOccurancesOfCharInString =new CountOfOccurancesOfCharInString();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        countOfOccurancesOfCharInString =null;
    }

    @Test
    public void testNoOfOccurancesOfChar_GivenStringAndCharacter_ShouldGiveOccuranceCountOfCharacter() {
        assertEquals(10, countOfOccurancesOfCharInString.noOfOccurancesOfChar("Java is java again java again",'a'));
    }
    @Test
    public void testNoOfOccurancesOfChar_GivenStringAndBlank_ShouldReturnNegativeValue(){
        assertEquals(-1, countOfOccurancesOfCharInString.noOfOccurancesOfChar("Java is java again java again",' '));
    }
    @Test
    public void testNoOfOccurancesOfChar_GivenNullAndChar_ShouldReturnNegativeValue(){
        assertEquals(-1, countOfOccurancesOfCharInString.noOfOccurancesOfChar(null,'a'));
    }


}