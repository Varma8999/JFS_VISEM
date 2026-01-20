import java.util.Scanner;
class SumOfDigitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of digits of " + arr[i] + " = " + sum);
        }
    }
}
