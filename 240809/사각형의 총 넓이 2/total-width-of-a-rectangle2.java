import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int cnt=0;
        int[][]rect= new int[201][201];
        for(int i=0; i<n; i++){
            int x1= sc.nextInt()+100;
            int y1= sc.nextInt()+100;
            int x2= sc.nextInt()+100;
            int y2= sc.nextInt()+100;
            
            for(int j=y1; j<y2; j++){
                for(int k=x1; k<x2; k++){
                    rect[j][k]++;
                }
            }
        }
        for(int j=0; j<201; j++){
                for(int k=0; k<201; k++){
                    if( rect[j][k]==1){
                        cnt++;
                    }else if(rect[j][k]>1){
                        cnt++;
                    }
                }
            }
            System.out.print(cnt);
    }
}