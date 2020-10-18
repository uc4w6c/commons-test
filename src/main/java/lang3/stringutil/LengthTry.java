package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class LengthTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.length("abc")); // 3
        System.out.println(StringUtils.length(null));  // 0
        System.out.println(StringUtils.length(" "));   // 1
    }
}
