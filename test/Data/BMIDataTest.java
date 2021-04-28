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
public class BMIDataTest {
    
    public BMIDataTest() {
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
     * Test of getFlHeightInMetres method, of class BMIData.
     */
    @Test
    public void testGetFlHeightInMetres() {
        System.out.println("getFlHeightInMetres");
        BMIData instance = new BMIData();
        float expResult = 0.0F;
        float result = instance.getFlHeightInMetres();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHeightWeightAndUnits method, of class BMIData.
     */
    @Test
    public void testSetHeightWeightAndUnits() {
        System.out.println("setHeightWeightAndUnits");
        String h = "1.8";
        String w = "100";
        boolean useM = true;
        boolean useKg = true;
        BMIData instance = new BMIData();
        instance.setHeightWeightAndUnits(h, w, useM, useKg);
        assertEquals(instance.getFlResult(),31,1);
    }

    /**
     * Test of setFlHeightInMetres method, of class BMIData.
     */
    @Test
    public void testSetFlHeightInMetres() {
        System.out.println("setFlHeightInMetres");
        float flHeightInMetres = 1.8F;
        BMIData instance = new BMIData();
        instance.setFlHeightInMetres(flHeightInMetres);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1.8F, instance.getFlHeightInMetres(),0.0);
    }

    /**
     * Test of getFlWeightInKg method, of class BMIData.
     */
    @Test
    public void testGetFlWeightInKg() {
        System.out.println("getFlWeightInKg");
        BMIData instance = new BMIData();
        float expResult = 100.0F;
        instance.setFlWeightInKg(expResult);
        float result = instance.getFlWeightInKg();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and 
    }

    /**
     * Test of setFlWeightInKg method, of class BMIData.
     */
    @Test
    public void testSetFlWeightInKg() {
        System.out.println("setFlWeightInKg");
        float flWeightInKg = 100.0F;
        BMIData instance = new BMIData();
        instance.setFlWeightInKg(flWeightInKg);
        float expResult = flWeightInKg;
        assertEquals(flWeightInKg, instance.getFlWeightInKg(),0.0);
    }

    /**
     * Test of getFlResult method, of class BMIData.
     */
    @Test
    public void testGetFlResult() {
        System.out.println("getFlResult");
        BMIData instance = new BMIData();
        float expResult = 0.0F;
        float result = instance.getFlResult();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFlResult method, of class BMIData.
     */
    @Test
    public void testSetFlResult() {
        System.out.println("setFlResult");
        float flResult = 0.0F;
        BMIData instance = new BMIData();
        instance.setFlResult(flResult);
    }

    /**
     * Test of toString method, of class BMIData.
     */
   
    
}
