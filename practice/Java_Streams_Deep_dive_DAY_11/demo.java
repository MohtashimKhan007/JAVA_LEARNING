import java.util.ArrayList;
import java.util.List;

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

       List<List<Integer>>list2 = List.of(
        List.of(6,2),
        List.of(1,4),
        List.of(5,6)
       );

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
        
        list2.stream()
             .flatMap(x->x.stream())       // this will print 1,2,3,4,5,6
             .sorted()                    // sorted function will sort the list -> this is stateful means firstly he wants every value to sort
             .distinct()                  // this is also stateful he has to keep track of previous value to knonw that value appears again or not(using hashmap)
             .forEach(System.out::println);
    }
}