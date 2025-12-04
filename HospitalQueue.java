
class Patient<T, V> {

    private T tokenNumber;
    private V patientName;

    public Patient(T tokenNumber, V patientName) {
        this.tokenNumber = tokenNumber;
        this.patientName = patientName;
    }

    // Method to display the details
    public void displayDetails() {
        System.out.println("Token Number: " + tokenNumber);
        System.out.println("Patient Name: " + patientName);
    }
}

public class HospitalQueue {

    public static void main(String[] args) {

        // Creating an object using Integer (token) and String (name)
        Patient<Integer, String> p1 = new Patient<>(101, "Arun Kumar");
        p1.displayDetails();

        Patient<Integer, String> p2 = new Patient<>(102, "tina");
        p2.displayDetails();
    }
}
