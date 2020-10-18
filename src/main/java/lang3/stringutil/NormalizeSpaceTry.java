package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class NormalizeSpaceTry {
    public static void main(String[] args) {
        System.out.println("a\tc"); // a    c
        System.out.println(StringUtils.normalizeSpace("a\tc")); // a c
        System.out.println("a\nc"); // a
                                    // c
        System.out.println(StringUtils.normalizeSpace("a\nc")); // a c
    }
}
