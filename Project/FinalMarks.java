
import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        External[] students = new External[n];
        Internals[] internalData = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internalMarks = new int[5];
            System.out.println("Enter 5 internal marks:");
            for (int j = 0; j < 5; j++)
                internalMarks[j] = sc.nextInt();

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE marks:");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();

            internalData[i] = new Internals(internalMarks);
            students[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\n--- Final Marks of Students ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
            for (int j = 0; j < 5; j++) {
                int finalMark = internalData[i].internalMarks[j] + students[i].seeMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
            System.out.println();
        }

        sc.close();
    }
}