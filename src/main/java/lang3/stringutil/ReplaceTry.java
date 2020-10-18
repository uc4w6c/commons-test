package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class ReplaceTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.replace("abc", "a", "z")); // zbc

        System.out.println(StringUtils.replace("abcabcabc", "a", "z")); // zbczbczbc
        System.out.println(StringUtils.replace("abcabcabc", "a", "z", 2)); // zbczbcabc
    }
}
