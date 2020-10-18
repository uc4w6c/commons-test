package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class IsAlphaTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.isAlpha("abc"));  // true
        System.out.println(StringUtils.isAlpha("ab2c")); // false
        System.out.println(StringUtils.isAlpha("ab-c")); // false

        System.out.println(StringUtils.isAlphanumeric("ab2c")); // true
        System.out.println(StringUtils.isAlphanumeric("abc"));  // true
        System.out.println(StringUtils.isAlphanumeric("ab)c")); // false

        System.out.println(StringUtils.isAlphanumericSpace("ab2c"));  // true
        System.out.println(StringUtils.isAlphanumericSpace("ab c"));  // true
        System.out.println(StringUtils.isAlphanumericSpace("ab(c"));  // false

        System.out.println(StringUtils.isAlphaSpace("ab c"));  // true
        System.out.println(StringUtils.isAlphaSpace("ab)c"));  // false
    }
}
