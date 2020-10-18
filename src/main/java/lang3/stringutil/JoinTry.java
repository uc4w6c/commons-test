package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class JoinTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.join(new byte[]{1, 2, 3}, ';')); // 1;2;3
        System.out.println(StringUtils.join(new char[]{'a', 'b', 'c'}, ',')); // a;b;c

        System.out.println(
            StringUtils.join(List.of("aa", "bb", "cc"), ',', 1, 3)
        ); // bb, cc

        System.out.println(StringUtils.joinWith(",", "a", "b", "cd")); // a,b,cd
    }
}
