package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class RemoveTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.remove("abcabc", "ab")); // cc

        System.out.println(StringUtils.removeEnd("abcabc", "ab")); // abcabc
        System.out.println(StringUtils.removeEnd("abcabc", "bc")); // abca

        System.out.println(StringUtils.removeStart("abcabc", "ab")); // cabc
        System.out.println(StringUtils.removeStart("abcabc", "bc")); // abcabc
    }
}
