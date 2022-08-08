package com.example;

import java.util.Scanner;

public class Home {
    static int fibonacciTotal;
    static int x1=0, x2, x3;

    public static void main(String[] args){
        options();
    }

    public static void options(){

        System.out.println("Please choose the option below.");
        System.out.println("1.Palindrome");
        System.out.println("2.Fibonacci");

        try{
            Scanner keyboard = new Scanner(System.in);
            int input = keyboard.nextInt();
            int result = 0;
            switch (input){
                case 1:
                    palindrome();
                    ;break;
                case 2:
                    fibonacci();
                    ;break;
                default:
                    result = -1;
                    break;
            }

            if(result == -1){
                System.out.println("Invalid input, please try again!");
                options();
            }
        } catch (Exception e){
            System.out.println("Error : "+ e);
            options();
        }

    }

    public static void palindrome(){
        System.out.println("Enter the word...");

        try{
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            String word = input.replaceAll("[^a-zA-Z]+", "");

            String reverseString="";
            for(int i=word.length()-1;i>=0;i--){
                reverseString += word.charAt(i);
            }

            if(word.equalsIgnoreCase(reverseString)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        } catch (Exception e){
            System.out.println("Error : "+ e);
        }
        options();
    }

    public static void fibonacci(){
        System.out.println("Enter the fibonacci count...");
        try{
            Scanner keyboard = new Scanner(System.in);
            int input = keyboard.nextInt();
            if(input<0){
                System.out.println(0);
            }else if(input == 1){
                System.out.println("Total value of fibonacci count : 0");
            }else if(input == 2){
                System.out.println("Total value of fibonacci count : 1");
            }else {
                x1 = 0;
                x2 = 1;
                x3 = 0;
                fibonacciTotal  = 1;
                System.out.println("Total value of fibonacci count : "+recursion(input-2));
            }
        } catch (Exception e){
            System.out.println("Error : "+ e);
        }
        options();
    }

    public static int recursion(int input){

        if(input>0){
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            fibonacciTotal +=x3;
            recursion(input-1);
        }
        return fibonacciTotal;
    }

}
