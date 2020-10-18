package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class IsNumericTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.isNumeric("abc")); // false
        System.out.println(StringUtils.isNumeric("11"));  // true
        System.out.println(StringUtils.isNumeric("१२३"));  // true

        System.out.println(StringUtils.isNumericSpace("1 1"));  // true

        System.out.println(StringUtils.isWhitespace("11")); // false
        System.out.println(StringUtils.isWhitespace(" "));  // true
    }
}
