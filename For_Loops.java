public class For_Loops {
    public static void main(String[] args) {
        int[] nums = {3, -4, 2, 124, 8, 10, 5};
        System.out.println(howManyBy3());
        System.out.println(howManyBy3TheSequel(6));
        System.out.println(parityDistribution(nums));
    }
    public static  int howManyBy3() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%3 == 0) {
                count++;
            }
        }
        return count;
    }
    public static  int howManyBy3TheSequel(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0) {
                count++;
            }
        }
        return count;
    }
    public static String parityDistribution(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        String evenAndOdd = "Even: " + even + "\n" + "Odd: " + odd;
        return evenAndOdd;
    }
}
