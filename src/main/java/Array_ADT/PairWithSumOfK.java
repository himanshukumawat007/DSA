package Array_ADT;

public class PairWithSumOfK {
    public static void main(String[] args){
        int[] arr = new int[]{2,5,6,8,2,9,10,4,1};

        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(arr[i]+arr[j]==10){
                    System.out.println(arr[i] + " + " + arr[j] + " = 10" );
                }
            }
        }
    }
}
