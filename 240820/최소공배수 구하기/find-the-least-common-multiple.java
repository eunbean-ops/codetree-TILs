import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        min(n,m);
    }
    public static void min(int a, int b){
        int result=1;
        for(int i=2; i<12; i++){
            if(a%i==0 && b%i==0){
                result=result*i;
                a=a/i; b=b/i;
            }
        }
        result=result*a*b;
        System.out.print(result);
    }
}