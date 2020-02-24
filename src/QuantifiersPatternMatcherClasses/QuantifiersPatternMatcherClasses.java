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

        String h2Pattern = "<h2>"; // can be anything before or after - () is a group, access them using group method in matcher class.
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        // matchers can only use a matcher once
        matcher.reset(); // resets internal state so that we can use matcher again
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)"; // ? turns * quantifier into a lazy quantifier
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>).(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
    }
}