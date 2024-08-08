import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();
        int[]num= new int[100];
        int cnt=0;
        while(true){
            if(n<4){
                num[cnt]=n;
                break;
            }else{
                num[cnt]=n%a;
                n=n/a;
                cnt++;
            }
        }
        for(int i=cnt; i>=0; i--){
            System.out.print(num[i]);
        }
        
    }
}