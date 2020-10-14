package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class DefaultIfUtilTry {
    public static void main(String[] args) {
        System.out.println("defaultBlank Start");
        System.out.println(StringUtils.defaultIfBlank("bat", "NULL")); // bat
        System.out.println(StringUtils.defaultIfBlank(null, "NULL"));  // NULL
        System.out.println(StringUtils.defaultIfBlank("", "NULL"));    // NULL
        System.out.println(StringUtils.defaultIfBlank(" ", "NULL"));   // NULL
        System.out.println("defaultBlank End");

        System.out.println("defaultEmpty Start");
        System.out.println(StringUtils.defaultIfEmpty("bat", "NULL")); // bat
        System.out.println(StringUtils.defaultIfEmpty(null, "NULL"));  // NULL
        System.out.println(StringUtils.defaultIfEmpty("", "NULL"));    // NULL
        System.out.println(StringUtils.defaultIfEmpty(" ", "NULL"));   // " "
        System.out.println("defaultEmpty End");

        System.out.println("defaultString Start");
        System.out.println(StringUtils.defaultString(null));  // ""
        System.out.println(StringUtils.defaultString("bat")); // bat
        System.out.println("defaultString End");
    }
}
