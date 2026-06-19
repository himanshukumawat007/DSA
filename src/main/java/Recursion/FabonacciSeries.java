package Recursion;

public class FabonacciSeries {

    static int[] arr= new int[50];

    public static int fab(int n){

        if (n<=1) {
            arr[n] = n;
            return n;
        }
        else {
            if (arr[n - 2] == -1)
                arr[n - 2] = fab(n - 2);
            if (arr[n - 1] == -1)
                arr[n - 1] = fab(n - 1);

            return arr[n - 1] + arr[n - 2];
        }
    }
    public static void main(String[] args){
        for(int i=0;i<50;i++){
            arr[i]=-1;
        }
        int r=fab(1);
        System.out.println(r);
    }
}
