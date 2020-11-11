package collections4.collectionutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class AddIgnoreNullTry {
    public static void main(String[] args) {
        List<String> test1 = new ArrayList<>();
        CollectionUtils.addIgnoreNull(test1, "aa");
        CollectionUtils.addIgnoreNull(test1, "");
        CollectionUtils.addIgnoreNull(test1, null);
        CollectionUtils.addIgnoreNull(test1, "bb");
        test1.forEach(System.out::println);
    }
}
