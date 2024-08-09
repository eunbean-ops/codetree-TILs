import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        int []num= new int[200];
        for(int i=0; i<k; i++){
            int a= sc.nextInt(); int aa= a-1;
            int b= sc.nextInt(); int bb= b-1;

            for(int j=aa; j<=bb; j++){
                num[j]++;
            }
        }
        int max=0;
        for(int i=1; i<num.length; i++){
            if((num[i]==num[i-1] || num[i]==num[i+1])&&num[i]>max){
                max=num[i];
            }
        }
        System.out.print(max);
    }
}