package Strings;

public class StringPermutation {
    static int permut(String str,String curr){
       if(str.length()==0){
           System.out.println(curr);
           return 0;
       }
       else{
           for(int i=0;i<str.length();i++){
               char ch= str.charAt(i);
               String remaining= str.substring(0,i)+str.substring(i+1);
               permut(remaining,curr+ch);
           }
       }
       return 0;
    }
    public static void main(String[] args){
     String str="ABC";
     permut(str,"");
    }
}
