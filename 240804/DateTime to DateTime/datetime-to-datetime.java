import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();   int cnt=0;
        if(a<11|| a==11&&b<11 || a==11&& b==11 && c<11){
            System.out.print("-1");
        }else{
            //일
        cnt+=(a-11)*24*60;
        //시간
        if(b<11){
            cnt-=(11-b)*60;
        }else if(b>11){
            cnt+=(b-11)*60;
        }
        //분
        if(c<11){
            cnt-=11-c;
        }else if(c>11){
            cnt+=c-11;
        }

        System.out.print(cnt);
        }
        
    }
}