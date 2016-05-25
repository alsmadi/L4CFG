/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import l4cfg.L4CFG; 


/**
 *
 * @author IAlsmadi
 */
public class L4CFGTest {
    
    public L4CFGTest() {
    }
    L4CFG c1;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c1= new L4CFG();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void T1LoopFalse() {
         assertEquals(c1.testString(""),"");
     }
     
      @Test
     public void T1LoopTrue() {
         assertEquals(c1.testString("a"),"a");
     }
     
     @Test
     public void T1LoopMoreThanOnce() {
         assertEquals(c1.testString("ab"),"ab");
     }
}
