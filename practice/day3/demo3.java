// syntax for import - > import packageName.class_name  
// importing Coleege student and Normal Student so that i can use that here becuase they are in different package 


// import College1.student1;
// import Student.student1;

// insted of importing this i can import like this 

import College1.*;

import Student.*;
import Student.student1;

public class demo3{
public static void main(String[] args){
    // BankAcoount b = new BankAcoount();
    // // depositing the amount 
    // b.deposit(10000);
    // // withdrawing the amount 
    // b.withdraw(200);
    // // checking the balance 
    // System.out.println(b.checkBalance());

    // creating the object of the imported package 
    // student1 s1 = new student1();
    // to call this print() we have to make this print() as public because we are accessing in different package 
    //  s1.print();

    // if we have import two packages and in both packages we have the print() so which print() will get call ?
    // student1 s2 = new student1();
    // s2.print();

    // becuase these print () are in diff packages so there is no issue but if the two print() are in same package 
    //   if these are in same package it will give error becuase it is not able to understand which print() you want to call

    // i also wanted to make the school student but i cannot make it directly because it is giving error becuase of same name 
    //  so packagename.classname s2 = new package_name.classname 

    // Student.student1 s2 = new Student.student1();
    //  s2.print();

    // importing all classes of any package at onces  -> import packagename.*   
    // import College1.*;
     

    College1.student1 s1 = new  College1.student1();
    s1.print();
    
    Student.student1 s2 = new Student.student1();
    s2.print();


}
}




// class BankAcoount{

//     private double balance;
    
//     // deposit method 
//     public void deposit(int amount){
//         balance+=amount;
//     }

//     // withdraw method 
//     public void withdraw(int amount){
//         balance-=amount;
//     }

//     // check balance
//     public double checkBalance(){
//         return balance;
//     }

// }

// class student{
//     private String name;
//      private int rollNumber;
//     private  int age;
//     private String college;
    
//     // making the constructor
//     student(String name,int roll_no,int age,String college){
//         this.name = name;
//         this.rollNumber = roll_no;
//         this.age = age;
//         this.college = college;
//     }

//     // getters and setters 

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     // in seters we can add validations 
// }





// syntax for import
// import package_name.class_name


