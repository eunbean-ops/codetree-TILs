import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.print(sum(n));
    }
    
    public static int sum(int n){
        
        if(n==0)
        return 0;
    
        return sum(n-1)+n ;
       
        
    }
    
}