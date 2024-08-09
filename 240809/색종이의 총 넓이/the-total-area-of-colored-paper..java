import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][]paper= new int[201][201];
        for(int i=0; i<n; i++){
            int x= sc. nextInt();
            int y= sc.nextInt();
            for(int j=x; j<x+8; j++){
                for(int k=y; k<y+8; k++){
                    paper[j][k]++;
                }
            }
        }
        int cnt=0;
        for(int j=0; j<201; j++){
                for(int k=0; k<201; k++){
                    if(paper[j][k]==1){
                        cnt++;
                    }else if(paper[j][k]>=2){
                        cnt++;
                    }
                }
            }
            System.out.print(cnt);
    }
}