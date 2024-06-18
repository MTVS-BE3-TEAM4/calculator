package add;

public class Divider {
    public int divide(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }

        return a / b;
    }
}
