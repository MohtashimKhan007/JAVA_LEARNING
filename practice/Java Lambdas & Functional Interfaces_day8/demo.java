

// we know java Revolves Around Object so 95 percent of the time it is good but sometimes if we need to pass the  behaviour as a argument in any method -> for that java has introduced 
// functional interfaces -> in which we have Lambda Expression



// why we need lambda expression where there is a need to pass the behaviour as an argument 


// Example -> suppose we have a chef -> Suppose i Like Biryani and i Have a Proper Recipe for that . But i Cannot provide the Recipe to the Chef Directly Firtly i Have to Create the 
// Object of the Person then  give the recipe to that person and then then that person will tell the recipe to the  Chef 
// suppose the Chef has a method named Cook() i cannot pass the recipe directly to that  function  for that we have to create the obj of person  the pass that obj to the Cook();



// why do we need Behaviour Passing 
// Supose i have a class named Student and i have three things in that -> name, roll_no, marks and i have created a list of this Student Type  and i want to sort that list 
// for that i have to use the sort()  in that sort() i have to create a comparator outside the classs -> what is Comparator ? -> this is a indepenend interface in whcih we 
// write logic to sort the class 

// import java.util.*;

// public class demo {
//        public static void main(String[] args) {
//         // i am creating a list of type Student 
//         List<Student>list = new ArrayList<>();
//         list.add(new Student("monish", 22, 7));
//         list.add(new Student("Rahul", 28, 91));
//         list.add(new Student("Ayush", 11, 77));
          

//         // in Collection class we have a method sort 
//         Collections.sort(list);
//         // this  line will give error becuase sort() is not able to understand on which basis we have to sort it 

//         for(Student s: list){
//             System.out.println(s.name + " "+ s.marks + " " + s.roll_no);
//         }

//        }
// }

// class Student implements Comparable<Student>{
//     String name;
//     int roll_no;
//     int marks;
//     public  Student(String name,int roll_no,int marks){
//         this.name = name;
//         this.marks = marks;
//         this.roll_no = roll_no;
//     }
//     @Override
//     public int compareTo(Student s){
//         return this.marks - s.marks;
//     }
// }



// THIS  CODE IS VERBOSE SO WE USE LAMBDA FUNCTIONS HERE -> SOLVING USING LAMBDA FUNCTION BELOW 

// COLLECTIONS.SORT()  -> THIS FUNCTION IS A OVERLOADED FUNCTION  -> IT TAKES A ARGUMENT AS WELL AS IT TAKE OBJECT  OF COMPARATOR TYPE  AND COMPARATOR IS A INTERFACE  -> AND COMPARATOR
// HAS ONE METHOD CALLED COMPARE  -> HERE WE GIVE OBJECT OF COMPARATOR TYPE IN THE SORT() AND THAT WILL TELL ON WHICH BASIS WE HAVE TO SORT IT 
// import java.util.*;

// public class demo {
//        public static void main(String[] args) {
//         // i am creating a list of type Student 
//         List<Student>list = new ArrayList<>();
//         list.add(new Student("monish", 22, 7));
//         list.add(new Student("Rahul", 28, 91));
//         list.add(new Student("Ayush", 11, 77));
          



//         // it is not possible to make the object of the comparator(becuase it is an interface) so we are making the object of the sub classes of the comparator 
//         Comparator<Student>  c1 = new sortByName();
//         Comparator<Student> c2 = new sortByMarks();
//         Comparator<Student> c3 = new sortByRoll_no();  // now i can give these c1,c2,c2 into sort() so that sort() will sort based on these

//         // in Collection class we have a method sort 
//         Collections.sort(list,c3);
//         // this  line will give error becuase sort() is not able to understand on which basis we have to sort it 

//         for(Student s: list){
//             System.out.println(s.name + " "+ s.marks + " " + s.roll_no);
//         }

//        }
// }


// so I am Creating three Comparator for Sorting by name,roll -No and marks 



// class sortByName implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.name.compareTo(s2.name);
//     }
// }


// class sortByRoll_no implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.roll_no-s2.roll_no;
//     }
// }

// class sortByMarks implements Comparator<Student>{
//     @Override
//     public int compare(Student s1,Student s2){
//         return s1.marks - s2.marks;
//     }
// }





// class Student implements Comparable<Student>{
//     String name;
//     int roll_no;
//     int marks;
//     public  Student(String name,int roll_no,int marks){
//         this.name = name;
//         this.marks = marks;
//         this.roll_no = roll_no;
//     }
//     @Override
//     public int compareTo(Student s){
//         return this.marks - s.marks;
//     }
// }



// what we have done above ? Create Class then make the object of that class and pass that object in the sort() -> it is not able to pass the  function and logic directly in the sort 
// function -> AND THIS MAKE THE CODE VERBOSE  SO FOR THIS  JAVA BRINGS -> ANONYMOUS CLASS -> IN SORT(LIST,OPEN CLASS HERE )  -> BUT WHAT IS THE BENEFIT IN THE END WE ARE CREATING A CLASS 
//SO THIS PROBLEM IS SOLVED BY JAVA -> BY THE HELP OF THE FUNCTIONAL INTERFACES 
// FUNCTIONAL INTERFACE -> THIS IS A INTERFACE IN WHICH WE ONLY HAVE ONE ABSTRACT METHOD THAT IS CALLED FUNCTIONAL INTERFACE 
// FOR EXAMPLE WE HAVE ONE INTERFACE NAME COMPARABLE AND THAT HAVE ONLY ONE ABSTRACT METHOD THAT IS COMPARETO 
// BY THE HELP OF THESE FUNCTIONAL INTERFACES JAVA DEFINES THE LAMBDA FUNCTIONS 
// LAMBDA EXPRESSION   -> (PARAMETER )-> EXPRESSION      MEANING -> THESE PARAMTER MAPS TO THIS EXPRESSION  FOR EX -> (S1,S2) -> S1.MARKS - S2.MARKS;  
// HOW JAVE KNOW WHAT WE WANT TO DO BY THIS EXPRESSION / WHY JAVA SAYS THAT FUNCTIONAL INTERFACE IS IMP FOR LAMBDA FUNCTION  ? -> BECUASE FUNCTION INTERFACE HAS ONLY ONE ABSTRACT METHOD 




import java.util.*;

public class demo {
       public static void main(String[] args) {
        // i am creating a list of type Student 
        List<Student>list = new ArrayList<>();
        list.add(new Student("monish", 22, 7));
        list.add(new Student("Rahul", 28, 91));
        list.add(new Student("Ayush", 11, 77));
          

        // HERE IN SORT FUNCTION WE ARE PASSING THE LIST AND THE LAMBDA FUNCTION 
        Collections.sort(list,(s1,s2)->s1.roll_no-s2.roll_no);
       
        for(Student s: list){
            System.out.println(s.name + " "+ s.marks + " " + s.roll_no);
        }

       }
}


class Student{
    String name;
    int roll_no;
    int marks;
    public  Student(String name,int roll_no,int marks){
        this.name = name;
        this.marks = marks;
        this.roll_no = roll_no;
    }
   
}


// TYPES OF LAMBDA EXPRESSION
// SINGLE PARAMTER LIKE -> X-> X*X;     THEN          MULTI PARAMTER -> (S1,S1) -> S1 + S2         NO PARAMTER ->   () -> SYSTEM.OUT.PRINTLN("HELLO")


// MULTI LINE LAMBDA EXPRESSION ->  (A,B)-> {
//   INT SUM = A+B;
//   RETURN SUM;
// }   -> WE MAINLY AVOID MULTI LINE LAMBDA EXPRESSION BECUASE IF IT GETS COMPLICATED ITS BETTER TO MAKE THE CLASS INSTEAD OF WRITING THE LAMBDA EXPRESSION 


// HOW JAVA KNOWS WHAT WE WANT TO DO BY THIS LAMBDA EXPRESSION -> BY THE HELP OF THE CURRENT CONTEXT  -> AND THIS IS CALLED TARGET TYPING 





// HOW TO CREATE OUR CUSTOM FUNCTIONAL INTERFACE 
// @FunctionalInterface

// public interface DEMO {
//     M1();  // THIS IS A METHOD INSIDE FUNCTIONAL INTERFACE AND IT IS OPTIONAL TO WRITE @ FUNCTION INTERFACE OUTSIDE THIS FUNCTIO FOR THE COMPILE TIME SAFTETY
//     // MEANS IF WE WRTIE @ FUNCTIONAL INTERFACE OUTSIDE AND IF WE TRY TO DEFINE ONE MORE ABSTRACT METHOD INSIDE IT LIKE M2() IT WILL GIVE AN  COMPILE TIME ERROR
// } 





