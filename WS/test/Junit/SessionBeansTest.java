/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Junit;

import WS.JSF.CorreosController;
import WS.JSF.PersonasController;
import WS.JSF.TelefonosController;
import WS.Session.MySessionBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author einstein pc
 */
public class SessionBeansTest {
    MySessionBean session = new MySessionBean();
    CorreosController perController = session.correosInstancia();
    PersonasController corController = session.perInstancia();
    TelefonosController telController = session.telInstancia();

    public SessionBeansTest() {
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
        instancias();
        getItems();
    }
    
    @Test
    public void instancias(){
        assertNotNull(perController);
        assertNotNull(corController);
        assertNotNull(telController);
    }
    
    @Test
    public void getItems(){
        
      assertNotNull(perController.prepareList());
      assertNotNull(corController.prepareList());
      assertNotNull(telController.prepareList());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
