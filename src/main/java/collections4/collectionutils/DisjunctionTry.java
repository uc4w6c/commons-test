package collections4.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class DisjunctionTry {
    public static void main(String[] args) {
        List<String> test1a = List.of("aa", "bb");
        List<String> test1b = List.of("cc", "bb");
        List<String> test1c = (List<String>) CollectionUtils.disjunction(test1a, test1b);
        test1c.forEach(System.out::println); // aa bb
    }
}
