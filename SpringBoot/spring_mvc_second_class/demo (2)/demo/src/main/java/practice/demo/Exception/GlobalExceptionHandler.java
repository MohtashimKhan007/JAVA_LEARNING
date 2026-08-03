package practice.demo.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import practice.demo.controller.example.AuthController;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// if we want that this will work for everyone so we us ControllerAdvice -> it return json so we use @RestController

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException ex){
        logger.error(ex.getMessage());
        ex.printStackTrace();

        return ex.getMessage();
    }


    // This exception is for Method Argument Not valid exception
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String,String> errorMap = new HashMap<>();
        // fetch all error list from bindingResult
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();

        // now we have iterate  throw all the error and put those errors in the Map

        allErrors.forEach((ObjectError error)->{
            // we have to find the field of the error
          String fieldName =   ((FieldError)error).getField();
          String message =  error.getDefaultMessage();
          errorMap.put(fieldName,message);
        });
        return errorMap;
    }

}
