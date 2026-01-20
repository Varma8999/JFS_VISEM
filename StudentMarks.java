import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int s = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[][] marks = new int[n][s];
        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            total[i] = 0;
            for (int j = 0; j < s; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            sc.nextLine();
        }

        int first = -1, second = -1;

        for (int i = 0; i < n; i++) {
            if (first == -1 || total[i] > total[first]) {
                second = first;
                first = i;
            } else if (second == -1 || (total[i] > total[second] && total[i] < total[first])) {
                second = i;
            }
        }

        if (second != -1) {
            System.out.println("\nSecond Topper Details:");
            System.out.println("Name: " + names[second]);
            System.out.println("Total Marks: " + total[second]);
            System.out.println("Average Marks: " + (double) total[second] / s);
        } else {
            System.out.println("\nSecond topper not available");
        }

        sc.close();
    }
}
