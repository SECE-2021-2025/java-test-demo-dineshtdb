import java.util.*;
public class Main {
    public static int add(int a, int b) {
       return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.print( add(a,b));
    }
}
