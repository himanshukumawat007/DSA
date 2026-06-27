package Array_ADT;

public class BinarySearch {
    static int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100};

    public  static int Search(int low,int high,int val){
        if(low>high){
            System.out.println("Not Found");
            return 0;
        }
        int mid=(low+high)/2;
        if(arr[mid]==val){
            System.out.println("Found the no. at index "+ mid);
        } else if(arr[mid]>val) {
            Search(low,mid-1,val);
        }
        else {
            Search(mid+1,high,val);
        }
        return 1;
    }
    public static void main(String[] args){
        int low=0;
        int high=9;
        Search(0,9,100);


    }
}
