import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();
        int[]num= new int[n];

        int ans=0; int cnt=0;
        
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            
            if(i>0 && (num[i]>a && num[i-1]>a) ){
                cnt++;
            }else{
                if(num[i]<a && i==n-1){
                    cnt=0;
                }else{
                    cnt=1;
                }
            }
           ans= Math.max(ans,cnt);
        }
        System.out.print(ans);
    }
}