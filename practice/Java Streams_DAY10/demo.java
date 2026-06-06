// Java Streams -> makes code readable and declarative  -> in this we only tell what to do -> we dont tell how to
//  do

// Stream in Java?
// tool for Processing a Sequence of data through a chain of Operations 



// Q -> Create a Stream Which takes a ArrayList of name numbers and  find the number which is > 10 and even and print them?
// numbers.Stream()
//        .filter(x->x>10)
//        .filter(x-> x%2==0)
//        .forEach(system.out::println);


// Work of Stream? -> to Process DATA      -> NOT  to Collect DATA 


// suppose we have a arraylist named number  so if i use number.stream so this is not creating new  array and storing value in it -> NO
// -> Stream will Create the Wrapper on the Same Collection and we Perform any ops that will be performed on the actual arraylist 

// when i write number.stream then internally i used the SPLIT ITERATOR(HOW IT ACTUALLY WORK THE STREAM KNOWS)  -> I USED THIS SPLIT ITERATOR TO LOOP
// ITERATE ON THE VALUES 



// STREAM PIPELINE STRUCTURE 

// SOURCE    ->    INTERMEDIATE OPERATIONS   -> TERMINAL OPERATIONS 
// suppose we have a arraylist of name  list so
// list.stream() -> means this list will work as a source 
//    .filter(x->x>10)   -> these .filter and map are the INTERMEDIATE operations that we are performing
//    .map() 
    //   .tolist() -> this is terminal operations -> this tell what to do with the stream 



// source can be a -> collection,arrays, stream.of , infinite stream 

// INTERMEDIATE OPERATIONS -> FILTER(), MAP(), SORTED() , DISTINCT , LIMIT , SKIP ETC 


// LIST.STREAM -> HERE WE ARE CREATING AN OBJ OF STREAM 


// V IMP -> RETURN TYPE OF INTERMEDIATE OPERATION IS -> STREAM  -> BECUASE WE CAN APPLY MORE OPERATIONS ON THAT 







// TERMINAL OPERATION -> THE RETURN TYPE OF TERMINAL OPEARTION IS NOT STREAM -> THEY RETURN A VALUE(FOR EX -> LIST )
// IF NO TERMINAL OPERATION -> THEN NO STREAM EXECUTED 
// JAVA STREAM -> IS LAZY -> LAZY LOADING ->  FOR EX -> LIST -> [5,12,7,8] -> SO IF WE DO LIST.STREAM().FILTER().MAP SO THIS WILL EXECUTE FIRST
// ON 5 ALL THE METHODS THEN ON 12 LIKE THIS 

// THIS PROCESSING IS ALSO CALLED VERTICAL PROCESSING  -> WE ARE PICKING A NUMBER AND PASSING IT THROUGHT ALL FILTERS THEN MOVING TO NEXT 

// UNTIL I DID NOT WRITE THE TERMINAL OPERATION -> JAVA STREAM WILL NOT START  -> THIS IS CALLED THE LAZY EVALUATION
// WORKS FOR SHORT CIRCUTING -> MEANS STOP AS SOON AS GET THE DESIRED RESULT -> DONT CHECK FURTHER 

// IF WE CONSUME STREAM ONCE -> WE CANNOT USE IT FURTHER FOR THAT WE HAVE TO CREATE THE NEW STREAM



import java.util.*;
import java.util.stream.*;

public class demo{
    public static void main(String[] args){
        List<Integer> list = new ArrayList(List.of(4,2,7,3,21,42));
    //    Stream<Integer> s =  list.stream();
    //    s = s.filter(x->x>10);
    //    s=s.map(x->x*2);
    //    s.forEach(System.out:: println);
    

    //intead of this we can do like this 
    list.stream().filter(x->x>10).map(x->x*2).forEach(System.out::println);
}
}


// STREAM SOURCES
// -> WE CAN CREATE STREAM BY USING COLLECTION , ARRAY, STREAM.OF(), INFINITE. PRIMITIVE STREAM





                                      //    TYPES OF STREAM -> .STREAM(SIMPLE STREAM ) ,    PARALLEL STREAM -> CAN DO PARALLEL PROCESSING


 /* 
Q. HOW TO CREATE STREAM OF ARRAYS ?

 String[] arr = ["Aditya","Monish","Rahul"];
-> we have a class array -> in that we have method named Streams 
Stream<String> s = Arrays.Stream(arr); -> and this will return the stream of string


Stream<Integer>s = Stream.of(1,2,4,7,8,); -> this will create the Stream of these Number

Empty Stream -> Stream.Empty()

VIMP ->   INFINITE STREAM ->  WE HAVE TWO METHODS TO CREATE THE INFINITE STREAM -> ITERATE AND GENERATE


ITERATE -> Stream.iterate(seed(initial value),next_function(how to increment the value))


Q -> Create a infinite Stream starting from 1 and increment with 1?
Stream.iterate(1,x->x+1) -> this will create infinite Stream starting with 1 and incremenet with 1
TO STOP THIS INFINITE STREAM WE HAVE A METHOD -> LIMIT

EX-> Stram.iterate(1,x->x+1).limit(10).forEach(System.out::println) -> print numbers from 1 to 10 -> limit -> limit restrict the no no to go
beyond 10



GENERATE ->  Stream.Generate(Supplier) -> for ex -> Stream.Generate(Math:: random) -> infinitely generate the Random value
We can also Set Limit on this Also                  .Limit(10)

Q. DIFF BETWEEN ITERATE AND GENERATE 
ANS ->   ITERATE REQUIRED THE SEED VALUE(MEANS PREVIOUS VALUE)-> BASED ON THAT IT CREATE THE NEXT VALUE -> DEPENDS ON PREVIOUS VALUE
         GENERATE -> NO PREVIOUS VALUE REQUIRED


-> WE USE INFINITE STREAM STRATEGICALLY 


PRIMITIVE STREAM -> AS WE ARE PERFORMING VARIOUS OPERATION SO WHAT IS HAPPENING -> UNBOXING -> THEN AUTOBOXING MAKING THE PROCESS SLOW
-> SO JAVA GIVE THE CONCEPT OF THE PRIMITIVE STREAM -> INTSTREAM , DOUBLESTREAM , LONGSTREAM -> THESE ARE PRIMITVE STREAM GIVEN BY JAVA
  
 -> these Primitive Stream Gives Some Operations to Perform 
 FOR EX -> IntStream s = Intstream.of(1,3,5,6,67);



                                                HIERARCHY OF STREAM
                                                BASE STREAM
                                                /          \
                                            STREAM        INSTREAM            LONGSTREAM            DOUBLE STREAM
                                                         (  USED FOR THE PRIMITIVES                           )                      
    
 STREAM -> VERTICAL LOAD

 Q -> how We CONVERT FROM ONE STREAM TO ANOTHER STREAM
  SUPPOSE WE HAVE TO CONVERT THE OBJECT STREAM(STREAM ) -> PRIMITIVE STREAM
  Stream<Integer>s = list.STream();
  IntStream s2 = s.mapToInt();



  CONVERTING THE PRIMITIVE STREAM INTO OBJECT 

  INTSTREAM -> NORMAL STREAM
  IntStream s = Intstream.of(1,2,4);
  Stream<Integer> s2 = s.boxed();



  CONVERTING ONE PRIMITVIE STREAM TO ANOTHER PRIMITIVE STREAM
     INTSTREAM -> LONG STREAM
  IntStream s = IntStream.of(1,2,4);
  LongStream s2 = s.MapToLong(X->X);

*/

