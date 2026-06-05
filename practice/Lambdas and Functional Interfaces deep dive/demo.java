// public class demo{
//     public static void main(String[] args) {
//         Calculator c = new Addition();
//     //    int sum  =  c.calculate(4,5);
//     //     System.out.println(sum);
//     // suppose instad of storing this in sum variable and printing it we have created a print() which take a,b and 
//     // the object of the Calculator as an argument
//      print( 5, 10,c);
//     //  so this will print 15 -> 

//     }
//     public static void print(int a,int b,Calculator c){
//          System.out.println(c.calculate(a, b));
//     }
// }




// // creating our own interface of name Calculator


// @FunctionalInterface
// interface Calculator{
//     int calculate(int a,int b);
   
// }
// // what is the traditional way to use it which is the length one creating our own class which implements this 

// class Addition implements Calculator{
//     // if this class is implementing the Calculator interface then we have to override the method 

//      @Override
//      public int calculate(int a,int b){
//         return a + b;
//      }
// }






// now writing above code using lambda expression 


// public class demo{
//     public static void main(String[] args) {
//       // so here in print () we are passing a and b and a lambda expression becuase we want to add a and b
//     //  print( 5, 10,(a,b)-> a*b);
//     //instead of this also i can create an object of Calculator  and assign this expression to that object
//     Calculator c = (a,b)-> a+b;
//     print(5,10,c);
 

//     }
//     public static void print(int a,int b,Calculator c){
//          System.out.println(c.calculate(a, b));
//     }
// }







// // creating our own interface of name Calculator


// @FunctionalInterface
// interface Calculator{
//     int calculate(int a,int b);
   
// }
// what is the traditional way to use it which is the length one creating our own class which implements this 






//java has a class -> java.util.function 
// this class has mainly four core interfaces
// function,consumer,predicate, supplier






// fistlly using the FUNCTION INTERFACE

// import java.util.function.*;

// public class demo{
//     public static void main(String[] args){
//      // the syntax is function<data type of input,data type of output> name of the obj of this Function = lambda ex 
//      Function<Integer,Integer> square = x-> x*x;
//      //this lambda expression which we have written x-> x*x  this is the override of the apply method inside the Function
//      //  Interface  R apply(T t); here i have taken input as x and in apply method it is T and in apply method
//      // the output is t but i have given the output as x*x
//      //what i have done created an object of function and override its apply function and calculate the square
//      System.out.println(square.apply(5));

//     }
// }





// CONSUMER INTERFACE -> THIS WILL TAKE AN INPUT BUT IT WILL NOT GIVE ANY OUTPUT 
// CONSUMER HAS ONLY ONE METHOD -> ACCEPT
// IT TAKES INPUT APPLY SOME OPERATIONS ON THAT INPUT BUD DOES NOT GIVE ANY OUTPUT 


// public class demo{
//     public static void main(String[] args){
//     //  CONSUMER INTERFACE 
     
//     Consumer<Integer> print = x-> System.out.println(x);
//     // here we are over riding the accept function 

//     print.accept(6);
//     }
// }





// SUPPLIER INTERFACE  -> OPPOSITE OF CONSUMER DOES NOT TAKE ANY INPUT BUT GIVE OUTPUT 
// IT ONLY GIVES OUTPUT


// public class demo{
//     public static void main(String[] args){
//      Supplier<Double> random_value  = () -> Math.random();
//      // SUPPLIER INTERFACE HAS ONLY 1 METHOD THAT IS GET 

//      System.out.println(random_value.get());
//     }
// }



// PREDICATE INTERFACE -> this will take an input and RETURN BOOLEAN VALUE
// PREDICATE PERSFORM SOME TEST ON THE INPUT AND RETURN TRUE OR FALSE THAT IS BOOLEAN VALUE 
// WE ONLY USE PREDICATE IF WE WANT TO TEST ANY CONDITION 




// public class demo{
//     public static void main(String[] args) {
//         Predicate<Integer> isEven = x -> x%2==0;
//         System.out.println(isEven.test(47));
//     }
// }


// import java.util.*;
// public class demo{
//     public static void main(String[] args) {
//         List<Integer>list = new ArrayList<>(List.of(1,2,3,4,5));
//         // for(Integer i : list){
//         //     System.out.println(i);
//         // }

//         // Other way to pritnt this is Using FOR EACH METHOD
//         list.forEach(x->System.out.println(x));
//     }
// }



// java.util.* -> means importing all the classes of java.util
// java.util.function.* -> importing all classes of function package which is inside the util package 



// PRIMITIVE FUNCTIONAL INTERFACES  -> THIS IS MADE FOR INT , DOUBLE, LONG  because mainly these only are used 
// IN LAMBDA FUNCTION LIKE X-> X* X  WE HAVE TO DO FIRSTLY UNBOXING -> THEN OPERATION PERFORM -> THEN AUTO BOXING 
//THIS MAKES THE OPERATION SLOW SO JAVE DECIDE TO CREATE PRIMITVE FUNCTIONAL INTERFACE WHICH WORK WITH 
// PRIMTIVES NOT WITH THE OBJECTS 


/* 
FUNCTION PRIMITIVE FAMILY GIVEN BELOW

                
INT FUNCTION -> TAKES INT AS (INPUT) AND GIVES OBJECT AS (OUTPUT)
LONGFUNCTION -> LONG -> OBJECT
DOUBLEFUNCTION-> DOUBLE -> OBJECT 


TOINTFUNCTION -> INPUT(OBJECT) -> OUTPUT(INT)
TOLONGFUNCTION -> INPUT(OBJECT) -> OUTPUT(LONG)
TODOUBLEFUNCTION -> INPUT(OBJECT) -> OUTPUT(DOUBLE)


PRIMITIVE CONSUMER FAMILY GIVEN BELOW
INTCONSUMER -> INPUT(INT) -> VOID(OUTPUT)
LONGCONSUMER ->  LONG  -> VOID
DOUBLECONSUMER ->  DOUBLE -> VOID


OBJECTINTCONSUMER -> TAKES TWO INPUT(OBJECT,INT) -> OUTPUT(VOID)
OBJECTLONGCONSUMER -> INPUT(OBJECT,LONG) -> OUTPUT(VOID)
OBJECTDOUBLECONSUMER -> INPUT(OBJECT,DOUBLE) -> OUTPUT(VOID)



PRMITIVE SUPLLIER FAMILY
INTSUPPLIER -> VOID -> INT
LONGSUPPLIER  -> VOID -> LONG
DOUBLESUPPLIER ->  VOID -> DOUBLE


THIS DOES NOT HAVE ANY ALTERNATIVE BECAUSE SUPPLIER ONLY RETURN ONE VALUE AND WE HAVE ALTERNATIVE IN CONSUMER 
BECUASE CONSUMER  CAN TAKE ONE INPUT AS INT AND IT CAN ALSO TAKES TWO INPUT AN INTEGER AND ONE OBJECT ALSO 




PRIMITIVE PREDICATE FAMILY

INPUT(OBJECT ) -> OUTPUT(BOOLEAN VALUE-> TRUE/FALSE)
INTPREDICATE ->  INT -> BOOLEAN
LONGPREDICATE ->  LONG -> BOOLEAN
DOUBLEPREDICATE -> DOUBLE -> BOOLEAN


PRIMITIVE OPERATOR FAMILY -> THIS IS USED IF BOTH THE INPUT AND THE OUTPUT IS PRIMITIVE
 FOR EX -> INT TO INT

 INTUNARYOPEARTOR(INT -> INT)    UNARY-> MEANS SINGLE INPUT 
 LONGUNARYOPERATOR(LONG -> LONG)
 DOUBLEUNARYOPERATOR(DOUBLE -> DOUBLE) 



 IF WE WANT TO WORK ON TWO INPUTS -> THEN WE USE INTBINARYOPERATOR

 INTBINARYOPERATOR -> INPUT(INT,INT)  -> OUTPUT(INT)
 LONGBINARYOPERATOR -> INPUT(LONG,LONG) -> LONG
 DOUBLEBINARYOPERATOR ->INPUT(DOUBLE,DOUBLE) -> DOUBLE

  SYSTEM.OUT.PRINTLN(X) ->  SYSTEM IS A CLASS -> OUT IS AN OBJECT INTSIDE IT OF PRINTSTREAM TYPE 




 METHOD REFERENCE -> IT SAYS THAT I CAN FURTHER OPTIMISE THE LAMBDA EXPRESSION
 // IT SAYS THAT IF YOU ARE CALLING THE ALREADY EXISTING FUNCTION IN LAMBDA FUNCTION FOR EX -> 
 (X) -> SYSTEM.OUT.PRINTLN(X); -> 
 // WHAT WE ARE DOING HERE ? WE ARE JUST PASSING THE X INSIDE SYSTEM.OUT.PRINTLN   -> SO METHOD REFERENCE GIVE
 NEW SYNTAX -> IT SAYS JUST REFER THE  METHOD WHICH YOU WANT TO CALL -> 
 FOR EX -> WHAT WE WRITE BEFORE METHOD REFERENCE -> (X) -> SYSTEM.OUT.PRINTLN(X)
                                                            -> suppose i am using for each loop 
                                                            -> System.out then method reference operator(::) -> println
 BY USING METHOD REFERENCE WE CAN WRITE LIKE THIS -> list.forEach(System.out::pritln) -> i am reference println method means
 we are saying that just check what this println do  and do same for each element in the list ->
 here we are not calling the println method we are just telling this is the method 


*/



// import java.util.*;
// public class demo{
//     public static void main(String[] args) {
//         List<Integer>list = new ArrayList<>(List.of(1,2,3,4,5));
//         // this will also print the values of the list
//         list.forEach(System.out:: println);

//     }
// }



//  CAN WE CHANGE EVERY LAMBDA EXPRESSION WITH METHOD REFERENCE ?

//  NO -> WE CAN ONLY USE METHOD REFERENCE ONLY ON THOSE PLACES WHERE WE ARE CALLING THE -> INBUILD FUNCTIONS


/* 
 TYPES OF METHOD REFERENCE 

 1. STATIC METHOD REFERENCE ->  FOR EX -> MATH.ABS(X);
                           -> MATH :: ABS





FUNCTIONAL COMPOSITION -> USED TO BREAK THE COMPLEX FUNCTIONS INTO SMALLER FUNCTIONS


IN FUNCTION INTERFACE WE HAVE TWO METHODS  -> 1.ANDTHEN  AND  2. COMPOSE


AND THEN()  -> works from left to right 
*/


// AND THEN EXAMPLE ->  


// import java.util.*;
// import java.util.function.*;;
// public class demo{
//     public static void main(String[] args) {
//         //(x+2)*3
//         // Function<Integer,Integer> equation = x->((x+2)*3);
//         // System.out.println(equation.apply(2));

//     //    I CAN BREAK DOWN THESE PROBLEMS INTO SUB - PROBLEMS 
//         Function<Integer,Integer> add2 = x->x+2;
//         Function<Integer,Integer> multiply3 = x->x*3;
//         Function<Integer,Integer> divby3  = x->x/3;
//         int ans = add2.andThen(multiply3).andThen(divby3).apply(5);
//         // the subparts of this will return function not the value so that we can do chaining as long as we want 
//         System.out.println(ans);



//     }
// }


//  V -> IMP  -> G(F(X)) -> FIRSTLY WE CALCULATE F(X) -> THEN PASS THAT VALUE TO G() SO IT IS 
//  MANDATORY
//  THAT DATA TYPE OF OUTPUT OF F(X) -> MUST BE SAME AS THE INPUT OF G()



// COMPOSE METHOD -> THIS WORK FROM RIGHT TO LEFT 
// F.ANDTHEN(G)-> FIRST PERFORM F AND THEN PERFORM G
// F.COMPOSE(G) -> FIRST PERFROM G THEN PERFROM F 

// BY USING COMPOSE AND ANDTHEN METHOD WE MAKE -> METHOD PIPELINE 


// WE CAN USE METHOD REFERENCE INSIDE ANDTHEN AND COMPOSE METHOD 


// BENEFIT OF THIS FOR EX -> WE HAVE A STRING IN WHICH WE HAVE SPACE AND WE HAVE TO REMOVE SPACES AND CONVERT TO UPPER CASE 

// WO WHAT WE CAN DO -> 
// FUNCTION<STRING,STRING> TRIM = STRING:: TRIM;
// FUNCTION<STRING,STRING> TOUPPER = STRING:: TOUPPERCASE;



// PREDICATE CHAINING -> AND()  ,      OR()     ,   NEGATE() 

// USE OF THIS 
// SUPPOSE I WANT TO MAKE A PREDICATE WHICH CHECK A NO IS GREATER THEN 100 AS WELL AS THE NUMBER IS EVEN 

// import java.util.function.Predicate;

// public class demo{

//     public static void main(String[] args){
// Predicate<Integer> isGreater = x-> x>100;
// Predicate<Integer> isEven = x-> (x%2==0);
// Predicate<Integer> Result = isGreater.and(isEven);

// System.out.println(Result.test(2));
//     }
// }

// like this we can also use or instead of and we can write or



// NEGATE -> WORK AS NOT OPERATOR 



// IMPLEMENTATION -> SUPPOSE WE HAVE TO CHECK TWO CONDITION AGAIN AND AGAIN -> STUDENT IS ADULT AND STUDENT AGE IS GREATER THEN 18 
// SO HERE I WILL CREATE THE PREDICATE 


// public class demo{
//     public static void main(String[] args){
//           Predicate<Student> passed = s->s.marks > 40;
//           Predicate<Student> isadult = s->s.age > 18;
//           Predicate<Student> isEligible = passed.and(isadult);
//           System.out.println(isEligible.test(new Student(5,33)));
//     }
// }
// class Student{
//     int marks; 
//     int age;
//     public Student(int marks,int age){
//         this.marks = marks;
//         this.age = age;

//     }
// }




// CONUSMER CHAINING  -> AND THEN METHOD LIKE ABOVE SAME 

// BIFUNCTION -> TAKES TWO INPUTS AND GIVE ONE OUTPUT -> BIFUNCTION<T,U,R> HERE T AND U ARE INPUT 

// -> WE HAVE BIFUNCTIO,BICONSUMER,BIPREDICATE -> WHICH TAKE TWO INPUTS AND GIVE ONE OUTPUT 

