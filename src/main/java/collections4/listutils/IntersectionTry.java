package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class IntersectionTry {
    public static void main(String[] args) {
        List<String> test1a = List.of("aa", "bb");
        List<String> test1b = List.of("bb", "cc");
        List<String> test1ans = ListUtils.intersection(test1a, test1b);
        test1ans.forEach(System.out::println); // bb
    }
}
