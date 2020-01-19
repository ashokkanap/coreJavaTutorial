package com.coreJava;

public class OperatorsExample {
    public static void main(String [] args){

        int i =0;
        int p = ++i + i++ + --i + i;
        System.out.println(i);

        int j =0;
        int l= j++;
        System.out.println(l);
        System.out.println(j);

    }
}
