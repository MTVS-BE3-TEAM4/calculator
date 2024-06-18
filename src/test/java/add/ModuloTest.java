package add;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModuloTest {
    @Test
    @DisplayName("0으로 나눴을 경우")
    public void testModulo() {
        //given
        int first = 10;
        int second = 0;

        //then (verify)
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Modulo().modulo(first, second) );
    }

    @Test
    @DisplayName("양수와 양수를 나눴을 경우")
    public void testModulo2() {
        int first = 10;
        int second = 3;

        int result = new Modulo().modulo(first, second);

        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("음수와 양수를 나눴을 경우")
    public void testModulo3() {
        int first = -10;
        int second = 3;

        int result = new Modulo().modulo(first, second);

        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("음수와 음수를 나눴을 경우")
    public void testModulo4() {
        int first = -100;
        int second = -3;

        int result = new Modulo().modulo(first, second);

        Assertions.assertEquals(-1, result);
    }
}
