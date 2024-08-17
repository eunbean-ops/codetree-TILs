import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int K= sc.nextInt();
        int P= sc.nextInt();
        int T= sc.nextInt();
        
        int []person= new int[N];
        int []t = new int[T];
        int []x= new int[T];
        int []y= new int[T];
        for(int i=0; i<T; i++){
            t[i]= sc.nextInt();
            x[i]= sc.nextInt();
            y[i]= sc.nextInt();
        }
        int tmp=0; int tmp1=0; int tmp2=0;
        for(int i=0; i<T; i++){
            for(int j=i+1; j<T; j++){
                if(t[i]>t[j]){
                    tmp=t[i];      
                    t[i]=t[j];     
                    t[j]=tmp;     
                    
                    tmp2= y[i];
                    y[i]=y[j];
                    y[j]=tmp2;

                    tmp1= x[i];
                    x[i]=x[j];
                    x[j]=tmp1;
                }
            }
        }
        person[P-1]=1;
        
        for(int i=0; i<K; i++){
            if(person[x[i]-1]==1 || person[y[i]-1]==1){
               person[x[i]-1]=1;
               person[y[i]-1]=1;          
            }
        }
        for(int i=0; i<person.length; i++){
            System.out.print(person[i]);
        }
    }
}