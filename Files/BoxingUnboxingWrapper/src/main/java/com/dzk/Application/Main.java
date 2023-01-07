package com.dzk.Application;

public class Main {
    public static void main(String[] args) {
        int x = 20;

        //Wrapper classes such as 'Integer' have the function to treat primitive types as classes.
        //Usually used in entitie fields - Because Wrappers can accept null values, primitive types do not accept it
        Integer obj = x;
        //Object obj = x;

        System.out.println(obj);

        int y = obj * 2;

        System.out.println(obj);
    }
}