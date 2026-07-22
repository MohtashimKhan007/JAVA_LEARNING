package in.Strikes.crudSpringBootDemo.exception;
// we want this exception to come inside the runtime exception
public class ResourceNotFoundException  extends  RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }

}
