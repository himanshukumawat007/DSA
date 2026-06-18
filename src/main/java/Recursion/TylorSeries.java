package Recursion;

public class TylorSeries {
    static  double s=1;

    public static double series(double n,double x){


        if (n==0)
            return s;
        else{
            s=1+x/n*s;
            return series(n-1,x);

        }
    }

    public static void main(String[] args){
        System.out.println(series(15,10));
    }
}
