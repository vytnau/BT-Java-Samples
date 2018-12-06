package lt.bt.java.demo.genericAndEnum.demo4;

import java.util.ArrayList;

public class ListIntSum<T extends Number> extends ArrayList<T> {

    Integer sum() {

        Integer s = 0;
        for(Number n : this) {
            s += n.intValue();
        }
        return s;
    }

}
