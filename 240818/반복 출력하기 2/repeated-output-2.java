import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println("HelloWorld");
    }
}