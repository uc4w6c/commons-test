package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class DeleteWhitespaceTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.deleteWhitespace(" abc"));   // abc
        System.out.println(StringUtils.deleteWhitespace("abc "));   // abc
        System.out.println(StringUtils.deleteWhitespace("a b c"));  // abc
    }
}
