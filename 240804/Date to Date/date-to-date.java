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
            System.out.print(d2-d1+1);
        }else{
            for(int i=m1; i<m2; i++){
                if(i==2){
                        cnt+=28;
                    }else if(i<8 && i%2!=0){
                        cnt+=31;
                    }else if(i<8 && i%2==0){
                        cnt+=30;
                    }else if(i>7 && i%2==0){
                        cnt+=31;
                    }else{
                        cnt+=30;
                    }
            }
            if(d1>d2){
               cnt-=d1-d2-1; 
            }else if(d1<d2){
                cnt+=d2-d1+1;
            }         
            System.out.print(cnt);     
            }
           
        }
    }