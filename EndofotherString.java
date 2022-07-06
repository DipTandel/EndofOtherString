// EndofotherString
// Oct 7th, 2021
// ICS4U1, Dip
// Given two strings, return true if either of the strings appears at the very end of the other string, 
//ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
//Note: str.toLowerCase() returns the lowercase version of a string.

import java.util.Scanner;
public class EndofotherString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a String: ");
    String text1 = in.next();
    System.out.println("Enter a String: ");
    String text2 = in.next();
    
    text1.toLowerCase();
    text2.toLowerCase();

    boolean endofother = false;
    if (text1.length() >= text2.length()) {
      if (text1.substring(text1.length()-text2.length()).equals(text2)) {
        endofother = true;
      }
    }
    else {
      if (text2.substring(text2.length()-text1.length()).equals(text1)) {
        endofother = true;
      }
    }
    System.out.println(endofother);
  }
}