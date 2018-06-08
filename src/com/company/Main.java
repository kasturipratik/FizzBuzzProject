package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //calling array
       String result [] = randomNum();
       //printing array using a for loop
        for (int i =0;i<result.length;i++){
            System.out.println(result[i]);
        }


    }
    public static String[] fizzBuzz(){
        String num[] = new String[100];
        for(int i =1; i<=num.length;i ++){
            if(i %3 ==0){
                if(i%5==0){
                    num[i-1]="Fizz Buzz";
                }
                else {
                    num[i - 1] = "Fizz";
                }
            }
            else if (i%5 ==0 ){
                if(i%3 ==0){
                    num[i-1]="Fizz Buzz";
                }
                else{
                    num[i-1]="Buzz";
                }
            }
            else if (i%7 ==0){
                num[i-1] = String.valueOf(i)+ " - multiple of seven";
            }
            else{
                num[i-1] =String.valueOf(i);
            }

        }
        //array returning
        return num;

    }

    public static String[] randomNum(){
       //random number object
        Random rnd = new Random();
        int solution =0;
        // generate random number and set it to variables
        int beginning = 1+rnd.nextInt(100);
        int ending = 1+rnd.nextInt(100);

        //call fizzBuzz method to get the condition for fizz and buzz
        String [] result = fizzBuzz();
        //set the array to the size of the fizzBuzz array
        String content[] = new String[result.length];
//for loop to assign fizzBuzz values to content
        for(int i =0;i <result.length;i++){
            content[i] = result[i];
        }
        //condition to change the content elemen
        if(beginning == ending){
            content[0] = "Shazam";
            content[content.length-1] = "Shazam";
        }
        else if((beginning - ending) <10 ){

            if(beginning < ending){
                int temp = beginning;
                beginning = ending;
                ending = temp;
                solution = ending- beginning;
            }
            else{
                solution = beginning - ending;
            }
            content[0] = "This won't take long - " + String.valueOf(solution);
            content[content.length-1] =  "This won't take long - " +String.valueOf(solution);
        }

        return content;
    }
}
