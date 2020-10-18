package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class ReverseTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("abc")); // cba

        System.out.println(StringUtils.reverseDelimited("a.b.c", 'x')); // a.b.c
        System.out.println(StringUtils.reverseDelimited("a.b.c", '.')); // c.b.a
    }
}
