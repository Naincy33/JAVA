class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

public class oddnumexception {

    // Method that checks number
    static void checkNumber(int n) throws OddNumberException {

        if (n % 2 != 0) {
            throw new OddNumberException("Exception: Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static void main(String[] args) {

        try {
            checkNumber(10);
            checkNumber(7);
        }
        catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
