class string {
    public static void main(String[] args) {

        String org = "This is a test. This is, too.";
        String search = "is";  // substring to find
        String sub = "was";    // substring to replace with
        String result = "";
        int i;

        do {
            System.out.println(org); // print current string state

            i = org.indexOf(search); // find "is"

            if (i != -1) {
                // Cut before "is"
                result = org.substring(0, i);

                // Add replacement
                result = result + sub;

                // Add the remaining part after "is"
                result = result + org.substring(i + search.length());

                // Update original string
                org = result;
            }

        } while (i != -1);
    }
}
