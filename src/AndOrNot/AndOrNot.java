package AndOrNot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AndOrNot {
    public static void main(String[] args) {
        // "abc" means "a" and "b" and "c"
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        // [^abc]
        String tvTest = "tstvtkt";
        // String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        int count = 0;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        // t(?=v)
        String phone1 = "1234567890"; // should not match
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123) 456-7890";


    }
}
