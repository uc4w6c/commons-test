package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class IsAllTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.isAllBlank(null, ""));    // true
        System.out.println(StringUtils.isAllBlank(null, "abc")); // false

        System.out.println(StringUtils.isAllBlank(null, " ")); // true
        System.out.println(StringUtils.isAllEmpty(null, " ")); // false

        System.out.println("isAllLowerCase Start");
        System.out.println(StringUtils.isAllLowerCase("abc")); // true
        System.out.println(StringUtils.isAllLowerCase("aBc")); // false
        System.out.println("isAllLowerCase End");

        System.out.println("isAllUpperCase Start");
        System.out.println(StringUtils.isAllUpperCase("ABC")); // true
        System.out.println(StringUtils.isAllUpperCase("AbC")); // false
        System.out.println("isAllUpperCase End");
    }
}
