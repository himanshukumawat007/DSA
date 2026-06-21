package Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){
        int[][] arr = new int[3][3];

        System.out.println("Enter no. you want to store: ");

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
