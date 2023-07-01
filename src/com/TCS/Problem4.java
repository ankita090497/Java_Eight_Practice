package com.TCS;

public class Problem4 {

    // WAP to check these string are rotation of each other or not
    //I/P : ABCD
    // O/P : CDAB

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if(isRotation(str1,str2)){
            System.out.println("Rotation of string is present");
        }else{
            System.out.println("Rotation of string is not present");
        }
    }

    public static boolean isRotation(String s1,String s2){
        return (s1.length() == s2.length() && (s1+s2).indexOf(s2)!= -1);

    }
}
