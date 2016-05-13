/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import algorithms.FindFirstMaxNum;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author jovanimartinezrico
 */
public class FindFirstMaxNumTest {

    private FindFirstMaxNum firstMaxNum;
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    
    @Before
    public void setUp() {
        firstMaxNum = new FindFirstMaxNum();
    }

    @Test
    public void emptyArray() {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        assertEquals(-1, firstMaxNum.findNum(arrayNum));
    }

    @Test
    public void oneElementArray() {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        arrayNum.add(5);
        assertEquals(5, firstMaxNum.findNum(arrayNum));
    }

    @Test
    public void equalsElementsArray() {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        arrayNum.add(5);
        arrayNum.add(5);
        assertEquals(5, firstMaxNum.findNum(arrayNum));
    }

    @Test
    public void differentElementsArray() {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        arrayNum.add(5);
        arrayNum.add(6);
        arrayNum.add(2);
        arrayNum.add(3);
        arrayNum.add(4);
        arrayNum.add(7);
        assertEquals(6, firstMaxNum.findNum(arrayNum));
    }

    @Test
    public void nullArray() {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        thrown.expect(NullPointerException.class);
        firstMaxNum.findNum(null);
    }
    
    @Test
    public void ImproveArray() {
        int [] array = new int[]{2,3,7,5,6,8};
        assertEquals(7, firstMaxNum.findNumLogN(array));
    }
    
    @Test
    public void equalArray() {
        int [] array = new int[]{2,2,2};
        assertEquals(2, firstMaxNum.findNumLogN(array));
    }
    
    @Test
    public void diferentArray() {
        int [] array = new int[]{2,3,5,4};
        assertEquals(5, firstMaxNum.findNumLogN(array));
    }
    
    @Test
    public void difereArray() {
        int [] array = new int[]{6,3,5,4};
        assertEquals(6, firstMaxNum.findNumLogN(array));
    }
}
