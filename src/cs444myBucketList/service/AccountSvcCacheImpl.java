/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.service;

import cs444myBucketList.domain.Account;
import cs444myBucketList.domain.Login;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carri
 */
public class AccountSvcCacheImpl implements IAccountSvc {
    
    private List<Account> cache = new ArrayList<Account>();
    private int nextId = 0;
    private static AccountSvcCacheImpl instance = new AccountSvcCacheImpl();                //static
    
    public AccountSvcCacheImpl(){
                                  
    }
    
    public static AccountSvcCacheImpl getInstance(){                                        //static
        return instance;
    }
    
    public Account create(Account account){
        account.setId(++nextId);
        cache.add(account);
        return account;
    }
    public List<Account> retrieveAll(){
        return cache;
    }
    
    public Account update(Account account){
        for(int i = 0; i < cache.size(); i++){
            Account next = cache.get(i);
            if(next.getId() == account.getId()){
                cache.set(i, account);
                break;
            }
            
        }
        return account;
    }
    public Account delete(Account account){
        for(int i = 0; i < cache.size(); i++){
            Account next = cache.get(i);
            if(next.getId() == account.getId()){
                cache.remove(i);
                break;
            }
            
        }
        return account;
    }
    
    public Account authenticate(Login login){
        Account account = null;
        for(int i = 0; i < cache.size(); i++){
            account = cache.get(i);
            Login accountLogin = account.getLogin();                //getLogin comes from account. Login associated witht that account
            if(login.equals(accountLogin)){
                return account;
            }
        }
        
        return null;
    }
    
    
    
}
