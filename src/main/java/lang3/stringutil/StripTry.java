package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class StripTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.strip(" abc "));  // abc
        System.out.println(StringUtils.strip(" ab c ")); // ab c

        System.out.println(StringUtils.strip("abcyz", "xyz")); // abc
        System.out.println(StringUtils.strip("abcyz", "zx"));  // abcy

        Arrays.stream(StringUtils.stripAll(new String[] {" abc ", " def"})).forEach(System.out::println);
        // abc
        // def
        System.out.println(StringUtils.stripEnd(" abc ", " "));   // " abc"
        System.out.println(StringUtils.stripStart(" abc ", " ")); // "abc "

        System.out.println(StringUtils.stripToEmpty(" abc "));   // "abc"
        System.out.println(StringUtils.stripToEmpty(null));   // ""

        System.out.println(StringUtils.stripToNull(" abc ")); // "abc"
        System.out.println(StringUtils.stripToNull(null));    // null
    }
}
