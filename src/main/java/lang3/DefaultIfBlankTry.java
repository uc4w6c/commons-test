package lang3;

import org.apache.commons.lang3.StringUtils;

public class DefaultIfBlankTry {
    public static void main(String[] args) {
        String tmp1 = "";
        String result1 = StringUtils.defaultIfBlank(tmp1, "default");
        System.out.println(result1);
        String tmp2 = "tmp2";
        String result2 = StringUtils.defaultIfBlank(tmp2, "default");
        System.out.println(result2);
        String tmp3 = null;
        String result3 = StringUtils.defaultIfBlank(tmp1, "default");
        System.out.println(result3);
    }
}
