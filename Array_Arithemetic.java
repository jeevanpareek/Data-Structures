import java.util.Scanner;

public class Array_Arithemetic {
    public static void main(String[] args) {
        long marks [] = new long [100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");

        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();
        marks [3] = sc.nextInt();
        marks [4] = sc.nextInt();
        marks [5] = sc.nextInt();
        marks [6] = sc.nextInt();
        marks [7] = sc.nextInt();
        marks [8] = sc.nextInt();
        marks [9] = sc.nextInt();
        marks [10] = sc.nextInt();
        marks [11] = sc.nextInt();

        System.out.println("Marks : "+marks[0]);
        System.out.println("Marks : "+marks[1]);
        System.out.println("Marks : "+marks[2]);
        System.out.println("Marks : "+marks[3]);
        System.out.println("Marks : "+marks[4]);
        System.out.println("Marks : "+marks[5]);
        System.out.println("Marks : "+marks[6]);
        System.out.println("Marks : "+marks[7]);
        System.out.println("Marks : "+marks[8]);
        System.out.println("Marks : "+marks[9]);
        System.out.println("Marks : "+marks[10]);
        System.out.println("Marks : "+marks[11]);

        // Performing basic Arithemetic Operations on above array

        long Add_Array = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5]+marks[6]+marks[7]+marks[8]+marks[9]+marks[10]+marks[11];

        System.out.println("Addition is : "+Add_Array);


        long Sub_Array = marks[0]-marks[1]-marks[2]-marks[3]-marks[4]-marks[5]-marks[6]-marks[7]-marks[8]-marks[9]-marks[10]-marks[11];

        System.out.println("Substraction is : "+Sub_Array);


        long Product_Array = marks[0]*marks[1]*marks[2]*marks[3]*marks[4]*marks[5]*marks[6]*marks[7]*marks[8]*marks[9]*marks[10]*marks[11];

        System.out.println("product is : "+Product_Array);

        sc.close();
    }
}
