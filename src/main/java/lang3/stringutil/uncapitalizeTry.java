package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class uncapitalizeTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.uncapitalize("cat")); // cat
        System.out.println(StringUtils.uncapitalize("Cat")); // cat
        System.out.println(StringUtils.uncapitalize("CAT")); // cAT
    }
}
