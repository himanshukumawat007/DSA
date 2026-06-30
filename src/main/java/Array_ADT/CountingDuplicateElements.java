package Array_ADT;

public class CountingDuplicateElements {
    public static void main(String[] args){
        int[] arr = new int[]{2,3,4,4,4,5,6,7,8,8,9};
        int n=11;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                int j=i+1;
                while(arr[j]==arr[i])
                    j++;
                System.out.println(arr[i] + " is appearing " + (j-i) + " times");
                i=j-1;
            }
        }
    }
}
