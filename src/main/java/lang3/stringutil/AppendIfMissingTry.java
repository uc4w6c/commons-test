package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class AppendIfMissingTry {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(StringUtils.appendIfMissing("abc", "xyz"));    // abcxyz
        System.out.println(StringUtils.appendIfMissing("abcxyz", "xyz")); // abcxyz
        System.out.println(StringUtils.appendIfMissing("abcXYZ", "xyz")); // abcXYZxyz

        System.out.println(StringUtils.appendIfMissing("abc", "xyz", ""));       // abc
        System.out.println(StringUtils.appendIfMissing("abcxyz", "xyz", "mno")); // abcxyz
        System.out.println(StringUtils.appendIfMissing("abcmno", "xyz", "mno")); // abcmno

        System.out.println(StringUtils.appendIfMissingIgnoreCase("abcXyZ", "xyz")); // abcXyZ
        System.out.println(StringUtils.appendIfMissingIgnoreCase("abcmNo", "xyz", "mno")); // abcmNo
        System.out.println("End");
    }
}
