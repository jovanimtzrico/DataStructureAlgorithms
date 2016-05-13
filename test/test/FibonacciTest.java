/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import algorithms.Fibonacci;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jovanimartinezrico
 */
public class FibonacciTest {
    Fibonacci fibonacci;
   
    
    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }
    
     @Test
     public void fibonacci0() {
         assertEquals(0, fibonacci.getFibonacci(0), 0);
         assertEquals(1, fibonacci.getFibonacci(1), 0);
         assertEquals(144, fibonacci.getFibonacci(12), 0);
         assertEquals(6765, fibonacci.getFibonacci(20), 0);
         assertEquals(46368, fibonacci.getFibonacci(24), 0);
         assertEquals(317811, fibonacci.getFibonacci(28), 0);
     }
}
