package lt.bt.java.demo.functions;

public class ChangeValueSample {

    public static void main(String[] args){
        int number = 0;
        printText("Value: " + number);
        calculate(number);
        printText("Value after change: " + number);

        printText("-------------------");
        int[] array = {0, 1, 2};
        printText("value: " + array[0]);
        changeValue(array);
        printText("Value after change: " + array[0]);
    }

    private static void changeValue(int[] myArray){    	
        for(int i = 0; i < myArray.length; i++){
            myArray[i] += 2;
        }
    }

    private static void calculate(int number){
        number = number + 2;
    }

    private static void printText(String text){
        System.out.println(text);
    }

}
