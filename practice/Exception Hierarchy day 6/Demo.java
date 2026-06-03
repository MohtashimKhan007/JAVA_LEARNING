// public class Demo{
//     public static void main(String[] args) {
//         try{
//            System.out.println("Outer Try Starts");
//            try{
//             System.out.println("Inner Try Starts");
//             System.out.println(5/0); //new Arithmetic Exception
//             System.out.println("Inner Try ends");
//            }
//            catch(ArithmeticException e){
//               System.out.println("Divide by zero Occured Inner");
//            }
//         }
//         catch(ArithmeticException e){
//             System.out.println("Divide by zero Occured Outer");

//         }
//     }
// }


// OUTPUT OF THIS 
// OUTER TRY STARTS-> INNER TRY STARTS -> THEN EXCEPTION OCCURED ->DIVIDE BY ZERO OCCURED INNER 
// INNER TRY HANDLES ITS OWN EXCEPTION 
// WE  CAN ALSO DO NESTING IN CATCH BLOCK  -> AVOID NESTED TRY CATCH BECUASE IT MAKES THE THINGS COMPLLICATED



// HIERARCHY OF  EXCEPTION HANDLING 


            //   THROWABLE 
            //   /       \
            //  ERROR   EXCEPTION   -> WE NEVER THROUGH ERROR BY OURSELFES

            // EXAMPLE OF ERRORS -> LIKE HEAP MEMORY OVERFLOWS IN THAT CONDITION WE CANT DO ANYTHING 

            // WE HAVE THREE METHODS WHICH WE CALL ON OUR EXCEPTIONS -> GETMESSAGE(), PRINTSTACKTRACE(), TOSTRING() 



    //           EXCEPTION TYPES
    //           /             \
    // RUNTIME EXCEPTION(UNCHECKED EXCEPTION)                                                                           CHECKED EXCEPTION(COMPILED TIME EXCEPTION)
    // (ArithmeticException -> ILLEGAL ARITHMETIC OPS LIKE /0,
    // NullPointerException -> IF YOU TRY TO ACCESS SOMETHING WHICH IS ALREADY NULL
    //   INDEXOUTOFBOUND EXCEPTION  -> THIS CONTAINS(ARRAY OUT OF BOND EXCEPTION AND STRING OUT OF BOND EXCEPTION )
    //    ILLEGALARGUMENT EXCEPTON ->(NUMBER FORMAT EXCEPTON -> IF YOU TRY TO CONVERT INVALID STRING INTO NUMBER EX INTEGER.PARSEINT('ABC'))-> HERE WE CANNOT CONVERT THIS WE 
    // CAN CONVERT '123' TO  NUMBER BUT NOT ANY OTHER THING;
        // ILLEGALSTATE EXCETPITON
        // CLASS CAST EXCEPTION -> MANLO STRING KO CONVERT KRRE INTEGER ME TO AAJAYEGA YE ERROR 
    // )


    /*
    CHECKED exception  -> these Exception Occured at Compiled Time for Example
    -> IO EXCEPTION
    -> SQL EXCEPTION
    ->CLASS NOT FOUND EXCEPTION

     */

// public class Demo{
//     public static void main(String[] args){
//        try{
//         // System.out.println(5/0);
//         String s = null;
//         System.out.println(s.length());
//        }
//        catch(ArithmeticException e){  // here instead of arithmetic exception we can also use its parent exception like Throwable but is not recommended because Throwable is 
//         // extended by error as well as exception class so it can catch error also



//         // PARENT OF ALL TYPE OF EXCEPTION IS EXCEPTION SO WE CAN USE EXCEPTION 
//            System.out.println(e.getMessage());
//         }



//          // if  the exception is not caught by any other catch this block will catch it becuase Exception is the Parent of all the Exceptions
//         // catch(Exception e){
//         //     System.out.println("Generic Exception Occured");
//         // }

//         // WE CAN WRITE MULTIPLE CATCH AND IT WILL BE EVALUATED FROM TOP TO BOTTOM 
//         //IF WE WRITE THE EXCEPTION E THIS EXCEPTION AT THE TOP AND THIS IS THE PARENT OF ALL THE EXCEPTION SO THE EXCEPTIONS WRITTEN BELOW ARE ARE UNREACHABLE SO WE GET 
//         // ERROR OF UNREACHABLE 
//         // SO FIRSTLY WE HAVE TO WRITE THE SPECIFIC EXCEPTIONS THEN GENERIC EXCEPTIONS 
         


//         // IF WE HAVE TO WRITE MULTIPLE EXCEPTIONS AT ONCE WE CAN ALSO USE OR OPERATOR LIKE  CATCH(ARITHMETICEXCEPTION E |  NULLPOINTEREXCEPTION N){
//                // WE CAN USE OR ONLY IN THE SIBLING EXCEPTIONS 
//         // }

        
//         //  IF WE WANT TO THROW THE EXCEPTION BY OURSELVES THEN WE USE ->   THROW AND THROWS



//     }
// }

// public class Demo{
//     public static void main(String[] args){
//         try{
//             checkEligibility(50);
//         }
//         catch(IllegalArgumentException e){
//             System.out.println(e.getMessage());
//         }
//     }
//     private static void checkEligibility(int age){
//         if(age<=0){
//            throw new IllegalArgumentException("Age cannot be negative");
//         }
//         if(age>18){
//             System.out.println("You are Eligible for vote");
//         }
//     }
// }

// we never handle exception in that function that we call like in above case we call checkeligibility but we are
// handling that exception in main and that is correct becuase if any exception occured then main has to know what exception has 
// has occured and there is no benefit in handling that exception in the calling function 




//  CHECKED EXCEPTIONS -> THROWS 

import java.io.FileNotFoundException;
import java.io.FileReader;

// public class Demo{
//  public static void main(String[] args){
    
//     // FileReader fr = new FileReader("abc.txt");
//     // this is given error unhalded exception file not  found exception so we have to put this inside a try block -> we Cannot write this
//     // we have to handle this exception by ourself

//     try{
//     FileReader fr = new FileReader("abc.txt"); //  java  force us to write this inside a try block
//     }
//     catch(FileNotFoundException e){
//         System.out.println("File not found");
//     }
    
//  }
// }

// suppose i am doing the same thing by calling a function 

// public class Demo{
//     public static void main(String[] args) throws FileNotFoundException{
//     //    try{
//     //    readFile();
//     //    }
//     //    catch(FileNotFoundException e){
//     //     System.out.println("File not Found");
//     //    }

//      // if main () also not handle the exception by using the try and catch block then  ye exception print 
//      // hojayegi as a stack trace(jvm will not handle any exception ) so we use throws outside the main()
//      // so we do main(String[] args) throws filenotFoundexception then it will print the 
//        readFile();
//     }
       
   

// private static void readFile() throws FileNotFoundException{
   
   
//     // try{
//     //     FileReader fr = new FileReader("abc.txt"); //  java  force us to write this inside a try block
//     //     }
//     //     catch(FileNotFoundException e){
//     //         System.out.println("File not found");
//     //     }
//     // // if i dont want to write these lines like try then inside it catch  so here i will use throws so that the caller handle 
//     // the exception 



//     // so i will remove the try block just write the below line and in  readfile() i write throws then name of the exception  -> now it
//     // is the main() responsibility to handle that exception 

//     //agar manlo main() ko bhi handle nhi krni to main() bhi use krlega throws to fir filetrace print hojayega kyuki fir vo
//     // exception jvm handle krega 

//     FileReader fr = new FileReader("abc.txt");
// }
// }


// THROWS jab use krte hai jab hame pta hota hai ki koi exception aa skti hai and we want ki jo usko call krra hai vo handle kre
// us exception ko 


// we Mainly dont use throws to throw an exception we Mainly handle the exception in the main() block



// CUSTOM EXCEPTION -> ACC TO OUR BUSINESS LOGIC  WE CAN WRITE THE CUSTOM EXCEPTION  SO THAT WE CAN UNDERSTAND THE EXCEPTION
// LIKE WE ARE IN BANK AND THE PAYMENT FAILED SO WE CAN CREATE CUSTOM EXCEPTION NAME PAYMENT_FAILED EXCEPTION 

// WHAT IS A EXCEPTION? -> EXCETPTION IS A CLASS SO WHAT WE DO -> CLASS NAME_OF_EXCEPTION EXTENDS EXCEPTION(THIS IS THE CLASS OF EXCEPTION)
//NOW I WILL CREATE A CUSTOM EXCEPTION NAMED WITH INVALID AGE EXCEPTION

class InvalidAgeException extends Exception {
    private int age;
 public InvalidAgeException(String message,int age){
    super(message);
    this.age = age;
 }
public int getAge(){
    return this.age;
}

}

public class Demo{
    public static void main(String[] args){
    try{
        checkEligibility(-50);
    }
    catch(InvalidAgeException e){
        System.out.println(e.getMessage());
        System.out.println("Entered Age was"+ e.getAge());
    }
    }
    private static void checkEligibility(int age) throws InvalidAgeException{
        if(age<=0){
            throw new InvalidAgeException("age Cannot be negative",age);
        }
        if(age>18){
            System.out.println("You are eligible");
        }
    }
}


// RESOURCE IN JAVA -> JISKO HAME CLOSE KRNA PADE AFTER USING IT THAT IS RESOURCE FOR EX -> FILE , DB CONNECTION

// SO WHAT WE DO MANNUALY WE CLOSE THE RESOURCE IN THE FINALLY BLOCK BUT THE GOOD WAY IS GIVE THE RESOURCE INSIDE THE PARAMETER OF THE 
// TRY BLOCK  SO WE DONT NEED TO CLOSE IT MANUALLY 
// TRY(fileReader fr = new FileReader("abc.txt")){
                                                                //   -> like this 
// }

