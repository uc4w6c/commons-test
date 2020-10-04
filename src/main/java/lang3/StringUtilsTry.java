package lang3;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTry {
    public static void main(String[] args) {
        System.out.println("Hello" + StringUtils.SPACE +  "World!");
        System.out.println("Hello" + StringUtils.LF + "World!");

        System.out.println(StringUtils.capitalize("cat"));

        System.out.println(StringUtils.chop("cat"));
    }
}
