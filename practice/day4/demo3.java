public class demo3{

    public static void main(String[] args){
    //    EngineeringStudent s1 = new EngineeringStudent();
    //    s1.markAttendance();
    //    s1.attendLab();
    //   CSEStudent cs1 = new CSEStudent();
    //   cs1.attendLab();
    
    }
}

// INHERITANCE

// parent class(super class),child class(sub-class)

//  class Student{
//  String name;
//  int age;


// //  lets say student have one method also 
//  void markAttendance(){
//     System.out.println("Attendance Marked");
//  }
// }

// class EngineeringStudent extends Student{
//     void attendLab(){
//         System.err.println("Lab attended");
//     }
// }



// TYPES OF INHERITANCE
// SIMPLE INHERITANCE
// MULTILEVEL INHERITANCE
// HIERACHICAL INHERITANCE
// MULTIPLE INHERITANCE(NOT SUPPORTED IN JAVA )


// SIMPLE INHERITANCE

// class Student{
//     String name;
//     int age;
   
   
//    //  lets say student have one method also 
//     void markAttendance(){  //PARENT CLASS
//        System.out.println("Attendance Marked");
//     }
//    }
   
//    class EngineeringStudent extends Student{  // CHILD CLASS
//        void attendLab(){
//            System.err.println("Lab attended");
//        }
//    }





// MULTILEVEL INHERITANCE  - A-> B -> C

// class Student{
//     String name;
//     int age;
   
   
//    //  lets say student have one method also 
//     void markAttendance(){
//        System.out.println("Attendance Marked");
//     }
// }
  


//    class EngineeringStudent extends Student{
//        void attendLab(){
//            System.err.println("Lab attended");
//        }
//    }

//    class CSEStudent extends EngineeringStudent{

//      void attendCseLAB(){
//         System.out.println("CSE LAB ATTENDED");
//      }
//    }
   

/* HIERARCHICAL INHERITANCE -> HERE B AND C BOTH CLASSES ARE INHERITING FROM A CLASS

        A
      /   \
    B       C


 */

/*  MULTIPLE INHERITANCE -> HERE CHILD CLASS INHERITING PROPERTIES FROM MULTIPLE CLASSES 

          A   B
          \   / 
            C    
 */


// WE CAN USE SUPER KEYWORD TO CALL THE CONSTRUCTOR OF THE PARENT CLASS 


class Student{
    String name;
    int age;
   
    // constructor of this class 
   Student(String name,int age){
    this.name = name;
    this.age = age;
   }



   void print(){
    System.out.println(name +" " + age);
   }


   //  lets say student have one method also 
    void markAttendance(){  //PARENT CLASS
       System.out.println("Attendance Marked");
    }
 }
   


class EngineeringStudent extends Student{  // CHILD CLASS

        // constructor of this class 

        EngineeringStudent(String name,int age){
        //  calling the parent class constructor 
          super(name,age);
        }

       void attendLab(){
           System.err.println("Lab attended");
       }
       

       void print(){
        super.print();
       }

     
   }

