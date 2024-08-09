import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]num= new int[100];
        for(int i=0; i<n; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            for(int j=a-1; j<=b-1; j++){
                num[j]++;
            }
        }
        int max=0;
        for(int k=0; k<num.length; k++){
            if(num[k]>max){
                max=num[k];
            }
        }
        System.out.print(max);
    }
}