package lang3;

import org.apache.commons.lang3.StringUtils;

public class CountMatchesTry {
    public static void main(String[] args) {
        var str1 = "abc";
        var str2 = "abcaabcddcabcae";
        var count1 = StringUtils.countMatches(str1, str2);
        System.out.println(count1);
        var count2 = StringUtils.countMatches(str2, str1);
        System.out.println(count2);
    }
}
