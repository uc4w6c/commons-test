package collections4;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class ExtractSingletonTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aaa", "bb", "aaa", "ccc");
        // String test1Ans = CollectionUtils.extractSingleton(test1); // IllegalArgumentException
        // System.out.println(test1Ans);

        List<String> test2 = List.of("aa");
        String test2Ans = CollectionUtils.extractSingleton(test2);
        System.out.println(test2Ans); // aa
    }
}
