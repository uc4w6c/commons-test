package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.Arrays;
import java.util.List;

public class IsEqualListTry {
    public static void main(String[] args) {
        List<String> test1a = List.of("aa", "bb");
        List<String> test1b = List.of("bb", "aa");
        System.out.println(ListUtils.isEqualList(test1a, test1b)); // false

        List<String> test2a = List.of("aa", "bb");
        List<String> test2b = Arrays.asList("aa", "bb");
        System.out.println(ListUtils.isEqualList(test2a, test2b)); // true
    }
}
