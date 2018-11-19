package lt.bt.java.demo.functions;

public class FunctionSample {

    public static void main(String args[]){
        printHelloWorld();
        printText("First text");
        printText("Second text");
    }

    private static void printHelloWorld(){
        System.out.println("Hello World");
    }

    private static void printText(String text){
        System.out.println(text);
    }
}
