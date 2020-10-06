package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class AbbreviateTry {
    public static void main(String[] args) {
        System.out.println("abbreviate Start");
        System.out.println(StringUtils.abbreviate("", 4));        // null
        System.out.println(StringUtils.abbreviate("abcdefg", 6)); // abc...
        System.out.println(StringUtils.abbreviate("abcdefg", 7)); // abcdefg
        System.out.println(StringUtils.abbreviate("abcdefg", 8)); // abcdefg
        System.out.println(StringUtils.abbreviate("abcdefg", 4)); // a...
        // System.out.println(StringUtils.abbreviate("abcdefg", 3)); // IllegalArgumentException
        System.out.println("End");

        System.out.println("abbreviate Start");
        System.out.println(StringUtils.abbreviateMiddle(null, null, 0));    // null
        System.out.println(StringUtils.abbreviateMiddle("abc", null, 0));   // abc
        System.out.println(StringUtils.abbreviateMiddle("abc", ".", 0));    // abc
        System.out.println(StringUtils.abbreviateMiddle("abc", ".", 3));    // abc
        System.out.println(StringUtils.abbreviateMiddle("abcdef", ".", 4)); // ab.f
        System.out.println("End");
    }
}
