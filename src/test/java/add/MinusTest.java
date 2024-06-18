package add;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minusTest {

    @Test
    @DisplayName("10과 20을 뺀 결과가 -10인지 확인")
    public void testMinus() {
        //given
        int first = 10;
        int second = 20;


        //when
        int result = new Minus().minus(first, second);

        //then(verify)
        Assertions.assertEquals(-10, result);
    }

    @Test
    @DisplayName("20과 30을 뺀 결과가 -10인지 확인")
    public void testMinus2() {
        //given
        int first = 20;
        int second = 30;


        //when
        int result = new Minus().minus(first, second);

        //then(verify)
        Assertions.assertEquals(-10, result);
    }
}