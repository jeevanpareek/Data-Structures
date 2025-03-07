import java.util.Scanner;

public class Array_Update {
    public static void main(String[] args) {
        int marks [] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks : ");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();

        System.out.println("Marks : "+marks[0]);
        System.out.println("Marks : "+marks[1]);
        System.out.println("Marks : "+marks[2]);
        System.out.println("Marks : "+marks[3]);
        System.out.println("Marks : "+marks[4]);
        System.out.println("Marks : "+marks[5]);

        // Updating an array

        marks[5] = 100;
        System.out.println("Marks : "+marks[5]);

        sc.close();
    }
}
