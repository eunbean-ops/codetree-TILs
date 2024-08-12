import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][]rect= new int[201][201];
        for(int i=1; i<=n; i++){
            int x1= sc.nextInt()+100;
            int y1= sc.nextInt()+100;
            int x2= sc.nextInt()+100;
            int y2= sc.nextInt()+100;

            if(i%2!=0){
                for(int j=y1; j<y2; j++){
                    for(int k=x1; k<x2; k++){
                        rect[j][k]=1;//빨강
                    }
                }
            }else{
                for(int j=y1; j<y2; j++){
                    for(int k=x1; k<x2; k++){
                        rect[j][k]=2;//파랑
                    }
                }
            }
        }
        int sum=0;
        for(int i=0; i<rect.length; i++){
            for(int j=0; j<rect.length; j++){
                if(rect[i][j]==2){
                    sum++;
                }
            }
        }
        System.out.print(sum);
    }
}