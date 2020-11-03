package collections4;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class ContainsAnyTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aa", "bb");
        List<String> test2 = List.of("cc", "bb");
        System.out.println(CollectionUtils.containsAny(test1, test2)); // true

        System.out.println(CollectionUtils.containsAny(test1, "cc", "bb")); // true
    }
}
