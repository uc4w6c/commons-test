package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class truncateTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.truncate("abcde", 3)); // abc

        System.out.println(StringUtils.truncate("abcde", 3, 2)); // de
    }
}
