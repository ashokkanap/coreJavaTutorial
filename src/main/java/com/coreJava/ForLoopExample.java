package com.coreJava;

public class ForLoopExample {

    public static void main(String []args){
        for (int i=1; i<=4; i++){
            System.out.println(i);
        }
    }

 // ForEach loop :For Each loop will iterate over each data in given array or set of data.
    /*public void forEach(){
            int arr[]= {10,11,12,13,14};
            for (int j: arr){
                System.out.println(j);
            }
        }*/

    //Labled For loop:We can have name of each for loop.To do so,we use label before the for loop.

/*
public static void main(String[] args){
    aa:for(int i=1;i<=3;i++){
    bb:for(int j=1;j<=3; j++){
        if(i ==2 && j ==2){
            break bb;
        }
        System.out.println(i+" "+j);
    }
    }
}
output:
            1 1
            1 2
            1 3
            2 1
            3 1
            3 2
            3 3
            */

}
