package Recursion;

public class TowerOfHanoi {

    public static int TOH(int n, int A, int B,int C){
        if(n>0){
            TOH(n-1,A,C,B);
            System.out.println("from "+ A + "to" + C);
            TOH(n-1,B,A,C);
        }
return 0;
        }


    public static void main(String[] args){
        TOH(3,1,2,3);
    }
}
