package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class OverlayTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.overlay("abcdef", "zz", 2, 4)); // abzzef
        System.out.println(StringUtils.overlay("abcdef", "zzzzzz", 2, 4)); // abzzzzzzef
    }
}
