package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class RotateTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.rotate("abcd", 0));  // abcd
        System.out.println(StringUtils.rotate("abcd", 1));  // dabc
        System.out.println(StringUtils.rotate("abcd", -2)); // cdab
    }
}
