/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carri
 */

public class BucketListProgressBar {
   private double minPercent;
   private double maxPercent;
   private double calculatedPercent;

    public BucketListProgressBar() {
        minPercent = 0;
        maxPercent = 100;
        calculatedPercent = 0;
    }
   
   

    public double getMinPercent() {
        return minPercent;
    }

    public void setMinPercent(double minPercent) {
        this.minPercent = minPercent;
    }

    public double getMaxPercent() {
        return maxPercent;
    }

    public void setMaxPercent(double maxPercent) {
        this.maxPercent = maxPercent;
    }

    public double getCalculatedPercent() {
        return calculatedPercent;
    }

    public void setCalculatedPercent(double calculatedPercent) {
        this.calculatedPercent = calculatedPercent;
    }
    
  
   
   
   
   
   
   public double calculateProgress(List<BucketListItem> bucketList){
       double completedItems = 0;
       for(BucketListItem item : bucketList){
           if(item.getIsCompleted().equals("Y")){
               completedItems++;
           }
       }
       
       calculatedPercent = (completedItems/bucketList.size() ) * 100;              
       
       return calculatedPercent;    
   }
    
    
    
}
