import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int[][]rect= new int[4001][4001];
        for(int i=0; i<1; i++){
            int x1=sc.nextInt()+1000;
            int y1=sc.nextInt()+1000;
            int x2=sc.nextInt()+1000;
            int y2=sc.nextInt()+1000;
            for(int j=y1; j<y2; j++){
                for(int k=x1; k<x2; k++){
                    rect[j][k]++;
                }
            }
        }
        int check1= 0;//가로
        int check2=0;//세로
        for(int i=0; i<1; i++){
            int x1=sc.nextInt()+1000;
            int y1=sc.nextInt()+1000;
            int x2=sc.nextInt()+1000;
            int y2=sc.nextInt()+1000;
            check1=x2-x1; check2=y2-y1;
            for(int j=y1; j<y2; j++){
                for(int k=x1; k<x2; k++){
                    rect[j][k]+=3;
                }
            }
        }

        
        int maxwid= 0;
        int leg=0;      
        
        for(int i=0; i<rect.length; i++){
             int cnt=0;
             boolean tr= false;
            for(int j=0; j<rect.length; j++){
                if(rect[i][j]==1){
                    cnt++;
                    tr=true;
                }else if(rect[i][j]>3&&((rect[i+check2][j]==1) || (rect[i][j+check1]==1))){
                    cnt++;
                    tr=true;
                }
            }
            if(cnt>maxwid){
                maxwid=cnt;
            }
            if(tr){
                leg++;
            }
        }
        System.out.println(leg*maxwid);
        
    
    }
}