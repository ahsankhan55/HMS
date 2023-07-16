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
public class Nurses  extends Person{
int salary;

    @Override
    public String toString() {
        return "Nurses{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email + "salary=" + salary + ", Address=" + Address + ", phone=" + phone +  '}';
    }

    public Nurses(int id,String name,String gender,int age,String email,int salary,String Address,long phone){
        super(id,name,gender,age,email,Address,phone);
        SetSalary(salary);
        
    }
    
    
    public void SetSalary(int salary){
       this.salary=salary;
    }
    public int getSalary(){
       return salary;
    }
}    

