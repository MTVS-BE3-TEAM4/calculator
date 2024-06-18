package add;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest {

    @Test
    @DisplayName("일반적인 두 수를 나눔")
    void divideTwoNumbers() {
        // given
        int a = 10;
        int b = 5;
        int expect = 2;
        Divider divider = new Divider();
        // when

        int actual = divider.divide(a, b);

        //then
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("0으로 나눌때 예외 쌈@뽕하게 터트림")
    void divideByZero() {
        // given
        int a = 10;
        int b = 0;

        Divider divider = new Divider();
        // when
        // then
        Assertions.assertThrows(IllegalArgumentException.class, () -> divider.divide(a, b) );
    }

}