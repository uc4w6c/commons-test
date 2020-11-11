package collections4.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class FilterTry {
    public static void main(String[] args) {
        // UnsupportedOperationExceptionが発生する
        // immutableだからっぽい。バグかな。仕様とも言えるかも
        List<String> test1 = List.of("aa", "bb", "ab");
        boolean test1Ans1 = CollectionUtils.filter(test1, value -> value.contains("a"));
        System.out.println(test1Ans1);

        boolean test1Ans2 = CollectionUtils.filter(test1, value -> value.contains("c"));
        System.out.println(test1Ans2);
    }
}
