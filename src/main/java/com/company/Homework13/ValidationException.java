package com.company.Homework13;

public class ValidationException extends Exception {

    public ValidationException(){
super();
    }
    public ValidationException(String message){
     super(message);
    }
    public ValidationException(Throwable e){
        super(e);
    }

    public ValidationException(String message,Throwable e){
        super(message,e);

    }





}
