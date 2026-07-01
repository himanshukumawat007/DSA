package Strings;


public class CountingWordsAndVowels {
    public static void main(String[] args){
        String str ="How are you";
        char[] arr= str.toCharArray();
        int vcount=0;
        int words=1;
        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vcount++;
            }
            if (c == ' ') {
                words++;
            }

        }
      System.out.println("Sentence: " + new String(arr));
        System.out.println("no. of vowels : "+ vcount);
        System.out.print("no. of words :" + words );
    }
}
