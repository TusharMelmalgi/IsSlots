import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerComparatorTest {
    /* when number1 less than number2 return -1
    when number1 equals number2 return 0
    when number1 greater than number2 return 1
     */
    @Test
    public void compareTest_number1LessThanNumber2(){
        int number1 = 5;
        int number2 = 10;
        IntegerComparator compares = new IntegerComparator();
        int resultOfCompare = compares.checkNum(number1,number2);
        Assertions.assertEquals(-1,resultOfCompare);
    }
    @Test
    public void compareTest_number1EqualsNumber2(){
        int number1 = 5;
        int number2 = 5;
        IntegerComparator compares = new IntegerComparator();
        int resultOfCompare = compares.checkNum(number1,number2);
        Assertions.assertEquals(0,resultOfCompare);
    }
    @Test
    public void compareTest_number1GreaterThanNumber2(){
        int number1 = 15;
        int number2 = 5;
        IntegerComparator compares = new IntegerComparator();
        int resultOfCompare = compares.checkNum(number1,number2);
        Assertions.assertEquals(1,resultOfCompare);
    }
}
