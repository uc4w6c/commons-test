package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class LeftTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.left("abcd", 2)); // ab
        System.out.println(StringUtils.leftPad("abc", 5)); //  abc
        System.out.println(StringUtils.leftPad("abc", 1)); // abc
        System.out.println(StringUtils.leftPad("abc", 5, '*')); // **abc

        System.out.println(StringUtils.right("abcd", 2)); // cd

        System.out.println(StringUtils.mid("abcd", 2, 2)); // cd
        System.out.println(StringUtils.mid("abcd", 1, 1)); // b
    }
}
