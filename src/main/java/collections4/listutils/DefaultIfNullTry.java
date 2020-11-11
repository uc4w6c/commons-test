package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class DefaultIfNullTry {
    public static void main(String[] args) {
        List<String> test1 = null;
        List<String> test1ans = ListUtils.defaultIfNull(test1, List.of("null"));
        test1ans.forEach(System.out::println); // null

        List<String> test2 = List.of("aa");
        List<String> test2ans = ListUtils.defaultIfNull(test2, List.of("null"));
        test2ans.forEach(System.out::println); // aa
    }
}
