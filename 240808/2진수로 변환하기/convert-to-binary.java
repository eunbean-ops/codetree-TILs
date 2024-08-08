import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String a="";
        String aa="";
        while(true){
            if(n<2){
                aa=n+"";
                a=aa+a;
                break;
            }else{
                aa=(n%2)+"";
                a=aa+a;
                n=n/2;
            }
        }
        System.out.print(a);
    }
}