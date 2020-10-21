package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class trimTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.trim(" abc ")); // "abc"
        System.out.println(StringUtils.trim(null));    // null
        System.out.println(StringUtils.trim(" "));     // ""

        System.out.println(StringUtils.trimToEmpty(" abc ")); // "abc"
        System.out.println(StringUtils.trimToEmpty(null));    // ""
        System.out.println(StringUtils.trimToEmpty(" "));     // ""

        System.out.println(StringUtils.trimToNull(" abc ")); // "abc"
        System.out.println(StringUtils.trimToNull(null));    // null
        System.out.println(StringUtils.trimToNull(" "));     // null
    }
}
