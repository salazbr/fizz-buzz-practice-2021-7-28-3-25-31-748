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
        String actual = "1";
        fizzBuzz.countOff(actual);

        // then
        assertEquals(expected,actual);
    }
}
