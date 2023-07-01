package com.TCS;

public class Problem2 {

    // Reverse number
    public static void main(String[] args) {

        int num = 123;
        int revsNum = 0;

        while(num != 0){
            int reminder = num % 10;
            revsNum = revsNum*10+reminder;
            num = num/10;
        }

        System.out.print("Reverse Number : "+revsNum);


    }
}

