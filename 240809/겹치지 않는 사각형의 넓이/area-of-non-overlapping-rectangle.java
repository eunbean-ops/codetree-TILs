import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int[][] num= new int[2001][2001];
        for(int i=0; i<2; i++){
            int x1= sc.nextInt()+1000;
            int y1= sc.nextInt()+1000;
            int x2= sc.nextInt()+1000;
            int y2= sc.nextInt()+1000;
            for(int k=y1; k<y2; k++){
                for(int j=x1; j<x2; j++){
                    num[k][j]++;
                }
            }
        }
            int x1= sc.nextInt()+1000;
            int y1= sc.nextInt()+1000;
            int x2= sc.nextInt()+1000;
            int y2= sc.nextInt()+1000;
             for(int k=y1; k<y2; k++){
                for(int j=x1; j<x2; j++){
                    num[k][j]=3;
                }
            }
        int cnt=0;
        for(int i=0; i<2001; i++){
            for(int j=0; j<2001; j++){
                if(num[i][j]==1){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);

    }
}