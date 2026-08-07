package AopSecondClass.Aop_2.aspect;


import AopSecondClass.Aop_2.annotation.TrackExecutionTime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SimpleAspect {

//    @Before("@annotation(jdk.jfr.Timestamp)")
//    public void logBeforeMethod(){
//        System.out.println("Method Intercepted");
//    }

    @Around("@annotation(trackExecutionTime)")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint, TrackExecutionTime
            trackExecutionTime){


        long startTime = System.currentTimeMillis();
        try{
            return joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            String operation = trackExecutionTime.operation();
            if(operation.isBlank()){
                operation = joinPoint.getSignature().getName();
            }
            long warningThreshold = trackExecutionTime.warnAfter();
            if(duration >=warningThreshold){
                System.out.println("Slow operation alert" +" Time taken by" +
                        operation + " " + duration);
            }
            else {

                System.out.println("Time taken by " + operation + " is " + duration);
            }
        }
    }


}
