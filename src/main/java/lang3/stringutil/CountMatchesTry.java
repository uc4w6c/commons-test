package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class CountMatchesTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.countMatches("abba", "c")); // 0
        System.out.println(StringUtils.countMatches("abba", "a")); // 2
    }
}
