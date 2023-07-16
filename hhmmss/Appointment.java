
package hhmmss;

import java.util.Scanner;


public class Appointment {
 int aptId;
 String aptName;
 int drId;
 String drName;
 String aptShift;
 String time;

   

    @Override
    public String toString() {
        return "Appointment{" + "aptId=" + aptId + ", aptName=" + aptName + ", drId=" + drId + ", drName=" + drName + ", aptShift=" + aptShift + ",time=" +time+ '}';
    }
 
 public Appointment(int aptId,String aptName,int drId,String drName,String aptShift,String time){
     setAptId(aptId);
     setAptName(aptName);
     setDrId(drId);
     setDrName(drName);
     setAptShift(aptShift);
     setTime(time);
     
 }
 
 
 public void setAptId(int aptid){
   
     this.aptId=aptid;
 }
 public int getAptId(){
     return aptId;
 }
 public void setAptName(String name){
     this.aptName=name;
 }
 public String getAptName(){
     return aptName;
 }
 public void setDrId(int drid){
      this.drId=drid;
 }
 public int getDrId(){
     return drId;
 }
 public void setDrName( String drname){
     
     this.drName=drname;
 }
 public String getDrName(){
     return drName;
 }
 public void setAptShift(String aptshift){
     this.aptShift= aptshift;
 }
 public String getAptShift(){
     return aptShift;
 }
 public String getTime() {
     return time;
 }
 public void setTime(String time) {
     this.time = time;
 }
 
 }




