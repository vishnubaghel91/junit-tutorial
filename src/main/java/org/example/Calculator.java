package org.example;

public class Calculator {

    public int add (int n1, int n2) {
        if (n1 ==  0) {
            return n2;
        }
        return n1 + n2;
    }

    public int subtract (int n1, int n2) {
        return n1 - n2;
    }
}
