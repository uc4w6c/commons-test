package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

public class GetDigitsTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.getDigits("abc")); // ""
        System.out.println(StringUtils.getDigits("1000$")); // 1000
        System.out.println(StringUtils.getDigits("1123~45")); // 112345
        System.out.println(StringUtils.getDigits("(541) 754-3010")); // 5417543010
        System.out.println(StringUtils.getDigits("१२३")); // १२३
        System.out.println(StringUtils.getDigits("１２３")); // １２３
    }
}
