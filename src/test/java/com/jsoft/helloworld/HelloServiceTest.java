/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jsoft.helloworld;

import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T
 */
public class HelloServiceTest {
    
    public HelloServiceTest() {
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
     * Test of printMessage method, of class HelloService.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        String name = "Joe";
        HelloService instance = new HelloService();
        Response result = instance.printMessage(name);
        
        assertEquals("Hello Joe", result.readEntity(String.class));
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
