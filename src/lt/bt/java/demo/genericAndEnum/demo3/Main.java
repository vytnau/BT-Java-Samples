package lt.bt.java.demo.genericAndEnum.demo3;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();
        queue.push("Pirmas");
        queue.push("Antras");
        queue.push("TreÄ�ias");
        queue.push("Ketvirtas");

        queue.pull();

        System.out.println(queue);

        Queue<Integer> q2 = new Queue<>();
        q2.push(100);
        q2.push(200);
        System.out.println("pull: " + q2.pull());
        System.out.println("pull: " + q2.pull());
        System.out.println("pull: " + q2.pull());
        q2.push(300);

        System.out.println(q2);
    }
}
