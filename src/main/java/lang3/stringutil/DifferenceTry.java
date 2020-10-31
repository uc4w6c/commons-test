package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class DifferenceTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.difference("abc", "abcde"));  // de
        System.out.println(StringUtils.difference("abcde", "abc"));  // ""
        System.out.println(StringUtils.difference("abd", "abcde"));  // cde
        System.out.println(StringUtils.difference("cabc", "abcde")); // abcde
        System.out.println(StringUtils.difference("abcd", "abed"));  // ed
    }
}
