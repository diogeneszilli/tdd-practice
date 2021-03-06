package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void numberIsDivisibleByThree() {
        Assert.assertEquals("Number divisible by 3", true, fizzBuzz.isDivisibleByThree(3));
    }

    @Test
    public void numberIsNotDivisibleByThree() {
        Assert.assertEquals("Number is not divisible by 3", false, fizzBuzz.isDivisibleByThree(2));
    }

    @Test
    public void numberIsDivisibleByFive() {
        Assert.assertEquals("Number divisible by 5", true, fizzBuzz.isDivisibleByFive(5));
    }

    @Test
    public void numberIsNotDivisibleByFive() {
        Assert.assertEquals("Number is not divisible by 5", false, fizzBuzz.isDivisibleByFive(3));
    }

    @Test
    public void numberIsDivisibleByThreeAndFive() {
        Assert.assertEquals("Number is divisible by 3 and 5", true, fizzBuzz.isDivisibleByThreeAndFive(15));
    }

    @Test
    public void numberIsNotDivisibleByThreeAndFive() {
        Assert.assertEquals("Number is not divisible by 3 and 5", false, fizzBuzz.isDivisibleByThreeAndFive(14));
    }

    @Test
    public void addNumber() {
        Assert.assertEquals("Added number 2", "2", fizzBuzz.checkNumber(2));
    }

    @Test
    public void addFizz() {
        Assert.assertEquals("Added Fizz", "Fizz", fizzBuzz.checkNumber(3));
    }

    @Test
    public void addBuzz() {
        Assert.assertEquals("Added Buzz", "Buzz", fizzBuzz.checkNumber(5));
    }

    @Test
    public void addFizzBuzz() {
        Assert.assertEquals("Added tdd.FizzBuzz", "tdd.FizzBuzz", fizzBuzz.checkNumber(15));
    }

    @Test
    public void checkFizzBuzzFromOneToFifteen() {
        int rounds = 15;
        String fizz = "Fizz";
        String buzz = "Buzz";
        List<String> expected = Arrays.asList("1", "2", fizz, "4", buzz, fizz, "7", "8", fizz, buzz, "11", fizz, "13", "14", fizz+buzz);
        List<String> result = fizzBuzz.runGame(rounds);
        System.out.println(result);
        assertEquals("Valid tdd.FizzBuzz game", true, expected.equals(result));
    }
}
