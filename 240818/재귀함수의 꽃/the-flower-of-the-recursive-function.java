import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        num(n);
    }
    public static void num(int n){
        if(n==0)
        return;

        System.out.print(n+" ");
        num(n-1);
        System.out.print(n+" ");
    }
}