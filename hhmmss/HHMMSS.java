
package hhmmss;

import java.util.ArrayList;
import java.util.Scanner;


public class HHMMSS {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int sa;
        do{
        System.out.println("Enter number according to your selective category\n 1.Doctor\n2.Patients\n 3.Nurses\n4. Rooms\n 5.Appointment");
        int input=sc.nextInt();
        
        
        ArrayList<Doctor> d=new ArrayList<Doctor>();
        switch(input){
        case 1:
          //  =================Welcome to Doctor class==========================
        do{
         //============Main menu=======
        System.out.println("Menu\n1.add Doctor\n2.view Doctor\n3.remove Doctor\n4.search Doctor");
        int menu=sc.nextInt();
               switch(menu){
               case 1:
         //=========Add Doctor=======
               do{ 
                System.out.println("ID");
                int id=sc.nextInt();
                
                System.out.println("Name ");
                sc.nextLine();
                String name =sc.nextLine();
                
                System.out.println("gender ");
                String gender =sc.next();
                
                System.out.println("age ");
                int age =sc.nextInt();
                
                System.out.println("Email ");
                String email =sc.next();
                
                System.out.println("Specialist ");
                sc.nextLine();
                String Specialist=sc.nextLine();
                
                System.out.println("Salary :");
                int salary =sc.nextInt();
                
                System.out.println("Address ");
                sc.nextLine();
                String Address =sc.nextLine();
                
                System.out.println("Phone ");
                int phone =sc.nextInt();
                
             d.add(new Doctor(id,name,gender,age,email,Specialist,Address,phone,salary));
             System.out.println("if you want to enter more data enter 0 either 1");
             sa =sc.nextInt();
             }while(sa==0); 
            }
                
                
            switch(menu){
            case 2:
              //=============view Doctor=============


                for (int i=0;i<d.size();i++){



                        System.out.println("Id: "+d.get(i).getName());
                        System.out.println("Id :"+d.get(i).getId());
                        System.out.println("age :"+d.get(i).getAge());
                        System.out.println("Name:"+d.get(i).getGender());
                        System.out.println("Gender "+d.get(i).getEmail());
                        System.out.println("Specialist "+d.get(i).getSpecialist());
                        System.out.println("Phone :"+d.get(i).getPhone());
                        System.out.println("Salary : "+d.get(i).getSalary());

               }
              
               }
               //==========Remove Doctor===========
               switch(menu){
               case 3:
               do{
                   System.out.println(" Give Id of doctor yoy want to remove");
                   int id=sc.nextInt();
               for(int i =0;i<d.size();i++){
                    
                    if(id==d.get(i).getId()){
                    d.remove(i);
                    System.out.println("Removed");
                    }
                    
                }
               System.out.println("if you want to remove more data enter 0 either 1");
               sa =sc.nextInt();
               }while(sa==0); 
               }
                
             //  ============= Search Doctor===============
               switch(menu){
               case 4:
               do{
                   System.out.println(" Give Id of doctor");
                   int id=sc.nextInt();
               for(int i =0;i<d.size();i++){
                    
                    if(id==d.get(i).getId()){
                        System.out.println(d.get(i));
                    }
                    }
               System.out.println("if you want to search  more data enter 0 either 1");
               sa =sc.nextInt();
               }while(sa==0); 
               break;
               }
               
        System.out.println("if you want to continue to the functions  enter 0");
        sa =sc.nextInt();
        }while(sa==0);
        break;
        
       }
        // ==============================Patient Class===================
        ArrayList<Patient> p1=new ArrayList<Patient>();
        switch(input){
        case 2:
        do {
        //==========Main menu=============
        System.out.println("Menu\n1.add Patient\n2.view Patient \n3.remove Patient\n 4.search Patient");
        int menu=sc.nextInt();
               // =============Add Patient==============
                switch(menu){
                case 1:
                do{

                System.out.println("ID");
                int id=sc.nextInt();
                
                System.out.println("Name ");
                sc.nextLine();
                String name =sc.nextLine();
                
                System.out.println("gender ");
                String gender =sc.next();
                
                System.out.println("age ");
                int age =sc.nextInt();
                
                System.out.println("Email ");
                String email =sc.next();
                System.out.println("Address ");
                sc.nextLine();
                String Address =sc.nextLine();
                
                System.out.println("Phone ");
                int phone =sc.nextInt();
                
                System.out.println("Disease:");
                String disease =sc.next();
                p1.add(new Patient (id,name,gender,age,email,disease,Address,phone));

               System.out.println("if you want to enter more data enter 0 either 1");
               sa =sc.nextInt();
               }while(sa==0); 
                break;
               }
                
               //============View Patient=============
               switch(menu){
               case 2:


               for (int i=0;i<p1.size();i++){


                        System.out.println("Id: "+p1.get(i).getName());
                        System.out.println(" Id"+p1.get(i).getId());
                        System.out.println("age :"+p1.get(i).getAge());
                        System.out.println("Disease :"+p1.get(i).getDisease());
                        System.out.println("Name:"+p1.get(i).getGender());
                        System.out.println("Gender "+p1.get(i).getEmail());


                }
               
               break;
               }
                
              // ============Remove Patient=============
               switch(menu){
               case 3:
              do{
               System.out.println(" Give Id of patient ");
               int id=sc.nextInt();
               for(int i =0;i<p1.size();i++){
               
                    if(id==p1.get(i).getId()){
                    p1.remove(i);
                    System.out.println("Removed ");
                }
                }
               System.out.println("if you want to continue enter 0");
            sa =sc.nextInt();
            }while(sa==0);
               break;
                }
                
               //===========Search Patient=============
                switch(menu){
                case 4:
                do{
                System.out.println(" Give Id");
                int id=sc.nextInt();
                for(int i =0;i<p1.size();i++){
                
                    if(id==p1.get(i).getId()){
                    System.out.println(p1.get(i));
                    }      
                    }  
                System.out.println("if you want to search more data enter 0 either 1");
                sa =sc.nextInt();
                }while(sa==0); 
                }
            System.out.println("if you want to continue enter 0");
            sa =sc.nextInt();
            }while(sa==0);
            break;
        }
        
        //==================Nurses Class======================
        ArrayList<Nurses> n1=new ArrayList<Nurses>();
        switch(input){
        case 3:
        do{
            //Main Menu==============
        System.out.println("Menu\n1.add Nurses\n2.view Nurses \n3.remove Nurses\n4.search Nurses");
        int menu=sc.nextInt();
                //Add Data===========
                switch(menu){
                case 1:
                do{
                
                System.out.println("ID");
                int id=sc.nextInt();
                
                System.out.println("Name ");
                sc.nextLine();
                String name =sc.nextLine();
                
                System.out.println("gender ");
                String gender =sc.next();
                
                System.out.println("age ");
                int age =sc.nextInt();
                
                System.out.println("Email ");
                String email =sc.next();
                System.out.println("Address ");
                sc.nextLine();
                String Address =sc.nextLine();
                
                System.out.println("Phone ");
                int phone =sc.nextInt();
                
                System.out.println("enter salary");
                int salary=sc.nextInt();
              
                n1.add(new Nurses(id,name,gender,age,email,salary,Address,phone));
            
                System.out.println("if you want to enter more data enter 0 either 1");
                sa =sc.nextInt();
                }while(sa==0); 
                break;
                }
                
                //View Data====================
                switch(menu){
                case 2:
               
                
                for (int i=0;i<n1.size();i++){
                
                    
            
                        System.out.println("Id: "+n1.get(i).getName());
                        System.out.println("age :"+n1.get(i).getGender());
                        System.out.println("Name:"+n1.get(i).getAge());
                        System.out.println("Gender "+n1.get(i).getGender());
                        System.out.println("Salary :"+n1.get(i).getSalary());
             
            }
              
               break;
               }
               
                //Remove data======================
               switch(menu){
               case 3:
               do{
               System.out.println(" Give Id");
               int id=sc.nextInt();
               for(int i =0;i<n1.size();i++){
               
                    if(id==n1.get(i).getId()){
                    n1.remove(i);
                    System.out.println("Removed");
                    }
                }
               System.out.println("if you want to remove more data enter 0 either 1");
               sa =sc.nextInt();
               }while(sa==0); 
               break;
               }
               // Search Data===================
               switch(menu){
               case 4:
               do{
               System.out.println(" Give Id");
               int id=sc.nextInt();
               for(int i =0;i<n1.size();i++){
               
                    if(id==n1.get(i).getId()){
                    System.out.println(n1.get(i));
                    }
                  
               }
               System.out.println("if you want to search more data enter 0 either 1");
               sa =sc.nextInt();
               }while(sa==0); 
               break;
              }
        System.out.println("if you want to continue  to functions enter 0");
        sa =sc.nextInt();
        }while(sa==0);
        break;
        }
        
        // Rooms Class====================
        ArrayList<Rooms> r1 =new ArrayList<Rooms>();
        switch(input){
        case 4:
        do{
        // Main menu===================    
        System.out.println("Menu\n1.add Room\n2.view  Room\n3.remove Room\n4.search Room");
        int menu=sc.nextInt();
        //Add Data============
               switch(menu){
               case 1:
               do{
                System.out.println("enter charges");
                int Charges=sc.nextInt();
               
                System.out.println("enter status");
                sc.nextLine();
                String Status=sc.nextLine();
                 
                System.out.println("enter type");
                sc.nextLine();
                String Type=sc.nextLine();
     
                System.out.println("enter no");
                int No=sc.nextInt();
             
                r1.add(new Rooms(Status,No,Type,Charges));
               
               System.out.println("if you want to enter more data enter 0 either 1");
               sa =sc.nextInt();
               }while(sa==0); 
               break;
               }
               
               //View Data==================
               switch(menu){
               case 2:
               
               for (int i=0;i<r1.size();i++){
              
                   
                
                        System.out.println("charges"+r1.get(i).getCharges());
                        System.out.println("status"+r1.get(i).getStatus());
                        System.out.println("type"+r1.get(i).getType());
                        System.out.println("no"+r1.get(i).getNo());
                
                }
                
               break;
               }
                
               //Remove Data================
               switch(menu){
               case 3:
               System.out.println(" Give  Room Number");
               int RoomNo=sc.nextInt();
               do{
                for(int i =0;i<r1.size();i++){
                
                    if(RoomNo==r1.get(i).getNo()){
                    r1.remove(i);
                    System.out.println("Removed");
                    }
                }
                System.out.println("if you want to remove more data enter 0 either 1");
                sa =sc.nextInt();
                }while(sa==0); 
               break;
               }
               
               //Search Data=================
               switch(menu){
               case 4:
               do{
                   System.out.println(" Give Room Number");
               int RoomNo=sc.nextInt();
               for(int i =0;i<r1.size();i++){
                        if(RoomNo==r1.get(i).getNo()){
                        System.out.println(r1.get(i));
                    }
                  
                }
                System.out.println("if you want to search more data enter 0 either 1");
                sa =sc.nextInt();
                }while(sa==0); 
               break;
                }
        System.out.println("if you want to continue enter 0");
        sa =sc.nextInt();
        }while(sa==0);
        break;
        }
               
        //============Appointment Class=================
        ArrayList<Appointment> a1 =new ArrayList<Appointment>();
        switch(input){       
        case 5:
        do{
            //Main Menu ==================
        System.out.println("Menu\n1.add Appointment\n2.view Appointment\n3.remove Appointment\n4.search Appointment");
        int menu=sc.nextInt();
              //Add Data================
              switch(menu){
              case 1:
              do{
              System.out.println("enter aptid");
              int aptId=sc.nextInt();
              
              System.out.println("enter name");
              sc.nextLine();
              String aptName=sc.nextLine();
              
               
              System.out.println("enter drid");
              int drId=sc.nextInt();
               
              System.out.println("enter drname");
              sc.nextLine();
               String drName=sc.nextLine();
              
              System.out.println("enter aptshift");
              String aptShift=sc.nextLine();
               
              System.out.println("Enter  time of your appointment (hh:mm aa):");
              String time =sc.nextLine();
              
             a1.add(new Appointment(aptId,aptName,drId,drName,aptShift,time));
             
             System.out.println("if you want to enter more data enter 0 either 1");
             sa =sc.nextInt();
             }while(sa==0);
             }
              
              //View Data===========================
             switch(menu){
             case 2:
             
             for(int i=0;i<a1.size();i++){
                  
             
                    System.out.println("id"+a1.get(i).getAptName());
                    System.out.println("Doctor nmae "+a1.get(i).getDrName());
                    System.out.println("Aptid name "+a1.get(i).getAptShift());
                    System.out.println("Doctor id "+a1.get(i).getAptId());
                    System.out.println("Appointment type"+a1.get(i).getDrId());
                    System.out.println("Time :"+a1.get(i).getTime());
             
             
             }
             
             break;
             }
              
             //Remove Data========================
            switch(menu){
            case 3:
            do{
            System.out.println(" Give Id of patient ");
            int id=sc.nextInt();
            for(int i =0;i<a1.size();i++){
            
                    if(id==a1.get(i).getAptId()){
                    a1.remove(i);
                    System.out.println("Removed");
                    }
            }
            System.out.println("if you want to remove more data enter 0 either 1");
            sa =sc.nextInt();
            }while(sa==0); 
            break;
            }
             //Search Data=========================
            switch(menu){
            case 4:
            do{
            System.out.println(" Give Id of person you want to search");
            int id=sc.nextInt();
            for(int i =0;i<a1.size();i++){
            
                    if(id==a1.get(i).getAptId()){
                        System.out.println(a1.get(i));
                    }      
     
            } 
             System.out.println("if you want to enter more data enter 0 either 1");
             sa =sc.nextInt();
             }while(sa==0); 
            break;
               }
               
        System.out.println("if you want to continue  to funtions enter 0");
        sa =sc.nextInt();
        }while(sa==0);
        break; 
        }
           
           
    System.out.println("if you want to continue to other classes enter 0");
    sa=sc.nextInt();
    }while(sa==0);
    }
}