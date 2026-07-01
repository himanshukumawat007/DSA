package Strings;



public class UpperToLowerCase {
    public static void main(String[] args){
        String str ="HELLO";
        char[] arr= str.toCharArray();
        int i;
        for(i=0;i<arr.length;i++) {
            if(arr[i]>='A' && arr[i]<='Z'){
            arr[i] = (char) (arr[i] + 32);
            }
        }
        System.out.print(arr);
    }
}
