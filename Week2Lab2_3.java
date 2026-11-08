import java.util.Scanner;

public class Week2Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 marks: ");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();

        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
            System.out.println("error message");
        } else {
            double avg = (double) (m1 + m2 + m3) / 3;
            char grade;
            if (avg >= 70) {
                grade = 'A';
            }
            else if (avg >= 60) {
                grade = 'B';
            }
            else if (avg >= 50) {grade = 'C';
            }
            else {
                grade = 'F';
            }
            System.out.println("Average: " + avg);
            System.out.println("Grade: " + grade);
                    switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B', 'C' -> System.out.println("Good");
            default -> System.out.println("Resit needed");
        }
        }



        scanner.close();
    }
}