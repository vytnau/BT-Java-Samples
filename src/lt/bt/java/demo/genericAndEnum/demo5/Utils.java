package lt.bt.java.demo.genericAndEnum.demo5;

import java.util.Collection;
import java.util.List;

public class Utils {

    public static <T extends Number> Integer sum(Collection<T> list) {
        if (list == null) return 0;
        int sum = 0;
        for (T i : list) {
            sum += i.intValue();
        }
        return sum;
    }

    public static <T> String concat(Collection<T> list) {
        if (list == null) return "";
        StringBuilder sum = new StringBuilder("");
        for (T i : list) {
            if (sum.length() > 0) sum.append(',');
            sum.append(i);
        }
        return sum.toString();
    }
}
