import java.util.Scanner;
class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num = numbers[i];
            int rev = 0;
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            System.out.println("Reversed number for input " + numbers[i] + " = " + rev);
        }
        sc.close();
    }
}