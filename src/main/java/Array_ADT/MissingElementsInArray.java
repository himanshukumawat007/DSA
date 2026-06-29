package Array_ADT;

public class MissingElementsInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 7, 8, 9, 10, 14, 15, 16};
        int diff = arr[0];
        for (int i = 0; i < 9; i++) {
            if (arr[i] - i != diff) {
                while (diff < arr[i]-i){
                    System.out.print(diff+i + " ");
                    diff++;
                }
            }

        }
    }
}
