package collections4.listutils;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class IndexOfTry {
    public static void main(String[] args) {
        List<Test> test1 = List.of(new Test("taro", 20), new Test("hanako", 18));
        int testAns1 = ListUtils.indexOf(test1, test -> test.getName().equals("taro"));
        System.out.println(test1.get(testAns1).getName()); // taro

        int testAns2 = ListUtils.indexOf(test1, test -> test.getAge() >= 19);
        System.out.println(test1.get(testAns2).getName()); // taro
    }

    public static class Test {
        private String name;
        private long age;

        public Test(String name, long age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return this.name;
        }
        public long getAge() {
            return this.age;
        }
    }
}
