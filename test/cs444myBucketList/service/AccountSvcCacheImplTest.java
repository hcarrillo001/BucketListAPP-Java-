/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.service;

import cs444myBucketList.domain.Account;
import cs444myBucketList.domain.Login;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carri
 */
public class AccountSvcCacheImplTest {
    
    public AccountSvcCacheImplTest() {
    }

    @Test
    public void testCRUD() {
        //AccountSvcCacheImpl impl = new AccountSvcCacheImpl();
        AccountSvcCacheImpl impl = AccountSvcCacheImpl.getInstance();                   //using singleton design.
        List<Account> accounts = impl.retrieveAll();
        assertEquals(accounts.size(),0);
        
        Account account = new Account();
        account.setFirstname("Hanns");
        account.setLastname("Carrillo");
        Login login = new Login();
        login.setUsername("hcar001");
        login.setPassword("1234567");
        account.setLogin(login);
        //Test create
        account = impl.create(account);
        assertNotNull(account);
        assertNotEquals(account.getId(), 0);            //we created an account above so we should not get a 0
          
        //Test retrieveAll
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        //Test update
        account.setFirstname("Jane");
        account = impl.update(account);
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        assertEquals(account.getFirstname(), "Jane");
        //Test Delete
        account = impl.delete(account);
        assertEquals(accounts.size(), 0);
        
        Account account1 = new Account();
        account1.setFirstname("John");
        account1.setLastname("Doe");
        Login login1 = new Login();
        login1.setUsername("jdoe");
        login1.setPassword("1234");
        account1.setLogin(login1);
        account1 = impl.create(account1);       //singleton
        assertNotNull(account1);
        
        Account account2 = new Account();
        account2.setFirstname("Jane");
        account2.setLastname("McDoe");
        Login login2 = new Login();
        login2.setUsername("jmcdoe");
        login2.setPassword("7584");
        account2.setLogin(login2);
        account2 = impl.create(account2);
        assertNotNull(account2);
        
        Login login3 = new Login();
        login3.setUsername("blah");
        login3.setPassword("yada");
        Account authenticateAccount = impl.authenticate(login3);
        assertNull(authenticateAccount);                                //authenticating test
        login3.setUsername("jdoe");
        authenticateAccount = impl.authenticate(login3);
        assertNull(authenticateAccount);
        login3.setPassword("1234");
        authenticateAccount = impl.authenticate(login3);
        assertNotNull(authenticateAccount); 
        login3.setUsername("jmcdoe");
        authenticateAccount = impl.authenticate(login3);
        assertNull(authenticateAccount);
        login3.setPassword("7584");
        authenticateAccount = impl.authenticate(login3);
        assertNotNull(authenticateAccount);
        
                
        
        
        
    }
    
}
