/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import algorithms.ConsecutivesNumbers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jovanimartinezrico
 */
public class ConsecutivesNumbersTest {

    private ConsecutivesNumbers consecutivesNumbers;

    @Before
    public void setUp() {
        consecutivesNumbers = new ConsecutivesNumbers();
    }

    @Test
    public void emptyArray() {
        Integer[] numbers = new Integer[]{};
        assertArrayEquals(numbers, consecutivesNumbers.findConsecutives(numbers));
    }

    @Test
    public void oneSecuence() {
        Integer[] numbers = new Integer[]{2,3,4,5};
        assertArrayEquals(numbers, consecutivesNumbers.findConsecutives(numbers));
    }
    
    @Test
    public void twoSecuence() {
        Integer[] numbers = new Integer[]{2,3,4,5,7,6};
        Integer[] expected = new Integer[]{2,3,4,5};
        assertArrayEquals(expected, consecutivesNumbers.findConsecutives(numbers));
    }
    
    @Test
    public void lastSecuence() {
        Integer[] numbers = new Integer[]{2,3,4,5,7,6,7,8,9,10};
        Integer[] expected = new Integer[]{6,7,8,9,10};
        assertArrayEquals(expected, consecutivesNumbers.findConsecutives(numbers));
    }
    
    @Test
    public void middleSecuence() {
        Integer[] numbers = new Integer[]{2,3,4,5,7,6,7,8,9,10,5,6,7};
        Integer[] expected = new Integer[]{6,7,8,9,10};
        assertArrayEquals(expected, consecutivesNumbers.findConsecutives(numbers));
    }
}
