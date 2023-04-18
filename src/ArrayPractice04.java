import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("要素" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();


        for (var i = 0; i < array.length - 1; i++) {
            for (var j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (var i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
