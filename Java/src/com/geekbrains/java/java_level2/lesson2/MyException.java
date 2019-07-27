package com.geekbrains.java.java_level2.lesson2;

public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Ну, как-то так" + message;
    }
}
