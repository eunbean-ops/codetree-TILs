import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int max=0; int cnt=1;
        int[]num= new int[n];

        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
            if((i!=0)&&(i!=n-1)){
                if(num[i]==num[i-1]){
                    cnt++;
                    if(cnt>max)
                    max=cnt;
                }else{
                    cnt=1;
                }
            }
        }
        System.out.print(max);

    }
}