package com.coreJava;

public class NestedIfElseExample {
    public static void main(String []args)
    {
        int i = 12;

        if(i == 12){
            if( i<15){
                System.out.println( "i is smaller then 15");
            }
            if(i<12){
                System.out.println( "i is smaller then 14 too");
            } else {
                System.out.println( "i is greater then 15");
            }
        }

    }
}
