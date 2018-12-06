package lt.bt.java.demo.genericAndEnum.demo3;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> {

    private List<E> q = new ArrayList<>();

    public void push(E element) {
        q.add(element);
    }

    public E pull() {
        if (q.size() > 0) {
            E element = q.get(0);
            q.remove(0);
            return element;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Queue{" + q + '}';
    }
}
