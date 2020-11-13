package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.Arrays;
import java.util.List;

public class FixedSizeListTry {
    public static void main(String[] args) {

        List<String> test1 = ListUtils.fixedSizeList(Arrays.asList("aa", "bb"));
        // test1.add("cc"); // UnsupportedOperationException
        // test1.remove(0); // UnsupportedOperationException
        test1.forEach(System.out::println); // aa bb
        test1.set(0, "cc");
        test1.forEach(System.out::println); // cc bb
    }
}
