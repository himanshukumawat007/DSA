package Recursion;

public class NestedRecursion {
    public static int function(int n){
        System.out.println(n);
        if (n>100)
            return n-10;
        else
            return function(function(n+11));
    }
    public static void main(String[] args){
        function(95);
    }
}
