package Array_ADT;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int val,int[] arr){
        for(int i=0;i<10;i++){
            if (arr[i] == val) {
                System.out.println("Founded at index " + i);
                return 0;
            }
        }
     System.out.println("not found");
        return 0;
    }
    public static void main(String[] args){
        int[] arr=new int[]{10,20,30,40,50,60,70,80,90,100};
        System.out.print("Enter no. you want to search: ");
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();

        search(val,arr);
    }
}
