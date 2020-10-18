package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class IsMixedCaseTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.isMixedCase("ABC"));  // false
        System.out.println(StringUtils.isMixedCase("AbC"));  // true
        System.out.println(StringUtils.isMixedCase("A 1c")); // true
    }
}
