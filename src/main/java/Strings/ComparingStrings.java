package Strings;
public class ComparingStrings {
    public static void main(String[] args) {

        String str1 = "onepiece";
        String str2 = "onepieceww";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        int i = 0;

        while (i < arr1.length && i < arr2.length) {
            if (arr1[i] != arr2[i]) {
                break;
            }
            i++;
        }

        if (i == arr1.length && i == arr2.length) {
            System.out.println("Both strings are equal");
        } else if (i == arr1.length) {
            System.out.println("String 2 is greater");
        } else if (i == arr2.length) {
            System.out.println("String 1 is greater");
        } else if (arr1[i] > arr2[i]) {
            System.out.println("String 1 is greater");
        } else {
            System.out.println("String 2 is greater");
        }
    }
}
