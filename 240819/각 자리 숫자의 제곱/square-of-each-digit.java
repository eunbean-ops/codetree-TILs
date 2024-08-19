import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(num(n));
    }
    public static int num(int n){
        if(n<10){
            return n*n;
        }
        return num(n/10)+(n%10)*(n%10);
    }
}