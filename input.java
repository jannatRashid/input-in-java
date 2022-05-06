import java.util.Scanner;

public class input {
    static String name;
    static double marks;
    static int rollno;

    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter name, rollno,marks:");
            name = scn.nextLine();
            rollno = scn.nextInt();
            marks = scn.nextDouble();
        }

        System.out.println("Name: " + name);

        System.out.println("roll number: " + rollno);
        System.out.println("marks: " + marks);

    }

}
