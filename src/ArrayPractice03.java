public class ArrayPractice03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (var i = 0; i < 9; i++){
            for (var j = 0; j < 9; j++){
                var ans = array[i] * array[j];
                System.out.println(array[i] + "×" + array[j] + "=" + ans);
            }
            System.out.println("---------------");
        }
    }
}
