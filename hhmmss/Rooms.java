/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhmmss;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Rooms {
String Status;
int No;
String Type;
int Charges;

    @Override
    public String toString() {
        return "Rooms{" + "Status=" + Status + ", No=" + No + ", Type=" + Type + ", Charges=" + Charges + '}';
    }

    public Rooms(String Status,int No,String Type,int Charges){
    setStatus(Status);
    setNo(No);
    
    setType(Type);
    setCharges(Charges);
          
    
}

Scanner s=new Scanner (System.in);
public void setStatus( String status){
   
    this.Status=status;
}
public String getStatus(){
    return Status;
    
}
public void setType(String type){
    
    this.Type=type;
}
public String getType(){
    return Type;
    
}
public void setCharges(int charges){
     this.Charges=charges;
}
public int getCharges(){
    return Charges;
    
}
public void setNo(int no){
 
    this.No=no;
}
public int getNo(){
    return No;
    
}
}
