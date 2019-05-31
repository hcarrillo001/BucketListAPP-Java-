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
public class BucketListItemTest {
    
    public BucketListItemTest() {
    }

    @Test
    public void testValidate() {
        BucketListItem item = new BucketListItem();
        boolean result = item.validate();
        assertFalse(result);
        item.setItemName("Sky Diving");
        result = item.validate();
        assertFalse(result);
        item.setDescription("I want to jump out of a plane by my next birthday");
        result = item.validate();
        assertFalse(result);
        item.setEstCompletionDate("31-10-2018");        //change this date to validate date
        result = item.validate();   
        item.setIsCompleted("N");
        result = item.validate();
        assertTrue(result);                     //at this point every variable has been changed and should return true
        
    }
    
    
}
