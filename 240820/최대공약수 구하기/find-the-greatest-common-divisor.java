import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        max(n,m);
    }
    public static void max(int n, int m){
     int result=1;    
        
        while(true){
             boolean zz=false;
            for(int i=2; i<10; i++){
                if(n%i==0 && m%i==0){
                    result=result*i;
                    n=n/i; m=m/i;
                    zz=true;
                }
            }
            if(zz==false){
                System.out.print(result);
                break;
            }
        }
    }
}