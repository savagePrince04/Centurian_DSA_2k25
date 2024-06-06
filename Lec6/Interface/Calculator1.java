package Lec6.Interface;

import Lec6.Interface.Calculator;

public class Calculator1 implements Calculator {
    @Override
    public void Add() {
       int a=10;
       int b=20;
        System.out.println(a+b);
    }

    @Override
    public void Sub() {
    int b=20;
    int a=10;
        System.out.println(b-a);
    }
    // A


}
