/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplefortesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian
 */
public class ExampleForTestingTest {
    
    public ExampleForTestingTest() {
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

    /**
     * Test of main method, of class ExampleForTesting.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExampleForTesting.main(args);
    }

    /**
     * Test of getFive method, of class ExampleForTesting.
     */
    @Test
    public void testGetFive() {
        System.out.println("getFive");
        int expResult = 5;
        int result = ExampleForTesting.getFive();
        assertEquals(expResult, result);    
        
    }
    
}
