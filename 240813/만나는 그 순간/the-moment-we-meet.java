import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int cnt=0;
        int []a= new int[n]; String []A = new String[n];    
        int []b= new int[m]; String []B= new String[m];
        for(int i=0; i<n; i++){
            A[i]= sc.next();
            a[i]= sc.nextInt();
            cnt+=a[i];
        }
        for(int i=0; i<m; i++){
            B[i]= sc.next();
            b[i]= sc.nextInt();
        }
        int[]aa= new int[cnt];
        int[]bb= new int[cnt];
        int num1=0;
        for(int i=0; i<a.length; i++){
            if(A[i].equals("R")){
                for(int j=num1; j<a[i]; j++){
                    num1++;
                    aa[j]=num1;
                }
            }else{
                for(int j=num1; j<a[i]; j++){
                    num1--;
                    aa[j]=num1;
                }
            }
        }
         for(int i=0; i<b.length; i++){
            if(B[i].equals("R")){
                for(int j=num1; j<b[i]; j++){
                    num1++;
                    bb[j]=num1;
                }
            }else{
                for(int j=num1; j<b[i]; j++){
                    num1--;
                    bb[j]=num1;
                }
            }
        }
        int result=0;
        for(int k=0; k<cnt; k++){
            if(aa[k]==bb[k]){
            result=k;
            break;
            }else{
               result=-1;
            }
        }
        System.out.print(result);
    }
}