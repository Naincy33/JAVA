class CmdLineDemo
{
    public static void main(String sss[])
    {
        System.out.println("No of command line arguments are: " + sss.length);
        System.out.println("Command line arguments are:");

        for (int i = 0; i < sss.length; i++) {
            System.out.println("Argument " + i + ": " + sss[i]);
        }
    }
}



class CmdLineDemo
{
    public static void main(String sss[])
    {
        int x;
        double y;
        float z;

        System.out.println("No of command line arguments are: " + sss.length);

        // Print all arguments
        for(int i=0; i<sss.length; i++)
        {
            System.out.println("Argument " + i + ": " + sss[i]);
        }

        // Convert and sum
        x = Integer.parseInt(sss[0]);
        y = Double.parseDouble(sss[1]);
        z = Float.parseFloat(sss[2]);

        System.out.println("Sum = " + (x + y + z));
    }
}
