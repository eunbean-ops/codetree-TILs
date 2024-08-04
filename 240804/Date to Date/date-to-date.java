import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int m1= sc.nextInt();
        int d1= sc.nextInt();
        int m2= sc.nextInt();
        int d2= sc.nextInt(); int cnt=0;
        if(m1==m2){
            System.out.print(m2-m1+1);
        }else{
            while(true){
                if(m1==m2&&d1==d2){
                    break;
                }else if(m1==m2){
                    if(d1>d2){
                        cnt-=d1-d2-1;
                    }else if(d1<d2){
                        cnt+=d2-d1+1;
                    }
                }else{
                    if(m1==2){
                        cnt+=28;
                    }else if(m1<8 && m1%2!=0){
                        cnt+=31;
                    }else if(m1<8 && m1%2==0){
                        cnt+=30;
                    }else if(m1>7 && m1%2==0){
                        cnt+=31;
                    }else{
                        cnt+=30;
                    }
                    m1++;
                }
            }
            System.out.print(cnt);
        }
    }
}