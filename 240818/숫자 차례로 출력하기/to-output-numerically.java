import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        up(N);
        System.out.println();
        down(N);
    }
    
    public static void up(int N){
        if(N==0)
        return;
        up(N-1);
        System.out.print(N+" ");
    }

    public static void down(int N){
        if(N==0)
        return;
        System.out.print(N+" ");
        down(N-1);
       
    }
}