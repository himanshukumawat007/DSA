package Recursion;

public class CombinatonFormula {
    public static int formula(int n, int r){
        if(n==r || r==0)
            return 1;
        else
            return formula(n-1,r-1) + formula(n-1,r);
    }

    public static void main(String[] args){
        System.out.println(formula(4,2));
    }
}
