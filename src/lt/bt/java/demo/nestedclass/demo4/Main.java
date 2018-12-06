package lt.bt.java.demo.nestedclass.demo4;

public class Main {

    public static void main(String[] args) {

        A a = new A() {

            private int i = 1;

            @Override
            public long pow2() {
                i *= 2;
                return i;
            }
        };

        System.out.println(a.pow2());
        System.out.println(a.pow2());
        System.out.println(a.pow2());


        B b = new B(new Next() {
            @Override
            void inc() {
                this.i++;
            }
        });

        System.out.println(b.next());
        System.out.println(b.next());
        System.out.println(b.next());
        System.out.println(b.next());

        b.setNext(new Next() {
            @Override
            void inc() {
                set(get() + 2);
            }
        });

        System.out.println(b.next());
        System.out.println(b.next());
        System.out.println(b.next());
        System.out.println(b.next());

    }
}
