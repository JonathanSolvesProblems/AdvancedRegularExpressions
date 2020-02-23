package com.company;

public class Main {
    public static void main(String[] args) {
        String string = "I am a string. Yes I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "Neiw");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiikjl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y")); // . is a wildcard for any character
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // ^ replaces with just start of string

        String sendString = "abcDeeeF12abcDeeeGhhiiikjl99z";
        System.out.println(sendString.replaceAll("^abcDeee", "YYY")); // absolutely have to start with exactly abcDeee

        System.out.println(alphanumeric.matches("^hello"));

        System.out.println(alphanumeric.matches("^abcDeee")); // for matches, string as a whole as to be the same, returns false as well here.
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiikjl99z"));

        // $ is opposite of ^
        System.out.println(alphanumeric.replaceAll("kjl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // replaces all a e i with Xs

        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // replaces a, e, i, if follpwed by an F or j
    }
}