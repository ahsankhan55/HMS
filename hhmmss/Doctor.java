/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhmmss;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Doctor extends Person{
   String Specialist;
   int salary;

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email + "Specialist=" + Specialist + ", Address=" + Address + ", phone=" + phone + ", salary=" + salary + '}';
    }
   
   Scanner sc =new Scanner(System.in);
   Doctor(int id,String name,String gender,int age,String email,String Specialist,String Address,int phone,int salary){
        
         super(id,name ,gender,age,email,Address,phone);
         setSpecialist(Specialist);
         setSalary(salary);
        
         }
   
    
   
    public void setSpecialist(String Specialist){
           this.Specialist=Specialist;
    }
    public String getSpecialist(){
           return Specialist;
    }
    public void setSalary(int salary){
           this.salary=salary;
    }
    public int getSalary(){
           return salary;
    }
     
          
}

