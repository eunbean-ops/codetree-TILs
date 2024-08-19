public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        star();
    }
    public static void star(){
        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}