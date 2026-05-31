
public class demo{

public static void main(String[] args) {
    // int a = 5;
    // System.out.println("Start");
    // System.out.println(a/0);
    // System.out.println("end");

    // THE OUTPUT IS  START -> THEN EXCEPTION -> THEN THE PROGRAM WILL TERMINATE MEANS THAT THE PROGRAM WILL NOT WORK AFTER AN EXCEPTION IS OCCURED AND IT IS NOT HANDLED 
    // if we dont control Exception then jvm decides everything but we want our control 
    // TO HANDLE EXCEPTION WE USE TRY AND CATCH BLOCK 
     


    int a = 10;
    
    try{
        a = a/0;

    }

    // catch(ArithmeticException e){
    //     System.out.println("Division by zero is not allowed");
    // }
    // HERE WE HANDLE EXCEPTION USING TRY AND CATCH BLOCK 


    // FINALLY BLOCK -> THIS ALWAYS RUN EITHER EXCEPTION OCCURED OR NOT  -> format alway use with try -> we can use FINALLY BLOCK without using the catch block 
    
    finally{
        // mainly used for cleanup code, resource close 
        System.out.println("I Aways Runs I Am Finally Block");
    }


}
}