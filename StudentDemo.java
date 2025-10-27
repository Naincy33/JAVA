
import java.util.Scanner;

class Student {
    String usn, name, dept;
    int age, sem;

    // Method to set values
    void setDetails(String usn, String name, int age, String dept, int sem) {
        this.usn = usn;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.sem = sem;
    }

    // Method to print details
    void printDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        System.out.println("Semester: " + sem);
    }
}

// Derived class 1 — PG Student
class PG_Student extends Student {
    String intern_companyname;

    void setInternship(String company) {
        this.intern_companyname = company;
    }

    void printPGDetails() {
        printDetails();
        System.out.println("Internship Company: " + intern_companyname);
    }
}

// Derived class 2 — Research Scholar
class ResearchScholar extends Student {
    int no_publications;

    void setPublications(int n) {
        this.no_publications = n;
    }

    void printResearchDetails() {
        printDetails();
        System.out.println("No. of Publications: " + no_publications);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input PG Students
        System.out.print("Enter number of PG students: ");
        int n1 = sc.nextInt();
        PG_Student[] pg = new PG_Student[n1];

        for (int i = 0; i < n1; i++) {
            pg[i] = new PG_Student();
            System.out.println("\nEnter details of PG Student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Department: ");
            String dept = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();
            System.out.print("Internship Company: ");
            String company = sc.next();

            pg[i].setDetails(usn, name, age, dept, sem);
            pg[i].setInternship(company);
        }

        // Input Research Scholars
        System.out.print("\nEnter number of Research Scholars: ");
        int n2 = sc.nextInt();
        ResearchScholar[] rs = new ResearchScholar[n2];

        for (int i = 0; i < n2; i++) {
            rs[i] = new ResearchScholar();
            System.out.println("\nEnter details of Research Scholar " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Department: ");
            String dept = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();
            System.out.print("No. of Publications: ");
            int pub = sc.nextInt();

            rs[i].setDetails(usn, name, age, dept, sem);
            rs[i].setPublications(pub);
        }

        // i) Print PG students who have internship in company of user's choice
        System.out.print("\nEnter company name to search PG students: ");
        String searchCompany = sc.next();
        System.out.println("\nPG Students with internship in " + searchCompany + ":");
        boolean foundPG = false;
        for (PG_Student s : pg) {
            if (s.intern_companyname.equalsIgnoreCase(searchCompany)) {
                System.out.println("- " + s.name);
                foundPG = true;
            }
        }
        if (!foundPG) System.out.println("No PG student found in this company.");

        // ii) Print Research Scholars with 0 publications
        System.out.println("\nResearch Scholars with 0 publications:");
        boolean foundRS = false;
        for (ResearchScholar s : rs) {
            if (s.no_publications == 0) {
                s.printResearchDetails();
                System.out.println("--------------------------");
                foundRS = true;
            }
        }
        if (!foundRS) System.out.println("No Research Scholar with 0 publications.");

        sc.close();
    }
}
