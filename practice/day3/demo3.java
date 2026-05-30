// syntax for import - > import packageName.class_name  
// importing Coleege student and Normal Student so that i can use that here becuase they are in different package 


import College1.student1;

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
    student1 s1 = new student1();
    // to call this print() we have to make this print() as public because we are accessing in different package 
     s1.print();

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