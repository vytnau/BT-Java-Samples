package lt.bt.java.demo.nestedclass.demo4;

public class B {

    private Next next;

    public B(Next next) {
        this.next = next;
    }

    int next() {
        next.inc();
        return next.get();
    }

    public Next getNext() {
        return next;
    }

    public void setNext(Next next) {
        this.next = next;
    }
}
