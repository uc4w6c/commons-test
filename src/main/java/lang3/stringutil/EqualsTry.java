package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class EqualsTry {
    public static void main(String[] args) {
        System.out.println("equals Start");
        System.out.println(StringUtils.equals("abc", "abc")); // true
        System.out.println(StringUtils.equals("abc", "def")); // false
        System.out.println(StringUtils.equals(null, null));   // true
        System.out.println(StringUtils.equals(null, "abc"));  // false
        System.out.println(StringUtils.equals("", null));     // false
        System.out.println("equals End");

        System.out.println("equalsAny Start");
        System.out.println(StringUtils.equalsAny("abc", "abc", "def")); // true
        System.out.println(StringUtils.equalsAny("abc", "def", "ghi")); // false
        System.out.println(StringUtils.equalsAny(null, "def", "ghi"));  // false
        System.out.println(StringUtils.equalsAny(null, "def", null));   // true
        System.out.println("equalsAny End");

        System.out.println("equalsAnyIgnoreCase Start");
        System.out.println(StringUtils.equalsAnyIgnoreCase("abc", "ABC", "def")); // true
        System.out.println(StringUtils.equalsAnyIgnoreCase("abc", "def", "ghi")); // false
        System.out.println("equalsAnyIgnoreCase End");

        System.out.println("equalsIgnoreCase Start");
        System.out.println(StringUtils.equalsIgnoreCase("abc", "ABC")); // true
        System.out.println(StringUtils.equalsIgnoreCase("ABC", "abc")); // true
        System.out.println(StringUtils.equalsIgnoreCase("ABC", "def")); // false
        System.out.println("equalsIgnoreCase End");
    }
}
