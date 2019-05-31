/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.domain;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author carri
 */
public class Account {
    private String firstname = "";
    private String lastname = "";
    private String emailAddress = "";
    private int id = 0;                         //might be the same as nextId;
    private Login login = null;
    private List<BucketListItem> bucketListItems = new LinkedList<BucketListItem>();

    private BucketListProgressBar progressBar = new BucketListProgressBar();
    
  
    private int nextId = 0;
    
    public BucketListItem add(BucketListItem item){
        item.setId(++nextId);
        bucketListItems.add(item);          //add item to list of bucketListItems
        return item;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<BucketListItem> getBucketListItems() {
        return bucketListItems;
    }

    public void setBucketListItems(List<BucketListItem> bucketListItems) {
        this.bucketListItems = bucketListItems;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public BucketListProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(BucketListProgressBar progressBar) {
        this.progressBar = progressBar;
    }
    
   
    public boolean validate(){
        if(this.emailAddress == null || (this.emailAddress.equals(""))){
            System.out.println("Hello world");
             return false;
             
        }
        if(!(validateEmail(this.emailAddress) )){
                return false;                       //verfiying email format
        }
           
        if(this.firstname == null || (this.firstname.equals(""))){
            //DEBUGSystem.out.println("first");
            return false;
        }
        if(this.lastname == null || (this.lastname.equals(""))){
            //DEBUGSystem.out.println("last");
            return false;
        }
        
        if(this.login == null ){
            //DEBUGSystem.out.println("login");
            return false;
        }
        
        return true;
    }
    
    
    public boolean validateEmail(String email){
        Matcher matcher;
        Pattern pattern;
        System.out.println("Hello World");
        
        String emailRegualExpression = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"            //uses the regex pattern to validate email.
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        pattern = Pattern.compile(emailRegualExpression);      //generates the pattern
        matcher = pattern.matcher(email);
        
        System.out.println("Matches: " + matcher.matches());
        return matcher.matches(); //return true if the pattern matches, if not it returns false;
    }
    
}
