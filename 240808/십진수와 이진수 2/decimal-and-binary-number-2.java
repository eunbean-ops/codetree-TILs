import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String[]aa= a.split("");
        int[]num= new int[aa.length];
        for(int i=0; i<num.length; i++){
            num[i]=Integer.parseInt(aa[i]);
        }
        int sum=0;  int cnt=num.length-1;
        
        for(int i=0; i<num.length; i++){
            int n=1;
            for(int j=0; j<cnt; j++){
                n=n*2;
            }
            cnt--;
            sum+=n*num[i];
        }
        

        sum=sum*17;  String result=""; String kk="";
        while(true){
            if(sum<2){
               
                 kk=sum+"";

                 result=kk+result;
                break;
            }else {
                 kk=(sum%2)+"";
                 sum=sum/2;
                 result=kk+result;
            }
        }
        System.out.print(result);

    }
}