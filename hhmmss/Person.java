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
public class Person {
   
    int id;
    String name;
    String gender;
    int age;
    String Address;
    long phone;
    String email;
    Scanner sc =new Scanner(System.in);
    Person(int id,String name,String gender,int age,String email,String Address,long phone){
       setId(id);
       setName(name);
       setGender(gender);
       setAge(age);
       setAddress(Address);
       setphone(phone);
       setEmail(email);
       
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email + ", sc=" + sc + '}';
    }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    public String getAddress(){
        return Address;
    }
    public void setphone(long phone){
        this.phone=phone;
    }
    public long getPhone(){
        return phone;
    }
}
