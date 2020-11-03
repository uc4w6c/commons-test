package collections4;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class ContainsAllTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aa", "bb", "cc");
        List<String> test2 = List.of("bb", "aa");
        System.out.println(CollectionUtils.containsAll(test1, test2)); // true

        List<String> test3 = List.of("aa", "bb", "cc");
        List<String> test4 = List.of("bb", "ff");
        System.out.println(CollectionUtils.containsAll(test3, test4)); // false

        List<String> test5 = List.of("aa", "bb", "cc");
        List<String> test6 = List.of("aa", "bb", "bb");
        System.out.println(CollectionUtils.containsAll(test5, test6)); // true

        List<String> test7 = List.of("aa", "bb", "cc");
        List<Integer> test8 = List.of(1, 2);
        System.out.println(CollectionUtils.containsAll(test7, test8)); // false

        // 並び順変えてみた
        List<String> test9 = List.of("aa", "bb", "cc");
        List<String> test10 = List.of("bb", "aa");
        System.out.println(CollectionUtils.containsAll(test9, test10)); // true
    }
}
