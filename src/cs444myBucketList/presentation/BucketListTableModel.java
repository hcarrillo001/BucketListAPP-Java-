/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.presentation;
import cs444myBucketList.domain.*;
import java.util.*;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author carri
 */
public class BucketListTableModel extends AbstractTableModel{
    //this class allows us to access to the data of the tableView
    
    private String[] columnNames = {"Item name","Estimated Completion Date", "Completed"};
    private List<BucketListItem> bucketListItems = new LinkedList<BucketListItem>();
    
    public void setBucketListItems(List<BucketListItem> bucketListItems){
        this.bucketListItems = bucketListItems;
    }
    
    @Override
    public int getRowCount(){
        return bucketListItems.size();
    }
    
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int row, int column){
        BucketListItem bucketListItem = bucketListItems.get(row);
        switch(column){
            case 0:
                return bucketListItem.getItemName();
            case 1:
                 return bucketListItem.getEstCompletionDate();
            case 2:
                 return bucketListItem.getIsCompleted();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
}
