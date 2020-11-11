package collections4.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class EmptyIfNullTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aa");
        List<String> test1Ans = (List<String>) CollectionUtils.emptyIfNull(test1);
        if (test1Ans.isEmpty()) {
            System.out.println("empty");
        } else {
            test1Ans.forEach(System.out::println);
        }

        List<String> test2 = null;
        List<String> test2Ans = (List<String>) CollectionUtils.emptyIfNull(test2);
        if (test2Ans.isEmpty()) {
            System.out.println("empty");
        } else {
            test2Ans.forEach(System.out::println);
        }
    }
}
