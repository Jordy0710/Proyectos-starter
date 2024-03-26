package pe.cibertec.ecommerce.ApiProduct.exception;

//Cualquier clase que quieras utilizar de manejo global de exeptions usar el extends RuntimeException
public class EntityNotFoundException extends RuntimeException{
    
    public EntityNotFoundException(String message){
        super(message);
    }
            
}
