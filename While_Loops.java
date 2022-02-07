import java.util.Arrays;

public class While_Loops {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -3, 0, 7};
        double[] nums = {2.4, 4.0, -1.2, 0};
        int[] values = {4, 3, 3, 2};
        System.out.println(totalSum(numbers));
        System.out.println(countTotal(nums));
        System.out.println(Arrays.toString(buildArray(3)));
        System.out.println(Arrays.toString(negateArray(numbers)));
        System.out.println(getAverage(values));
    }
    public static int totalSum(int[] arr) {
        int i = 0;
        int amount = 0;
        while (i < arr.length) {
            amount += arr[i];
            i++;
        }
        return amount;
    }
    public static double countTotal(double[] arr) {
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            count++;
            i++;
        }
        return count;
    }
    public static int[] buildArray(int n) {
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            arr[i] = i;
            i++;
        }
        return arr;
    }
    public static int[] negateArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            arr[i] = arr[i] *(-1);
            i++;
        }
        return arr;
    }
    public static double getAverage(int[] arr) {
        int i = 0;
        double average = 0.0;
        while (i < arr.length) {
            average += arr[i];
            i++;
        }
        return average/ arr.length;
    }
}
