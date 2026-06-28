package Array_ADT;

public class ReversingArray {
    public static void main(String[] args){
        int[] arr= new int[]{10,20,30,40,50,60,70,80,90,100};
        int length=10;
        System.out.println("Before reversing array :");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+ " ");
        }
        int x;
        for(int i=0,j=length-1;i<j;i++,j--){
            x=arr[i];
            arr[i]=arr[j];
            arr[j]=x;
        }
        System.out.println("\nAfter reversing array :");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
