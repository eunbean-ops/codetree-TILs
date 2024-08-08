import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int[]cc= new int[100]; int cnt=0;
        while(true){
            if(n<2){
                cc[cnt]=n;
                break;
            }else{
                cc[cnt]=n%2;
                n=n/2;
                cnt++;
            }
        }
        for(int i=cnt; i>=0; i--){
            System.out.print(cc[i]);
        }
    }
}