package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class IsBlankTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank("abc")); // false
        System.out.println(StringUtils.isBlank(" "));   // true
        System.out.println(StringUtils.isBlank(null));  // true

        System.out.println(StringUtils.isEmpty("abc")); // false
        System.out.println(StringUtils.isEmpty(" "));   // false
        System.out.println(StringUtils.isEmpty(null));  // true

        System.out.println(StringUtils.isNotBlank("abc")); // true
        System.out.println(StringUtils.isNotBlank(" "));   // false

        System.out.println(StringUtils.isAnyEmpty("abc", "")); // true
    }
}
