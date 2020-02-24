package QuantifiersPatternMatcherClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersPatternMatcherClasses {
    public static void main(String args[]) {
        String alphanumeric = "abcDeeeF12Ghhiiikjl99z";
        System.out.println(alphanumeric.replaceAll("^abcDe{3}", "YYY")); // ^ replaces with just start of string
        System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY")); // one or more es'.
        System.out.println(alphanumeric.replaceAll("^abcDe*", "YYY")); // 0 or more e's.
        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY")); // 2 - 5 e's
        System.out.println(alphanumeric.replaceAll("h+i*j", "Y")); // replace h's followed by at least one i and 0 or more j's.
        // Some java API's want to work with Pattern class.
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>another paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>summary text</p>");

        String h2Pattern = ".*<h2>.*"; // can be anything before or after
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
    }
}