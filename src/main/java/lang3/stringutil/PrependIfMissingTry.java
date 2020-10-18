package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class PrependIfMissingTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.prependIfMissing("abc", "xyz")); // xyzabc
        System.out.println(StringUtils.prependIfMissing("xyzabc", "xyz")); // xyzabc

        System.out.println(StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz")); // XYZabc
    }
}
