import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        
        int[]num= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }//입력받소
        int cnt=0; int ans=0;//최대값
        for(int i=0; i<n; i++){
            if(i>0 && (num[i]>num[i-1])){
                cnt++;
            }else{
                cnt=1;
            }
            ans= Math.max(ans,cnt);
        } 
        System.out.print(ans);
    }
}