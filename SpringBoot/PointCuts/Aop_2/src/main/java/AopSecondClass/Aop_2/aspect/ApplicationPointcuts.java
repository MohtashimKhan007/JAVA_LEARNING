package AopSecondClass.Aop_2.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class ApplicationPointcuts {

    @Pointcut("within(AopSecondClass.Aop_2.controller..*)")
    public void controllerLayer(){
    // empty body
    }


    @Pointcut("within(AopSecondClass.Aop_2.Service..*")
    public void serviceLayer(){
        // empty body
    }

    @Pointcut("execution(public * *(..)")
    public void publicMethod(){
        // empty body
    }


    @Pointcut("serviceLayer() && publicMethod()")
    public void publicServiceMethod(){
        // empty body
    }

    @Pointcut("execution(* *.get*(..))")
    public void getterMethod(){

    }



}
