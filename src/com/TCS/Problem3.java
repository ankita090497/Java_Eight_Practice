package com.TCS;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Problem3 {

    // Find out Special character from the String
    public static void main(String[] args) {

        String s = "abc@tech#pqr$123";
        int count = 0;
        String specialCharRemoved = "";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
                count++;
            }else{
                specialCharRemoved = specialCharRemoved + s.charAt(i);
            }
        }

        if (count == 0) {
            System.out.print("There is no special character in string");
        } else {
            System.out.println("Special Character count  : " + count);
        }
           System.out.println("Special Character  : " + specialCharRemoved);
    }
}
