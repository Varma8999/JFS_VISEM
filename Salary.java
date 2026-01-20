import java.util.*;
public class Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sal = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary: ");
            int s = sc.nextInt();
            sal.add(s);
            total += s;
        }

        System.out.println("Average Salary = " + (total / (float)n));
    }
}