package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        String FIZZ = "Fizz";

        if(number % 3 == 0){
            return FIZZ;
        }
        else {
            return String.valueOf(number);
        }
    }
}
