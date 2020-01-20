package com.coreJava;

public class WhileLoop {
    //While loop is used to iterate over data based on condition
    /*public static void main(String[] args){
        int i=0;
        while(i<9){
            i++;
            System.out.println(i);

        }
    }*/
    public static void main(String []args){

        int n=0;
        int sum =0;
        while(n<5)
        {
            sum =sum + n++;
            System.out.println(sum+"  " +n);

        }
/*

        output:
        0  1
        1  2
        3  3
        6  4
        10  5
*/

    }

}
