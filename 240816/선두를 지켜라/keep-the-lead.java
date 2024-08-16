import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt(); int cnt=0;//총 시간
        int[]ta=  new int[n];
        int[]va=  new int[n];
        int[]tb=  new int[m];
        int[]vb=  new int[m];

        for(int i=0; i<n; i++){
        va[i]= sc.nextInt();
        ta[i]= sc.nextInt();
        cnt+=ta[i];
        }
        for(int i=0; i<m; i++){
        vb[i]= sc.nextInt();
        tb[i]= sc.nextInt();
        }

        int[]a = new int[cnt];
        int[]b=  new int[cnt];
        int numa= 0; int check=0;
        for(int i=0; i<ta[0]; i++){
            numa+=va[0];
            a[i]=numa;
            check++;
        }
        for(int i=1; i<n; i++){
            for(int j=check; j<check+ta[i]; j++){
                numa+=va[i];
                a[j]=numa;
            }
            check+=ta[i];
        }
        
        int numb= 0; int checkk=0;
        for(int i=0; i<tb[0]; i++){
            numb+=vb[0];
            b[i]=numb;
            checkk++;
        }
        for(int i=1; i<m; i++){
            for(int j=checkk; j<checkk+tb[i]; j++){
                numb+=vb[i];
                b[j]=numb;
            }
            checkk+=tb[i];
        }
        
       int[]result= new int[cnt];
       int cntt=0;
       for(int i=0; i<cnt; i++){
            result[i]=a[i]-b[i];
       }
       for(int i=1; i<cnt; i++){
        if(result[i-1]<0 && result[i]>=0){
            cntt++;
        }else if(result[i-1]>=0 && result[i]<0){
            cntt++;
        }
       }
       System.out.print(cntt);

    }
}