package com.exception;

public class OutOfBounds extends IndexOutOfBoundsException {
        public OutOfBounds() {
    }

    public OutOfBounds(String message) {
        super(message);
    }
}
