package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";
        final String WHIZZ = "Whizz";

        String normalNumber = String.valueOf(number);

        if(number % 3 == 0){
            return FIZZ;
        }

        if(number % 5 == 0){
            return BUZZ;
        }

        if(number % 7 == 0){
            return WHIZZ;
        }

        return normalNumber;
    }
}
