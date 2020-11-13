package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class PartitionTry {
    public static void main(String[] args) {
        List<String> test1 = List.of("aa", "bb");
        List<List<String>> test1ans = ListUtils.partition(test1, 2);
        test1ans.forEach( list -> {
            System.out.println("start");
            list.forEach(System.out::print);
            System.out.println();
            System.out.println("end");
        });
        // start aabb end
    }
}
