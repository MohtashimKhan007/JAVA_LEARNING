import java.lang.classfile.ClassFile.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.AsyncBoxView;

public class demo{
    public static void main(String[] args) {
        // List of Intermediate Function
        /*
        filter()
        map()
        mapToInt()
        maptToDouble()
        flatmap() -> used for flateening operation
        sorted()
        limit()
        skip()
        distinct()
        peek()

         */

                        //   FILTER AND MAP 
        // List<Integer> list = new ArrayList<>(List.of(1,6,3,2));

        // //INTERMEDIATE FUNCTIONS

        // list.stream()
        //     .filter(x->x>1)
        //     .filter(x-> x%2==0)
        //     .map(x->x*3)
        //     .forEach(System.out::println);

         //                                                           FLATMAP

    //    List<List<Integer>>list2 = List.of(
    //     List.of(6,2),
    //     List.of(1,4),
    //     List.of(5,6)
    //    );

    //    list2.stream()
    //         .map(x->x*2)   -> this will not work becuase we are working on list of list and in list of list we have a list inside
                            //   -> and we cannot use the lambda function to the list 
    //         .forEach(System.out::prinln);
                  // FOR THIS -> 

        //   list2.stream()
        //        .map(x->x.stream().map(y->y*2))
        //        .forEach(System.out::println);     //-> this will not print the value this will pritn the rerence pipeline






        // TO PRINT THE VALUES WE HAVE -> FLATMAP() -> THIS WILL TAKES THE VALUES TO SAME LEVEL LIKE IN ABOVE WE HAVE 1,2 IN FIRST LIST THEN 3,4 IN
        // ANOTHER BUT THIS FLATMAP TAKES EVERY VALUE TO THE SAME LEVEL 
        
        // list2.stream()
        //      .flatMap(x->x.stream())       // this will print 1,2,3,4,5,6
        //      .sorted()                    // sorted function will sort the list -> this is stateful means firstly he wants every value to sort
        //      .distinct()                  // this is also stateful he has to keep track of previous value to knonw that value appears again or not(using hashmap)
        //      .forEach(System.out::println);



            //  LIMT AND SKIP() 
            //LIMIT -> IS USED IF WE HAVE AN INFINITE STREAM  we create INFINITE STREAM -> USING -> iterate(starting_val,howtoincrement)
            // skip -> USED TO SKIP THE ELMENENTS FOR EXAMPLE -> SKIP(5) -> MEANS SKIP FIRST 5 VALUES 
            // peak() -> to see the values at any particular time 

            // Stream.iterate(1,x->x+1)
            //       .limit(10)
            //       .skip(5)
            //       .forEach(System.out::println);

            // peek() 



            // List<Integer>list = new ArrayList<>(List.of(44,33,2,1));

            // list.stream()
            //     .peek(System.out::println)    // seeing elements before sorting and printing them -> 44,33,3,1  
            //     .sorted()
            //     .forEach(System.out::println);  // after sorting printing those elements

            // List of TERMINAL OPERATION -> THIS IS MANDATORY CONDITION TO START THE STREAM WITHOUT THE TERMINAL OPS STREAM WILL NEVER START 
            

            /* 
            -> COLLECTING RESULTS -> FOR EX -> TOLIST(), COLLECT();
            -> REDUCING RESULTS ->   REDUCE THE RESULTS TO THE SINGLE VALUE LIKE MAX, MIN, AVG, REDUCE -> THESE ARE THE METHODS
            -> SEARCHING/MATCHING -> FindFirst(), FindAny(), AnyMatch() , AllMatch() , NoneMatch() 
            -> ITERATIONS -> FOREACH(), FOREACHORDERED-> THIS IS MOSTLY USED IN PARALLEL STREAM 

            */


        //   List<Integer> list = new ArrayList<>(List.of(23,54,2,45));
        //   list.stream()
        //   .map(x->x+1)
        //   .forEach(System.out::println);


        //   LIST 

        // List<Integer> list = new ArrayList<>(List.of(23,54,2,45));

        // List<Integer> list2 =  list.stream()
        //   .map(x->x+1)
        //   .toList();

        //   System.out.println(list2);





          //this above list is immutable means i cannot add values afterwards lets try->
        //   list2.add(3);   //-> unsupported operation exception will occur

        // if we have to make the list mutable means we have to add the values after creating the list so we use collect()

        // List<Integer> list = new ArrayList<>(List.of(23,54,2,45));
        //   list.stream()
        //   .map(x->x+1)
        //   .collect(Collectors.toList())
        //   .forEach(System.out::println);
          


          // NOw i can Add the Value to This list

        //   list.add(59);
        //   System.out.println(list);


        //reduce -> combine stream values into single value

        // List<Integer> list = new ArrayList<>(List.of(5,4,3,2,88,55));
        //there is get method in optional class
        // Optional<Integer> sum = list.stream()
        //     .reduce((a,b)->a+b);
        //     System.out.println(sum.get());


        // if we dont want to store the value in optional we want to store the value in integer(int ) so how to do this
        // here we use same function reduce function -> we just give the identity value here -> identity means the base value -> means
        // the sum of a and b will store in identity(base value)

        // int sum = list.stream()
        //           .reduce(0,(a,b)->a+b );
        //           System.out.println(sum);
           

        //Count

    //    long num =  list.stream()
    //         .filter(x->x>10)
    //         .count();
    //         System.out.println(num);

       // FindFirst -> short Circuting -> give the first element from the stream that match the particular condition no need to check further
       // if the element found 

    //    Optional<Integer>  num2 = list.stream()
    //               .filter(x->x>10)
    //               .findFirst();

    //     System.out.println(num2.get());

        // findAny() -> find any number mainly used in paralled stream for more freedom

        // anyMatch -> check for some Condition give the boolean value Either True or False

    //    boolean  num2 = list.stream()
    //                 //   .filter(x->x>10)
    //                   .anyMatch(x->x<10);
    //     System.out.println(num2);
    
    
    // ALLMATCH -> CONDITION MUST TRUE FOR ALL THE ELEMENTS
    //NONEMATCH -> MEANS NO ELEMENTS MATCH THIS CONDITION


    // IMP 
    // -> WE HAVE SOME METHODS -> LIKE MAX,MIN,AVG -> WORKS WITH PRIMITIVE STREAMS AND WILL NOT WORK THESE STREAM WHICH WE HAVE USED ABOVE 
    // FOR THAT WE HAVE TO MAKE THESE STREAMS AS PRIMITIVE -> JUST USE THIS -> FOR CONVERTING IN INSTREAM -> .MAPTOINT();

    // int  num2 = list.stream()
    //                 .filter(x->x>10)
    //                  .anyMatch(x->x<10);    // this will not work because these methods will only work with primitve stream 
    //     System.out.println(num2);


    // List<Integer> list = new ArrayList<>(List.of(5,4,3,2,88,55));
    // int  sum = list.stream()
    //                 .filter(x->x>10)
    //                 .mapToInt(x->x)         // here i have convert this to int stream 
    //                 .sum();              
                    
    //     System.out.println(sum);
     


    // Suppose  i want to mfin out the maximum no using max ()

    
    // List<Integer> list = new ArrayList<>(List.of(5,4,3,2,88,55));
    // OptionalInt  sum = list.stream()
    //                 .filter(x->x>10)
    //                 .mapToInt(x->x)         // here i am using max() and max() will store in OptionalInt 
    //                 .max();           
                    
    //     System.out.println(sum.getAsInt());

    


    // Collector Method -> this will help to collect all the values from any stream
    //we have a utility Class -> Collectors -> where it exists -> java.util.Stream.Collectors

    // basic Collection -> tolist(),toset(),toMap()

    // List<Integer> list = new ArrayList<>(List.of(5,4,3,2,88,55));
    // List<Integer> list2 = list.stream()
    //                           .map(x->x+1)
    //                           .collect(Collectors.toList());

    //             System.out.println(list2);




    //toMap()

    // List<String> list = new ArrayList<>(List.of("AA","DDD","EEEE"));
    // Map<Integer,String> mp = list.stream()
    //                          .collect(Collectors.toMap(x->x.length(), x->x));
    // System.out.println(mp);

    // NOW I HAVE MULTIPLE STRINGS WITH SAME LENGTH

    // List<String> list = new ArrayList<>(List.of("AA","DDD","EEEE","BB","CCC"));
    // Map<Integer,List<String>> mp = list.stream()
    //                               .collect(Collectors.groupingBy(
    //                                 x->x.length(),
    //                                 Collectors.mapping(
    //                                     x->x.toLowerCase(),Collectors.toList())));
    // System.out.println(mp);
    //JOINING 

    // MAP -> IN MAP WE GIVE KEY VALUE PAIR  HERE ABOVE WE HAVE PAIR OF LIST<STRING> 



    // String result = list.stream()
    //                 .collect(Collectors.joining("-"));
    //     System.out.println(result);




    }
}
