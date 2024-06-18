package add;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class AdderTest{

    @Test
    @DisplayName("11과 12를 더한 결과가 23인지 확인")
    public void testAdd(){

        //테스트 코드에서는 스캐너가 안된다 중요하다

//        System.out.println("첫번째 숫자를 입력해주세요!");
//
//        Scanner sc = new Scanner(System.in);

        //given
        //int first = sc.nextInt();

//        System.out.println("두번째 숫자를 입력해주세요!");
//        Scanner sc2 = new Scanner(System.in);
//        int second = sc2.nextInt();

//        first = sc.nextInt();
//        second = sc2.nextInt();

        int first = 11;
        int second = 12;
       int result = new Adder().add(first, second);
       System.out.println("두 수의 합은 : " + result + " 입니다!");

        //when
        //int result = new Adder().add(first, second);

        //then(verify)
        //Assertions.assertEquals(3, result);

    }

//    @Test
//    @DisplayName("2과 3를 더한 결과가 5인지 확인")
//    public void testAdd2(){
//
//        //given
//        int first = 2;
//        int second = 3;
//
//        //when
//        int result = new Adder().add(first, second);
//
//        //then(verify)
//        Assertions.assertEquals(5, result);
//
//    }
}