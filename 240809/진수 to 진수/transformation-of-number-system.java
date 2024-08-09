import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        String c= sc.next();
        String[]cc=c.split("");

        int[]ccc=new int[cc.length];
        for(int i=0; i<cc.length; i++){
            ccc[i]=Integer.parseInt(cc[i]);
        }
        int cnt=cc.length-1;
         int sum=0;
        for(int i=0; i<cc.length; i++){
            int n=1;
            for(int j=0; j<cnt; j++){
                n=n*a;
            }
            sum+=n*ccc[i];
            cnt--;
        } 
        int cnt2=0;
        int []result= new int[100];
        while(true){
            if(sum<b){
                result[cnt2]=sum;
                break;
            }else{
                result[cnt2]=sum%b;
                sum=sum/b;
                cnt2++;
            }
        }
        for(int i=cnt2; i>=0; i--){
            System.out.print(result[i]);
        }

    }
}