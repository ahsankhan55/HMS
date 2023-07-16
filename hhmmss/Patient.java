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
public class Patient extends Person {
    String disease;

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email + "disease=" + disease + ", Address=" + Address + ", phone=" + phone + '}';
    }
    
   Patient(int id,String name,String gender ,int age,String email,String disease,String Address,long phone){
       super(id,name,gender,age,email,Address,phone);
       setDisease(disease);
   }
    public String   getDisease(){
       return disease;
    }
    public void setDisease(String disease) {
       this.disease = disease;
   }
 
 
}


