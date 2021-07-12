package input;

import java.util.Scanner;

public class howToinput{
        public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the first num:-");
        int a = scr.nextInt();
        System.out.println("Enter the second num: ");
        int b = scr.nextInt();
        int result = a+b;
        System.out.println("The result is:- "+result);    
    } 
}