import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {

    @Test
    public void whenTestAddition() {
        Calculator calculator = new Calculator("1  +  3");
        assertThat(calculator.calculate(), is( "4"));
    }

    @Test
    public void whenTestSubTraction() {
        Calculator calculator = new Calculator("1  -  3");
        assertThat(calculator.calculate(), is( "-2"));

    }

    @Test
    public void whenTestMultiplication() {
        Calculator calculator = new Calculator("1  *    3");
        assertThat(calculator.calculate(), is( "3"));
    }

    @Test
    public void whenTestDivision() {
        Calculator calculator = new Calculator("1  /    3");
        assertThat(calculator.calculate(), is( "0"));
    }

    @Test
    public void whenTestAdditionRome() {
        Calculator calculator = new Calculator("I  +  III");
        assertThat(calculator.calculate(), is( "IV"));
    }

    @Test
    public void whenTestSubTractionRome() {
        Calculator calculator = new Calculator("I  -  III");
        assertThat(calculator.calculate(), is( "-II"));

    }

    @Test
    public void whenTestMultiplicationRome() {
        Calculator calculator = new Calculator("X  *    X");
        assertThat(calculator.calculate(), is( "C"));
    }

    @Test
    public void whenTestDivisionRome() {
        Calculator calculator = new Calculator("III  /    II");
        assertThat(calculator.calculate(), is( "I"));
    }


}
