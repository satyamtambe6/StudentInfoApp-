import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter college name: ");
        String college = sc.nextLine();

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);
        System.out.println("ID      : " + id);

        sc.close();
    }
}
 
