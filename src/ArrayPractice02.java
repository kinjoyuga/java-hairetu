import java.util.Scanner;
public class ArrayPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("入力値を数値で入力してください: ");
        int inputValue = scanner.nextInt();

        int[] array = new int[inputValue];

        System.out.println(inputValue + "個の要素を入力してください:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("要素" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double avg = (double) sum / array.length;

        System.out.println("合計値: " + sum);
        System.out.println("平均値: " + avg);
    }
}
