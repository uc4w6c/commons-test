package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class SubstringTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.substring("abcdef", 2)); // cdef
        System.out.println(StringUtils.substring("abc", 4));    // ""

        System.out.println(StringUtils.substring("abcdef", 2, 4)); // cd

        System.out.println("substringAfter Start");
        System.out.println(StringUtils.substringAfter("abcdef", "a"));      // bcdef
        System.out.println(StringUtils.substringAfter("abcabc", "bc"));     // abc

        System.out.println(StringUtils.substringAfterLast("abcabc", "ab")); // c
        System.out.println("substringAfter End");

        System.out.println("substringBefore Start");
        System.out.println(StringUtils.substringBefore("abcdef", "b"));      // a
        System.out.println(StringUtils.substringBefore("abcabc", "bc"));     // a

        System.out.println(StringUtils.substringBeforeLast("abcabc", "bc")); // abca
        System.out.println("substringBefore End");

        System.out.println("substringBetween Start");
        System.out.println(StringUtils.substringBetween("abcdefabc", "abc"));       // def
        System.out.println(StringUtils.substringBetween("abcdefabc", "def"));       // null
        System.out.println(StringUtils.substringBetween("abcdefabcghiabc", "abc")); // def
        System.out.println("substringBetween End");
    }
}
