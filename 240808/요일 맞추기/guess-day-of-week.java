import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int m1= sc.nextInt();
        int d1= sc.nextInt();
        int m2= sc.nextInt();   int cnt=0;
        int d2= sc.nextInt();
        int[]month={31,28,31,30,31,30,31,31,30,31,30,31};
        String[]left={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        //달
        if(m1==m2){
           cnt+= d2-d1;
        }else{
            cnt+=month[m1-1]-d1;
            for(int i=m1; i<m2-1; i++){
            cnt=cnt+month[i];
        }
            cnt+=d2;
        }
        
        System.out.print(left[(cnt+1)%7]);
    }
}