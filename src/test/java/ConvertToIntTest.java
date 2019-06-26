import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConvertToIntTest {

    @Test
    public void whenTestRomeAndArabNumberToInt() {
        ConverterNumbers convert = new ConverterNumbers();
        assertThat(convert.convertToInt("1"), is(1));
        assertThat(convert.convertToInt("II"), is(2));
        assertThat(convert.convertToInt("III"), is(3));
        assertThat(convert.convertToInt("IV"), is(4));
        assertThat(convert.convertToInt("V"), is(5));
        assertThat(convert.convertToInt("VI"), is(6));
        assertThat(convert.convertToInt("VII"), is(7));
        assertThat(convert.convertToInt("VIII"), is(8));
        assertThat(convert.convertToInt("IX"), is(9));
        assertThat(convert.convertToInt("X"), is(10));

        assertThat(convert.convertToInt("1"), is(1));
        assertThat(convert.convertToInt("2"), is(2));
        assertThat(convert.convertToInt("3"), is(3));
        assertThat(convert.convertToInt("4"), is(4));
        assertThat(convert.convertToInt("5"), is(5));
        assertThat(convert.convertToInt("6"), is(6));
        assertThat(convert.convertToInt("7"), is(7));
        assertThat(convert.convertToInt("8"), is(8));
        assertThat(convert.convertToInt("9"), is(9));
        assertThat(convert.convertToInt("10"), is(10));

    }


    @Test
    public void whenTestCheckForRome() {
        ConverterNumbers convert = new ConverterNumbers();
        int numberfirst = convert.convertToInt("I");
        int numbersecond = convert.convertToInt("II");
        assertThat(convert.checkTypeNumber(), is( true));
    }

    @Test
    public void whenTestCheckForArab() {
        ConverterNumbers convert = new ConverterNumbers();
        int numberfirst = convert.convertToInt("1");
        int numbersecond = convert.convertToInt("2");
        assertThat(convert.checkTypeNumber(), is( true));
    }

    @Test
    public void whenTestConvertToStringArab() {
        ConverterNumbers convert = new ConverterNumbers();
        int numberfirst = convert.convertToInt("1");
        int numbersecond = convert.convertToInt("2");
        assertThat(convert.convertToString(1), is( "1"));
        assertThat(convert.convertToString(2), is( "2"));
    }

    @Test
    public void whenTestConvertToStringRome() {
        ConverterNumbers convert = new ConverterNumbers();
        int numberfirst = convert.convertToInt("I");
        int numbersecond = convert.convertToInt("II");
        assertThat(convert.convertToString(0), is( "0"));
        assertThat(convert.convertToString(2), is( "II"));
    }


}
