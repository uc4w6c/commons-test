package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class unwrapTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.unwrap("AABabcBAA", 'A')); // ABabcBA
        System.out.println(StringUtils.unwrap("ABCA", 'A')); // BC

        // System.out.println(StringUtils.unwrap("ababa", "aba")); // 修正中っぽい
        System.out.println(StringUtils.unwrap("aaa", 'a')); // a
    }
}
