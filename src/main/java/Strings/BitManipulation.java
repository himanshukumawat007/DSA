package Strings;

import java.util.Scanner;

public class BitManipulation {
        public static char kthCharacter(int k) {
            String word = "a";

            while (word.length() < k) {
                String temp = "";

                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    ch++;
                    temp += ch;
                }

                word = word + temp;
            }

            return word.charAt(k - 1);
        }
        public static void main(String[] args){
            System.out.print("Enter the kth no. you want to find out: ");
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            System.out.println("\n" +kthCharacter(k));
        }
    }

