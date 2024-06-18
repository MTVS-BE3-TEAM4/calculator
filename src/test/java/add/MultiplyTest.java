package add;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplyTest {

    @Test
    @DisplayName("10과 12의 곱이 120인지 확인")
    public void testMultiply(){

        int a = 10;
        int b = 12;

        int result = new Multiply().multiply(a,b);

        Assertions.assertEquals(120,result);






    }

    @Test
    @DisplayName("-10과 12의 곱이 120인지 확인")
    public void testMultiply2(){

        int a = -10;
        int b = 12;

        int result = new Multiply().multiply(a,b);

        Assertions.assertEquals(-120,result);






    }

}
