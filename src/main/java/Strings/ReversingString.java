package Strings;

public class ReversingString {
    public static void main(String[] args){
        String str ="onepiece";
        char[] arr= str.toCharArray();

        int i;
        int j=arr.length;
        char temp;
        for(i=0,j=arr.length-1;i<j ;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(arr);
    }
}
