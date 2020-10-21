package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class upperCaseTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.upperCase("cat")); // Cat
        System.out.println(StringUtils.upperCase("cAT")); // CAT
        System.out.println(StringUtils.upperCase("CAT")); // Cat
    }
}
