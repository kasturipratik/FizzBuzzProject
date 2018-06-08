package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String print[] =fizzBuzz();
        for(int i =0; i <print.length;i++){
            System.out.println(print[i]);
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
            else{
                num[i-1] =String.valueOf(i);
            }

        }
        //array returning
        return num;

    }
}