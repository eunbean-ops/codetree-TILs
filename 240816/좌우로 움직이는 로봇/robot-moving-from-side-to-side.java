import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[]ta= new int[n];
        String[]da= new String[n];
        int[]tb= new int[m];
        String[]db= new String[m];
        int cnta=0; int cntb=0;
        int cnt=0;
        
        for(int i=0; i<n; i++){
            ta[i]= sc.nextInt();
            da[i]= sc.next();
            cnta+=ta[i];
        }
        for(int i=0; i<m; i++){
            tb[i]= sc.nextInt();
            db[i]= sc.next();
            cntb+=tb[i];
        }
        cnt=Math.max(cnta,cntb);
        int[]a= new int[cnt];
        int[]b= new int[cnt];
        int numa=0; int check=0;
        for(int i=0; i<n; i++){
            for(int j=check; j<check+ta[i]; j++){
                if(da[i].equals("R")){
                    numa++;
                    a[j]=numa;
                }else{
                    numa--;
                    a[j]=numa;
                }
            }
            check+=ta[i];
        }
        for(int i=check; i<cnt; i++){
            a[i]=a[i-1];
        }
       
    int numb=0; int checkk=0;
        for(int i=0; i<m; i++){
            for(int j=checkk; j<checkk+tb[i]; j++){
                if(db[i].equals("R")){
                    numb++;
                    b[j]=numb;
                }else{
                    numb--;
                    b[j]=numb;
                }
            }
            checkk+=tb[i];
        }
        for(int i=checkk; i<cnt; i++){
            b[i]=b[i-1];
        }
        int ans=0;
        for(int i=1; i<cnt; i++){
            if((a[i-1]!=b[i-1])&& a[i]==b[i])
            ans++;
        }
        System.out.print(ans);
}
}