package com.practise.demo.shared.exceptions;

public abstract class EntityNotFoundException extends RuntimeException {

    private DtoError error;

    public EntityNotFoundException(String message) {
        this.error = new DtoError(message);
    }

    public DtoError getError() {
        return error;
    }
}