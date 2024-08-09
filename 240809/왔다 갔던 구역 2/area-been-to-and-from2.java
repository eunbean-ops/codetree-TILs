import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1000;  // 초기 위치를 중앙으로 설정
        int[] num = new int[2001];  // 위치 기록을 위한 배열

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();

            int kk;
            if (b.equals("R")) {
                kk = k + a;
                for (int j = k; j <kk; j++) {  // k부터 k+a까지 증가
                    num[j]++;
                }
                k = kk;
            } else if (b.equals("L")) {
                kk = k - a;
                for (int j = k; j >kk; j--) {  // k부터 k-a까지 감소
                    num[j]++; 
                }
                k = kk;
            }
        }

        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 2) {  // 2번 이상 지나간 위치를 카운트
                cnt++;
            }
        }

        System.out.print(cnt);
        sc.close();  // Scanner 닫기
    }
}