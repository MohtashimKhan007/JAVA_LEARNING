package practice.demo.Utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// where we have to use this for that we use Target Annotation
//ElementType  because we have to use this on the property/field of any class
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {GenderValidator.class})
public @interface  ValidGender {

    String message() default "Invalid Gender";
//    groups for grouping the constraints
    Class<?>[] groups() default {};
    // payload is for extra metadata
    Class<? extends Payload>[] payload() default {};
}
