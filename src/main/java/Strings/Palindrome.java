package Strings;

public class Palindrome {
    public static void main(String[] args){
        String str1 ="naman";
        char[] arr= str1.toCharArray();
        int i,j;
        Boolean ispalindrome=true;
        for(i=0,j=arr.length-1;i<j;i++,j--){
            if(arr[i]!=arr[j]) {
               ispalindrome=false;
                break;
            }

        }
        if(ispalindrome)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");

    }

}
