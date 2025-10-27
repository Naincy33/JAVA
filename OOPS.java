class Student {
    String name;
    int age;
    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}
public class OOPS{
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "nano";
        s1.age= 19;

        s1.PrintInfo();
    }

}
