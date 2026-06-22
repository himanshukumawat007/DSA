package Array_ADT;

import java.util.Scanner;


public class InsertAndDelete {

    static int[] arr=new int[20];
    static int length=0;
    static int size=20;

    public static void create(int n, Scanner sc) {
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

    public static int insert(int index,int val){
        if(size<=length) {
            return 1;
        }
        for(int i=length;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=val;
        length++;
        return 0;

    }
    public static void display() {
        System.out.print("Array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void delete(int index){
        for(int i=index;i<length;i++){
            arr[i]=arr[i+1];
        }
        length--;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want to add? ");
        int n = sc.nextInt();

        create(n,sc);

        System.out.println("enter index no. in which you want to insert: ");
        int x=sc.nextInt();
        System.out.println("enter value which you want to insert at index"+ x + " :");
        int y=sc.nextInt();

        insert(x,y);
        display();
        System.out.println("enter index no. in which you want to delete: ");
        int z=sc.nextInt();

        delete(z);
        display();



    }
}
