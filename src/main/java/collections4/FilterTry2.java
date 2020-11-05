package collections4;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class FilterTry2 {
    public static void main(String[] args) {
        List<String> test1 = new ArrayList<>();
        test1.add("aa");
        test1.add("bb");
        test1.add("ab");
        boolean test1Ans1 = CollectionUtils.filter(test1, value -> value.equals("aa"));
        System.out.println(test1Ans1);
        test1.forEach(System.out::println); // filterして削除される

        boolean test1Ans2 = test1.stream().anyMatch(value -> value.equals("aa"));
        System.out.println(test1Ans2);
    }
}
