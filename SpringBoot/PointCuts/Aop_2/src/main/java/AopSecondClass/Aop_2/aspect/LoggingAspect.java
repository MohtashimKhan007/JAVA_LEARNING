package AopSecondClass.Aop_2.aspect;

import AopSecondClass.Aop_2.dto.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//
//    @Pointcut("within(AopSecondClass.Aop_2.Service..*" +
//            "&&" +
//            "execution(public ** (..))")
//    public void logPublicServiceMethod(){
//
//    }

    @Before("@within(org.springframework.stereotype.Service)")
    public void logBeforeMethod(){
        System.out.println("Method Intercepted");
    }


//    @Before("execution(AopSecondClass.Aop_2.dto.Student" +
//            " AopSecondClass.Aop_2.Service." +
//            "StudentService.createStudent(AopSecondClass.Aop_2.dto.Student)")
//    public Student logBeforeMethod2(Student student ){
//        System.out.println("Student Saved");
//        return student;
//
//    }

}