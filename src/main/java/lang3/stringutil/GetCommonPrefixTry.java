package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class GetCommonPrefixTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.getCommonPrefix(new String[] {"abc", "abe"})); // ab
        System.out.println(StringUtils.getCommonPrefix(new String[] {"abc", "cab"})); // ""
    }
}
