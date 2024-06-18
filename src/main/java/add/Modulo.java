package add;

public class Modulo {
    public int modulo(int first, int second) {
        if(second == 0) {
            throw new IllegalArgumentException("0으로는 나눌수가 없습니다.");
        }

        return first % second;
    }
}
