public class ArrayPractice01 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 89, 75, 64, 50, 74, 93, 95, 85};

        var sum = 0;
        var avg = 0.0;
        for(var i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg = (double) sum / scores.length;


        System.out.println("合計値：" + sum);
        System.out.println("平均値：" + avg);


    }
}
