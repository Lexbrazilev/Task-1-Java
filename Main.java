
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = createArray(scan);
        if (array != null) {
            processArray(array, scan);
        }
        scan.close();
    }

    public static int[] createArray(Scanner scan) {
        System.out.println("Введите размер массива");
        int size = scan.nextInt();
        if (size <= 1) {
            System.out.println("Массив не может быть равным 0 или 1 или отрицательным");
            return null;
        } else {
            int[] mass = new int[size];
            for(int j = 0; j < size; ++j) {
                System.out.println("Введите элементы массива");
                int num = scan.nextInt();
                mass[j] = num;
            }
            return mass;
        }
    }

    public static void processArray(int[] array, Scanner scan) {
         int sumPos = 0;
         int countPos = 0;

         for(int num : array) {
             if (num > 0) {
                 ++countPos;
                 sumPos += num;
             }
         }

         System.out.println("Сумма положительных элементов = " + sumPos + ", количество положительных элементов = " + countPos);
         System.out.println("Введите число B");
         int numSearch = scan.nextInt();
         int composNumB = 1;
         int countNumB = 0;

         for(int num : array) {
             if (num > numSearch) {
                  composNumB *= num;
                  ++countNumB;
             }
         }

         if (countNumB == 0) {
             composNumB = 0;
         }

         System.out.println("Вы ввели число " + numSearch + ", количество чисел больше введенного = " + countNumB + ", произведение этих чисел = " + composNumB);
    }
}
