import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(sum(n));
    }
    public static int sum(int a){
     int ans=0;  
        for(int i=1; i<=a; i++){
            ans+=i;
        }
        return ans/10;
    }
}