package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class ContainsTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.contains("abc", "a")); // true
        System.out.println(StringUtils.contains("abc", "z")); // false
    }
}
