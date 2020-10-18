package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class RepeatTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.repeat("a", 3)); // aaa
        System.out.println(StringUtils.repeat("a", ",", 3)); // a,a,a
    }
}
