package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class CenterTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.center("ab", 4)); // [ ab ]
        System.out.println(StringUtils.center("ab", 3)); // [ab ]
        System.out.println(StringUtils.center("a", 4)); // [ a  ]

        System.out.println(StringUtils.center("a", 4, '#')); // [#a##]
        System.out.println(StringUtils.center("a", 4, "yz")); // [yayz]
    }
}
