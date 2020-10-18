package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class StartsWithTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.startsWith("abcde", "abc")); // true
        System.out.println(StringUtils.startsWith("abcde", "bc"));  // false
    }
}
