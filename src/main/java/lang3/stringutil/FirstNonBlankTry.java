package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class FirstNonBlankTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.firstNonBlank(null, "", "abc", "def")); // abc
        System.out.println(StringUtils.firstNonEmpty(null, "", "abc", "def")); // abc

        System.out.println(StringUtils.firstNonBlank(null, " ")); // null
        System.out.println(StringUtils.firstNonEmpty(null, " ")); // ""
    }
}
