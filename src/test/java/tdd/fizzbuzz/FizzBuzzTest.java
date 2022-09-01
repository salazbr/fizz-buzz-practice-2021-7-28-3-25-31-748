package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        // when
        String actual = fizzBuzz.countOff(1);

        // then
        assertEquals(expected,actual);
    }
    @Test
    void should_return_3_when_count_off_given_Fizz(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        // when
        String actual = fizzBuzz.countOff(9);


        // then
        assertEquals(expected,actual);
    }

    @Test
    void should_return_5_when_count_off_given_Buzz(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        // when
        String actual = fizzBuzz.countOff(10);


        // then
        assertEquals(expected,actual);
    }
}
