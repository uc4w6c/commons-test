package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class LongestCommonSubsequenceTry {
    public static void main(String[] args) {
        List<String> test1a = List.of("aa", "bbbb", "ccc", "d", "ff");
        List<String> test1b = List.of("aa", "bbbb", "ccc", "e", "ff");
        List<String> test1ans = ListUtils.longestCommonSubsequence(test1a, test1b);
        test1ans.forEach(System.out::println); // aa bbbb ccc ff
        // ちょっと使い方があまりわからない。。。
    }
}
