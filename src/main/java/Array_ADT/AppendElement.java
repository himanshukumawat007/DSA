package Array_ADT;

import java.util.Scanner;

class Array {
    int size;
    int length;
    int[] arr;

    Array(int size) {
        this.size = size;
        this.length = 0;
        this.arr = new int[size];
    }

    void create(int n, Scanner sc) {
        if (n > size) {
            System.out.println("Array size exceeded!");
            return;
        }

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        length = n;
    }

    void append(int value) {
        if (length >= size) {
            System.out.println("Array is full!");
            return;
        }

        arr[length] = value;
        length++;
    }

    void display() {
        System.out.print("Array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class AppendElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Array a = new Array(10);

        System.out.print("How many elements do you want to insert? ");
        int n = sc.nextInt();

        a.create(n, sc);

        a.display();

        System.out.print("Enter one element to append: ");
        int value = sc.nextInt();

        a.append(value);

        a.display();

        sc.close();
    }
}

