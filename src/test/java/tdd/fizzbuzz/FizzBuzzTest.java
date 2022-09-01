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
    void should_return_Fizz_when_count_off_given_multiple_of_3(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        // when
        String actual = fizzBuzz.countOff(9);
        
        // then
        assertEquals(expected,actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_multiple_of_5(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        // when
        String actual = fizzBuzz.countOff(10);

        // then
        assertEquals(expected,actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_multiple_of_7(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Whizz";

        // when
        String actual = fizzBuzz.countOff(14);

        // then
        assertEquals(expected,actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_multiple_of_15(){
        //given

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";

        // when
        String actual = fizzBuzz.countOff(15);

        // then
        assertEquals(expected,actual);
    }
}
