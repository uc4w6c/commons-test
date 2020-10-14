package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class EndsWithTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.endsWith( "abcdef", "def")); // true
        System.out.println(StringUtils.endsWith( "ABCDEF", "def")); // false
        System.out.println(StringUtils.endsWith( "abcdef", "cde")); // false

        System.out.println("endsWithAny Start");
        System.out.println(StringUtils.endsWithAny( "abcdef", new String[]{"abc", "def"})); // true
        System.out.println(StringUtils.endsWithAny( "abcdef", new String[]{"abc", "cde"})); // false
        System.out.println("endsWithAny End");

        System.out.println("endsWithIgnoreCase Start");
        System.out.println(StringUtils.endsWithIgnoreCase( "ABCDEF", "def")); // true
        System.out.println(StringUtils.endsWithIgnoreCase( "abcdef", "DEF")); // true
        System.out.println(StringUtils.endsWithIgnoreCase( "ABCDEF", "cde")); // false
        System.out.println("endsWithIgnoreCase End");
    }
}
