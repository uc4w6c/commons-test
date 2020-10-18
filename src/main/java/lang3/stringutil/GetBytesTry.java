package lang3.stringutil;

import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;

public class GetBytesTry {
    public static void main(String[] args) {
        System.out.println(StringUtils.getBytes("A", StandardCharsets.UTF_8));
    }
}
