public class SumOfArray {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Sum = " + sumArray(arr));
    }
}
