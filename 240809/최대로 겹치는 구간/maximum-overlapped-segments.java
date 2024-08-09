import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        int []num= new int[255];
        for(int i=0; i<k; i++){
            int a= sc.nextInt(); int aa= a+100;
            int b= sc.nextInt(); int bb= b+100-1;

            for(int j=aa; j<=bb; j++){
                num[j]++;
            }
        }
        int max=0;
        for(int i=0; i<num.length-1; i++){   
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.print(max);
    }
}