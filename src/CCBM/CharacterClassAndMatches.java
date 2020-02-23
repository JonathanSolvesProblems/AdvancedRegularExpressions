package CCBM;

public class CharacterClassAndMatches {
    public static void main(String[] args){
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String alphanumeric = "abcDeeeF12Ghhiiikjl99z";

        System.out.println(alphanumeric.replaceAll("[^ej]", "X")); // ^ inside [] brackets, actually character class, it negates stuff that follows it.
        // regular expressions are case sensitive
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X")); // dash character is specifying range
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // another way to turn of case sensitivity works for ascii strings, want to use ?iu for uni-code string
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X")); // \\d matches any digit
        System.out.println(alphanumeric.replaceAll("\\D", "X")); // replaces all non-digits with X

        String hasWhiteSpace = "I have blanks and \ta tab and also a new line\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", "")); // removes all white spaces
        System.out.println(hasWhiteSpace.replaceAll("\t", "X")); // replaces \t with X
        System.out.println(hasWhiteSpace.replaceAll("\\S", "")); // only tab, spaces and newline remain

        System.out.println(alphanumeric.replaceAll("\\w", "X")); // replaces all non-white space
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X")); // good with surrounding each words with tags of some kind



    }
}
