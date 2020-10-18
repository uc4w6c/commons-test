package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class GetIfBlankTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.getIfBlank("", () -> "abc")); // abc
        System.out.println(StringUtils.getIfBlank("abc", () -> "NULL")); // abc

        System.out.println(StringUtils.getIfEmpty("", () -> "abc")); // abc
    }
}
