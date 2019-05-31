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
public class AccountTest {
    
    public AccountTest() {
    }

    @Test
    public void testValidate() {
        Account account = new Account();
        boolean result = account.validate();
        assertFalse(result);
        account.setFirstname("Hanns");
        result = account.validate();
        assertFalse(result);
        account.setLastname("Carrillo");
        result = account.validate();
        assertFalse(result);
        account.setEmailAddress("carrillo@regis.edu");
        result = account.validate();
        assertFalse(result);
        Login login = new Login();
        account.setLogin(login);
        result = account.validate();            
        assertFalse(result);
        account.setId(1);
        result = account.validate();
        assertTrue(result);                     //at this point everything is initialized and should validate() returns true
        
        
    }
    
}
