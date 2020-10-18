package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class SplitTry {
    public static void main(String[] args) {
        Arrays.stream(StringUtils.split("abc def")).forEach(System.out::println);
        // abc
        // def

        Arrays.stream(StringUtils.split("a.bc", ".")).forEach(System.out::println);
        // a
        // bc

        Arrays.stream(StringUtils.split("a.b.c", ".", 2)).forEach(System.out::println);
        // a
        // b.c

        Arrays.stream(StringUtils.splitByCharacterType("number5")).forEach(System.out::println);
        // number
        // 5

        Arrays.stream(StringUtils.splitByCharacterType("testData")).forEach(System.out::println);
        // test
        // D
        // ata

        Arrays.stream(StringUtils.splitByCharacterTypeCamelCase("testData")).forEach(System.out::println);
        // test
        // Data
    }
}
