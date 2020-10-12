package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class ChompTry {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(StringUtils.chomp("abc\r")); // "\r"が削除される
        System.out.println(StringUtils.chomp("abc\r\n")); // "\r\n"が削除される
        System.out.println(StringUtils.chomp("abc\r\n\r\n")); // "\r\n"が1つだけ削除される

        System.out.println("End");
    }
}
