// Creating my first array

import java.util.Scanner;

public class Array_Basic{
    public static void main(String[] args) {
        int marks [] = new int [100]; // Creating an array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");

        marks [0] = sc.nextInt();// Taking inputs for array
        marks [1] = sc.nextInt();// Taking inputs for array
        marks [2] = sc.nextInt();// Taking inputs for array

        System.out.println("Phy : "+marks[0]);// Output of array
        System.out.println("chem : "+marks[1]);// Output of array
        System.out.println("Maths : "+marks[2]);// Output of array

        sc.close();
    }
}