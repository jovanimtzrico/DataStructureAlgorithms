package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import algorithms.PairOfNum;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jovanimartinezrico
 */
public class PairOfNumTest {
    PairOfNum pairOfNu;
    ArrayList<Integer> elements;
    ArrayList<Integer> expected;
      
    
    public PairOfNumTest() {
        pairOfNu = new PairOfNum();
        elements = new ArrayList<>();
        expected = new ArrayList<>();
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void emptyArray() {
        assertEquals(expected,pairOfNu.pairNum(elements, 6));
     }
     
     @Test
     public void orderedArray() {
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        elements.add(7);
        elements.add(8);
        elements.add(9);
        
        expected.add(6);
        expected.add(8);
        expected.add(5);
        expected.add(9); 
        assertEquals(expected, pairOfNu.pairNum(elements, 14));
     }
     
     @Test
     public void unorderedArray() {
        elements.add(3);
        elements.add(5);
        elements.add(2);
        elements.add(7);
        elements.add(1);
        elements.add(4);
        elements.add(6);
        elements.add(9);
        elements.add(8);
        
        expected.add(5);
        expected.add(9);
        expected.add(6);
        expected.add(8); 
        assertEquals(expected, pairOfNu.pairNum(elements, 14));
     }
     
     @Test
     public void duplicateElementsArray() {
        elements.add(3);
        elements.add(5);
        elements.add(2);
        elements.add(7);
        elements.add(1);
        elements.add(4);
        elements.add(6);
        elements.add(5);
        elements.add(2);
        
        expected.add(5);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(1);
        expected.add(6);
        expected.add(5);
        expected.add(2);
        assertEquals(expected, pairOfNu.pairNum(elements, 7));
     }
     
     @Test
     public void negativeNumbersArray() {
        elements.add(-3);
        elements.add(5);
        elements.add(2);
        elements.add(7);
        elements.add(1);
        elements.add(4);
        elements.add(6);
        elements.add(10);
        elements.add(0);
        
        expected.add(5);
        expected.add(2);
        expected.add(1);
        expected.add(6);
        expected.add(-3);
        expected.add(10);
        expected.add(7);
        expected.add(0);
        assertEquals(expected, pairOfNu.pairNum(elements, 7));
     }
}
