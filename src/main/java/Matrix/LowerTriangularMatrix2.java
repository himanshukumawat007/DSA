package Matrix;

import java.util.Scanner;

public class LowerTriangularMatrix2 {
    public static void set(int[] arr,int k,int i, int j,int val){
        if(i<1 || i>k || j<1 || j>k){
            System.out.println("Invalid Index");
            return;
        }
        if(i < j){
            System.out.println("Lower triangular matrix requires i >= j");
            return;
        }
        arr[(k*(j-1)-(j-1)*(j-2)/2)+(i-j)]=val;
    }
    public static void display(int[] arr,int k){
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                if(i>=j)
                System.out.print(arr[(k*(j-1)-(j-1)*(j-2)/2)+(i-j)]+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter size of the matrix: ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int size=k*(k+1)/2;
        int[] arr=new int[size];
        set(arr,k,1,1,10);
        set(arr,k,3,2,20);
        set(arr,k,4,2,30);
        set(arr,k,3,3,40);
        set(arr,k,2,1,60);
        set(arr,k,5,4,90);
        display(arr,k);



    }
}
