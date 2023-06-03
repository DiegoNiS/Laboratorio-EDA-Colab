package Exceptions;
// ExceptionIsEmpty: Exepcion si esta vacio
public class ExceptionIsEmpty extends Exception{
    public ExceptionIsEmpty(String m){
        super(m);
    }
    public ExceptionIsEmpty(){
        super();
    }
}
