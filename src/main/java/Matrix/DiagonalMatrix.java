package Matrix;

public class DiagonalMatrix {
    static void set(int[]arr,int i, int j,int val){
        if(i==j){
            arr[i-1]=val;
        }
    }
    static int get(int[]arr,int i, int j){
        if(i==j){
            return arr[i-1];
        }
        return 0;
    }
    static void display(int[]arr){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(get(arr,i,j) + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int[] arr=new int[4];
        set(arr,1,1,3);
        set(arr,2,2,7);
        set(arr,3,3,5);
        set(arr,4,4,6);
        display(arr);
    }
}
