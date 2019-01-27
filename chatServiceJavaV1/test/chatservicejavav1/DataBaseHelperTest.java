/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservicejavav1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian
 */
public class DataBaseHelperTest {
    
    public DataBaseHelperTest() {
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
     * Test of connect method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testConnect() {
        System.out.println("connect");
        DataBaseHelper instance = null;
        instance.connect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServer method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testGetServer() {
        System.out.println("getServer");
        DataBaseHelper instance = null;
        String expResult = "";
        String result = instance.getServer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServer method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testSetServer() {
        System.out.println("setServer");
        String server = "";
        DataBaseHelper instance = null;
        instance.setServer(server);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabase method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testGetDatabase() {
        System.out.println("getDatabase");
        DataBaseHelper instance = null;
        String expResult = "";
        String result = instance.getDatabase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatabase method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testSetDatabase() {
        System.out.println("setDatabase");
        String database = "";
        DataBaseHelper instance = null;
        instance.setDatabase(database);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsr method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testGetUsr() {
        System.out.println("getUsr");
        DataBaseHelper instance = null;
        String expResult = "";
        String result = instance.getUsr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsr method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testSetUsr() {
        System.out.println("setUsr");
        String usr = "";
        DataBaseHelper instance = null;
        instance.setUsr(usr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        DataBaseHelper instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class DataBaseHelper.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        DataBaseHelper instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
