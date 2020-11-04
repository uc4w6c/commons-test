package collections4;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.List;

public class EmptyCollectionTry {
    public static void main(String[] args) {
        Collection<String> test = CollectionUtils.emptyCollection();
        if (test.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}
