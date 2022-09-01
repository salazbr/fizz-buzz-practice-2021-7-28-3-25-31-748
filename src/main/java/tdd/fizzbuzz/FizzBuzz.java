package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        String FIZZ = "Fizz";
        String normalNumber = String.valueOf(number);


        if(number % 3 == 0){
            return FIZZ;
        }

        return normalNumber;
    }
}
