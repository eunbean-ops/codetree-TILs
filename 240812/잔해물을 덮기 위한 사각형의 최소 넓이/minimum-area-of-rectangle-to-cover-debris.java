import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int[][]rect= new int[2001][2001];
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

        for(int i=0; i<1; i++){
            int x1=sc.nextInt()+1000;
            int y1=sc.nextInt()+1000;
            int x2=sc.nextInt()+1000;
            int y2=sc.nextInt()+1000;
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