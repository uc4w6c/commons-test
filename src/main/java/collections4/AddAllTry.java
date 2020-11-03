package collections4;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.ArrayList;

public class AddAllTry {
    public static void main(String[] args) {
        List<String> test1 = new ArrayList<String>();
        test1.add("aaa");
        CollectionUtils.addAll(test1, new String[] { "bbb", "ccc" });
        test1.forEach(System.out::println);

        List<String> test2 = new ArrayList<String>();
        CollectionUtils.addAll(test2, test1);
        test2.forEach(System.out::println);

    }

}
