
package lt.bt.java.tasks.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayHomeWork {

    public static void main(String[] args) throws FileNotFoundException {
        //1 task: Suskaičiuoti masyvo elemento vidurki
        String filePath = "C:\\sources\\mokymai\\BalticTalents-Samples\\res\\txt\\task\\ArrayTaskData.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int elementCount = 0;
        while (scanner.hasNextInt()) {
            scanner.nextInt();
            elementCount++;
        }
        scanner.close();
        scanner = new Scanner(file);
        int[] array = new int[elementCount];

        for(int i = 0; i < elementCount; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg = avg / array.length;
        System.out.println("Masyvo elementu vidurkis: " + avg);

        //2 task: Pasalinti masyvo elementus mazesnius uz vidurki
        int newArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                newArraySize++;
            }
        }

        int[] task2Array = new int[newArraySize];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > avg) {
                task2Array[j] = array[i];
                j++;
            }
        }

        System.out.println();
        System.out.print("[ ");
        for(int i = 0; i < task2Array.length; i++){
            System.out.print(task2Array[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        //3 task: Visus neigiamus skaicius perkelti i nauja masyva o is senojo istrinti
        int negativeNumberCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]< 0){
                negativeNumberCount++;
            }
        }

        int[] negativeArray = new int[negativeNumberCount];
        int[] positiveArray = new int[array.length - negativeNumberCount];

        for(int i = 0, j = 0, k = 0; i < array.length; i++){
            if(array[i] < 0){
                negativeArray[j] = array[i];
                j++;
            } else {
                positiveArray[k] = array[i];
                k++;
            }
        }

        System.out.println("Postive array:");
        System.out.print("[ ");
        for(int i = 0; i < positiveArray.length; i++){
            System.out.print(positiveArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("Negative array");
        System.out.print("[ ");
        for(int i = 0; i < negativeArray.length; i++){
            System.out.print(negativeArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        //4 task: Surikiuoti masyvus didejimo ir mazejimo tvarkomis
        for(int i = 0; i < positiveArray.length; i++){
            for(int j = i + 1; j < positiveArray.length; j++){
                int sk1 = positiveArray[i];
                int sk2 = positiveArray[j];
                if(sk1 < sk2){
                    positiveArray[j] = sk1;
                    positiveArray[i] = sk2;
                }
            }
        }

        for(int i = 0; i < negativeArray.length; i++){
            for(int j = i + 1; j < negativeArray.length; j++){
                int sk1 = negativeArray[i];
                int sk2 = negativeArray[j];
                if(sk1 < sk2){
                    negativeArray[j] = sk1;
                    negativeArray[i] = sk2;
                }
            }
        }

        System.out.println("Postive array sorted:");
        System.out.print("[ ");
        for(int i = 0; i < positiveArray.length; i++){
            System.out.print(positiveArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("Negative array sorted:");
        System.out.print("[ ");
        for(int i = 0; i < negativeArray.length; i++){
            System.out.print(negativeArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        for(int i = 0; i < positiveArray.length; i++){
            for(int j = i + 1; j < positiveArray.length; j++){
                int sk1 = positiveArray[i];
                int sk2 = positiveArray[j];
                if(sk1 > sk2){
                    positiveArray[j] = sk1;
                    positiveArray[i] = sk2;
                }
            }
        }

        for(int i = 0; i < negativeArray.length; i++){
            for(int j = i + 1; j < negativeArray.length; j++){
                int sk1 = negativeArray[i];
                int sk2 = negativeArray[j];
                if(sk1 > sk2){
                    negativeArray[j] = sk1;
                    negativeArray[i] = sk2;
                }
            }
        }

        System.out.println("Postive array sorted:");
        System.out.print("[ ");
        for(int i = 0; i < positiveArray.length; i++){
            System.out.print(positiveArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("Negative array sorted");
        System.out.print("[ ");
        for(int i = 0; i < negativeArray.length; i++){
            System.out.print(negativeArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();

    }
}
