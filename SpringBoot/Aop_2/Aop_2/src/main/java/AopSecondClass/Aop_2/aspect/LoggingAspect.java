package AopSecondClass.Aop_2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
//    @Before("execution(String AopSecondClass.Aop_2.Service.StudentService.createStudent())")
//    public void logBeforeMethod(JoinPoint joinPoint){
//        Object arr =joinPoint.getArgs();
//        System.out.println("Student is going to be saved");
//

    /// /        boolean allowed = false;
    /// /        if(!allowed){
    /// /            throw new RuntimeException("Method Execution not allowed");
    /// /        }
//    }

//    @AfterReturning(value = "execution(String AopSecondClass.Aop_2.Service.StudentService.createStudent())",
//                     returning = "result")
//    // here ham ne jo studentService se create student ne return kiya usko store kr liya result me vo hoga string type ka
//    public void logAfterReturningMethod(String result){
//        System.out.println("logAfterReturningMethod called");
//        System.out.println("Target method returned: " + result);
//    }

    // After Throwing
//        @AfterThrowing(value = "execution(* AopSecondClass.Aop_2.Service.StudentService.createStudent(..))",
//                throwing = "exception")
//
//
//    public void logAfterThrowingMethod(Throwable exception){
//            System.out.println("Exception type "  + exception.getClass().getName());
//            System.out.println("Exception Message " + exception.getMessage());
//    }

//    After method

//@After(value = "execution(* AopSecondClass.Aop_2.Service.StudentService.createStudent(..))")
//
//
//public void logAfterMethod(){
//    System.out.println("LogAfterMethod Executed");
//}
//
//}

// Around method
//    @Around(value = "execution(* AopSecondClass.Aop_2.Service." + "StudentService.createStudent(..))")
//
//    public String logAroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Before target method");
//
//        try{
//            String student = joinPoint.proceed().toString();
//            System.out.println("Execution Successful");
//            return student;
//        }
//        catch (Exception e){
//            System.out.println("Execution failed " + e.getMessage());
//            throw e;
//        }
//
//        finally {
//            System.out.println("Execution Completed");
//        }
//
//    }
//}


    @Around(value = "execution(* AopSecondClass.Aop_2.Service." + "StudentService.dummyMethod(..))")

    public Object logAroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before target method");
       Object[] arr = joinPoint.getArgs();
       String orignalString = (String) arr[0];
       String modifiedString = orignalString.toUpperCase();

       Object[] modifiedArr = {
               modifiedString
       };
      return joinPoint.proceed(modifiedArr);

    }
}