package collections4.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CollateTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aa", "cc", "ff");
        List<String> test2 = List.of("bb", "dd", "ee");
        List<String> test3 = CollectionUtils.collate(test1, test2);
        test3.forEach(System.out::println);
    }
}
