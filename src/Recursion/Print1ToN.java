package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        System.out.println(print1ToN(1));
        System.out.println(printNTo1(10));
    }
    static int print1ToN(int n){
        int N=1;
        if(n==10){
            return n;
        }
        System.out.print(n+" ");
        return print1ToN(N+n);
    }
    static int printNTo1(int n){
        if(n==1){
            return n;
        }
        System.out.print(n+" ");
        return printNTo1(n-1);
    }
}
