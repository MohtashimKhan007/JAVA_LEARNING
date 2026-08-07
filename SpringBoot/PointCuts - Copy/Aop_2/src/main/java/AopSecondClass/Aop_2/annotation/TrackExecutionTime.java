package AopSecondClass.Aop_2.annotation;

import java.lang.annotation.*;


// Target is Used to Tell that where we can use this annotation
@Target({ElementType.METHOD})
// Retention will tell till what time this annotation will be available
@Retention(RetentionPolicy.RUNTIME)
// RetentionPolicy is by default
@Documented
public @interface TrackExecutionTime {
    long warnAfter() default  2000;
    String operation() default "";
}
