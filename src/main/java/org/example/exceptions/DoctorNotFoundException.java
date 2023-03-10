package org.example.exceptions;

public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(String message){
        super("Нет такого доктора: "+message);
    }
}
