/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.domain;

/**
 *
 * @author carri
 */
public class Login {
    private String username = "";
    private String password= "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate(){
        if(this.username == null || (this.username.equals(""))){
            return false;
        }
        if(this.password == null || (this.password.equals(""))){
            return false;
        }
        
        return true;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Login)){
            return false;
        }
        
        Login login = (Login)obj;   //cast object into a log in.
        if(!this.username.equals(login.getUsername())) return false;
        if(!this.password.equals(login.getPassword())) return false;
        return true;
    }
    
    
    
}
