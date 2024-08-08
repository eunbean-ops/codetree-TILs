import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String n= sc.next(); String []num1= n.split("");
        int []num2= new int[num1.length];
        for(int i=0; i<num2.length; i++){
            num2[i]=Integer.parseInt(num1[i]);
            
        }
        int nn= num2.length-1;
        int sum=0;
        for(int i=0; i<num2.length; i++){
            int mid=1;
            for(int j=nn; j>0; j--){
                
                mid=mid*2;
            }
            nn--;
            sum+=mid*num2[i];
        }
        System.out.print(sum);

        
       
    }
}