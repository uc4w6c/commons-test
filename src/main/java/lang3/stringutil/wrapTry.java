package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class wrapTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.wrap("abc", 'X')); // XabcX
        System.out.println(StringUtils.wrap("abc", "--")); // --abc--

        System.out.println(StringUtils.wrapIfMissing("--abc", "--")); // --abc--
        System.out.println(StringUtils.wrapIfMissing("--abc--", "--")); // --abc--
    }
}
