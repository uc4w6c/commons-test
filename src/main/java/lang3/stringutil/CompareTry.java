package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class CompareTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.compare(null, null)); // 0
        System.out.println(StringUtils.compare(null, "a")); // < 0 : -1
        System.out.println(StringUtils.compare("a", null)); // > 0 : 1
        System.out.println(StringUtils.compare("abc", "abc")); // 0
        System.out.println(StringUtils.compare("a", "b")); // < 0 : -1
        System.out.println(StringUtils.compare("b", "a")); // > 0 : 1
        System.out.println(StringUtils.compare("a", "A")); // > 0 : 32

        System.out.println("compareIgnoreCase Start");
        System.out.println(StringUtils.compareIgnoreCase("a", "A")); // 0
        System.out.println(StringUtils.compareIgnoreCase("a", "B")); // -1
        System.out.println(StringUtils.compareIgnoreCase("A", "B")); // -1
        System.out.println("compareIgnoreCase End");
    }
}
