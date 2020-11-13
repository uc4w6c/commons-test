package collections4.listutils;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LazyListTry {
    public static void main(String[] args) {
        Factory<Date> factory = new Factory<Date>() {
            public Date create() {
                return new Date();
            }
        };
        List<Date> lazy = ListUtils.lazyList(new ArrayList<Date>(), factory);
        Date date = lazy.get(3);
        System.out.println(date); // Fri Nov 13 19:45:04 JST 2020

        System.out.println("--test2 start--");
        Factory<String> factory2 = new Factory<String>() {
            public String create() {
                return "aa";
            }
        };
        List<String> test1 = ListUtils.lazyList(new ArrayList<String>(), factory2);
        test1.add("1");
        test1.add("2");
        System.out.println(test1.get(1)); // 2
        System.out.println(test1.get(3)); // aa

        System.out.println("--test3 start--");
        Factory<String> factory3 = new Factory<String>() {
            private int count = 0;
            public String create() {
                return String.valueOf(count++);
            }
        };
        List<String> test2 = ListUtils.lazyList(new ArrayList<String>(), factory3);
        System.out.println(test2.get(1)); // 0
        System.out.println(test2.get(3)); // 1
        System.out.println(test2.get(1)); // 0
        System.out.println(test2.get(2)); // 2
        System.out.println(test2.get(3)); // 1
    }
}
