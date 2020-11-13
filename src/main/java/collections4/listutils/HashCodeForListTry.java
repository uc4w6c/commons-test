package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class HashCodeForListTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aa", "bb");
        System.out.println(test1.hashCode()); // 100321
        System.out.println(ListUtils.hashCodeForList(test1)); // 100321
    }
}
