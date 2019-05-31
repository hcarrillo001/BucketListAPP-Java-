/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author carri
 */
public class BucketListItem {
    private String itemName = "";
    private String description = "";
    private String estCompletionDate = ""; 
    private String completed = "";             
    private int id = 0;
    
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");        //using this to validate date format sets the date format of my choice
    
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEstCompletionDate() {
        return estCompletionDate;
    }

    public String getIsCompleted() {
        return completed;
    }

    public void setIsCompleted(String completed) {
        this.completed = completed;
    }
    

    public void setEstCompletionDate(String estCompletionDate) {
        this.estCompletionDate = estCompletionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public boolean validate(){    
        
        if(this.itemName == null || (this.itemName.equals(""))){
             return false;
        }
           
        if(this.description == null || (this.description.equals(""))){
            return false;
        }
        if(this.completed == null || (this.completed.equals("")) || ( !(this.completed.equalsIgnoreCase("N")) && !(this.completed.equalsIgnoreCase("Y")) ) ){
            return false;
        }
        if(this.estCompletionDate == null || (this.estCompletionDate.equals(""))){
            return false;                                                               //have to make sure my String is not null or empty first before validateing the date format
        }
        dateFormat.setLenient(false);
        try {
            //if not valid, it will throw ParseException
            Date date = dateFormat.parse(this.estCompletionDate);           //parse needs to be in a try catch block because of the exception it can throw
	} catch (Exception e){                                              //this information I had to look up online. Im only using the SimpleDateFormate object to validate my date String
            System.out.println("ERROR *** " + e.getMessage());
            return false;   //return falses false if invalid String
	}
        
        
        return true;
    }
    
}
