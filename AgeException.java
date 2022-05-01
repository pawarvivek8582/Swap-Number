

package com.test;
import java.util.Scanner;

public class AgeException extends RuntimeException{

public AgeException(String massege){

super(massege);

}

public static void main(String [] args){

      System.out.println("enter your age");
         Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age > 18){
           throw new AgeException("not able to vote");
            }
         System.out.println("eligible");   

}

}


