import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int k= sc.nextInt();
        int []pp = new int[m];
        int []list= new int[n];
        for(int i=0; i<m; i++){
            pp[i]= sc.nextInt();
        }
        int result=0;
        for(int i=0; i<m; i++){
            list[pp[i]-1]++;
            if(list[pp[i]-1]>= k){
                result=pp[i];
                break;
            }else{
                result=-1;
            }
        }
        System.out.print(result);
    }
}