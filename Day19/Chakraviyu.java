package Day19;

import java.util.Scanner;

public class Chakraviyu {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. ");
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

         for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+"  ");

            }
            System.out.println();
        }



         


    }
}