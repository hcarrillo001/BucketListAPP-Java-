/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carri
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testValidate() {
        Login login = new Login();      //create login object
        boolean result = login.validate();
        assertFalse(result);            //checks we get a false;
        login.setUsername("hanns001");
        result = login.validate();
        assertFalse(result);            //this is still false because the password this is false.
        login.setPassword("1234");
        result = login.validate();
        assertTrue(result);             //this should be true because both username and password are not "" or null; 
    }
    @Test   //this is needed in order to test it.
    public void testEquals(){
        Login login1 = new Login();
        login1.setUsername("johndoe");
        login1.setPassword("1234");
        
        Login login2 = new Login();
        login2.setUsername("janedoe");
        login2.setPassword("5678");
        
        assertFalse(login1.equals(login2));
        login2.setUsername("johndoe");
        assertFalse(login1.equals(login2));         //this is still false because the password is still not the same
        login2.setPassword("1234");
        boolean answer = login1.equals(login2);
        
        assertTrue(login1.equals(login2));
        
        
    }
    
}
