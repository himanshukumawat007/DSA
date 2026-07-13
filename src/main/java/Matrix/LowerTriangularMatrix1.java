// Rom major mapping
package Matrix;
import java.util.Scanner;

public class LowerTriangularMatrix1 {
    public static void  set(int[] arr,int size,int n,int i,int j){
        if(i<1||j<1||i>size||j>size){
            System.out.println("invalid index");
            return;
        }
        if(i>=j){
            int y=(i*(i-1)/2)+(j-1);
            arr[y]=n;
        }
        else
            System.out.println("its a lower triangular matrix, so index no. should me i<=j");
    }
    public static void get(int[] arr,int i,int j){
        if(i>=j){
            System.out.println("val at index ("+i+","+j+") is " +arr[(i*(i-1)/2)+(j-1)]);
        }
    }
    public static void display(int[] arr,int size){
        for(int i=1;i<size;i++){
            for(int j=1;j<size;j++){
                if(i>=j){
                    System.out.print(arr[(i*(i-1)/2)+(j-1)]+" ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args){
        System.out.println("Enter size of the matrix : ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int size=k*(k+1)/2;
        int[] arr=new int[size];
        set(arr,size,1,1,1);
        set(arr,size,2,2,1);
        set(arr,size,3,3,2);
        set(arr,size,4,3,1);
        set(arr,size,5,5,1);
        set(arr,size,6,4,3);
        get(arr,3,2);
        get(arr,1,1);
        get(arr,5,1);
        display(arr,k);
    }
}
