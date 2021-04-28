/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stiv
 */
public class BMIReadingsTest {
    
    public BMIReadingsTest() {
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
     * Test of isMostRecentFirst method, of class BMIReadings.
     */
    @Test
    public void testIsMostRecentFirst() {
        System.out.println("isMostRecentFirst");
        BMIReadings instance = new BMIReadings();
        boolean expResult = true;
        instance.setMostRecentFirst(true);
        assertEquals(expResult, instance.isMostRecentFirst());
    }

    /**
     * Test of setMostRecentFirst method, of class BMIReadings.
     */
    @Test
    public void testSetMostRecentFirst() {
        System.out.println("setMostRecentFirst");
        boolean mostRecentFirst = false;
        BMIReadings instance = new BMIReadings();
        instance.setMostRecentFirst(mostRecentFirst);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(false, instance.isMostRecentFirst());
    }

    /**
     * Test of addReading method, of class BMIReadings.
     */
    @Test
    public void testAddReading() {
        System.out.println("addReading");
        BMIData bmid = new BMIData();
        BMIReadings instance = new BMIReadings();
        fail("Not Yet Implemented.");
        
    }

    
    
}
