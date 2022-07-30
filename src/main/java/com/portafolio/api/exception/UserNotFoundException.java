
package com.portafolio.api.exception;


public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String mensaje) {
        super(mensaje);
    }
    
}