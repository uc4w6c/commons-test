package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class ContainsTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.contains("abc", "a")); // true
        System.out.println(StringUtils.contains("abc", "z")); // false

        System.out.println("contains any Start");
        System.out.println(StringUtils.containsAny("abc", new char[]{ 'b', 'd', 'e' })); // true
        System.out.println(StringUtils.containsAny("abc", new char[]{ 'd', 'e' })); // false
        System.out.println(StringUtils.containsAny("abc", "bde")); // true
        System.out.println("contains any End");

        System.out.println("contains none Start");
        System.out.println(StringUtils.containsNone("abc", "xyz")); // true
        System.out.println(StringUtils.containsNone("abc", "xbz")); // false
        System.out.println("contains none End");

        System.out.println("contains containsOnly Start");
        System.out.println(StringUtils.containsOnly("ab", "abc")); // true
        System.out.println(StringUtils.containsOnly("ab1", "abc")); // false
        System.out.println("contains containsOnly End");

        System.out.println("contains containsWhitespace Start");
        System.out.println(StringUtils.containsWhitespace("ab")); // false
        System.out.println(StringUtils.containsWhitespace(" ab")); // true
        System.out.println(StringUtils.containsWhitespace("ab ")); // true
        System.out.println(StringUtils.containsWhitespace("a b")); // true
        System.out.println("contains containsOnly Start");

    }
}
