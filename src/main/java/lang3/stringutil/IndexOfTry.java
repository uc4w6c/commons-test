package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class IndexOfTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.indexOf("abc", "a"));  // 0
        System.out.println(StringUtils.indexOf("abc", "b"));  // 1
        System.out.println(StringUtils.indexOf("abc", null)); // -1
        System.out.println(StringUtils.indexOf(null, "a"));   // -1
        System.out.println(StringUtils.indexOf(null, null));  // -1

        System.out.println(StringUtils.indexOf("abcabc", "a", 1));  // 3

        System.out.println(StringUtils.indexOfAny("abcabc", new String[] {"b", "a"}));  // 0
        System.out.println(StringUtils.indexOfAny("abcabc", new String[] {"b", "c"}));  // 1
        System.out.println(StringUtils.indexOfAny("abcabc", new String[] {"d", "e"}));  // -1

        System.out.println("indexOfAnyBut Start");
        System.out.println(StringUtils.indexOfAnyBut("abcabc", new char[] {'b', 'a'}));  // 2
        System.out.println(StringUtils.indexOfAnyBut("abcabc", new char[] {'b', 'c'}));  // 0
        System.out.println("indexOfAnyBut End");

        System.out.println("indexOfDifference Start");
        System.out.println(StringUtils.indexOfDifference(new String[] {"abcde", "abfgh"}));  // 2
        System.out.println("indexOfDifference End");

        System.out.println("indexOfIgnoreCase Start");
        System.out.println(StringUtils.indexOf("abc", "A"));  // -1
        System.out.println(StringUtils.indexOfIgnoreCase("abc", "A"));  // 0
        System.out.println("indexOfIgnoreCase End");

        System.out.println("lastIndexOf Start");
        System.out.println(StringUtils.lastIndexOf("abcabc", "a"));  // 3
        System.out.println("lastIndexOf End");
    }
}
