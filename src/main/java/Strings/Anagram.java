package Strings;

public class Anagram {
    public static void main(String[] args){
        String str1 = "onepiece";
        String str2 = "oneecepi";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        int[] H=new int[26];
        boolean anagram=true;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                H[arr1[i]-97]++;
            }
            for(int i=0;i<arr2.length;i++){
                H[arr2[i]-97]--;
            }
            for(int i=0;i<H.length;i++){
                if(H[i]!=0)
                    anagram=false;

            }
            if(anagram==true){
                System.out.println("anagram");
            }
            else  System.out.println("Not anagram");


    }
        else
            System.out.println("Not anagram");
}
}



