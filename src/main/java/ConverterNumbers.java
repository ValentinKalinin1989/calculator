import java.util.Hashtable;
import java.util.NoSuchElementException;

/**
 *Класс для перобразования арабских и римских цифр
 * от 1 до 10 из String в Int и обратно.
 * Если при конвертировании String были арабские цифры,
 * то из Int в String будут в формате арабские цифры;
 * если римские - то вернутся формате римских цифр.
 */
public class ConverterNumbers {

    private Hashtable<Integer, String> numbers = new Hashtable<>(10);
    private int markerRome = 0;
    private int markerArab = 0;

    /**
     * конструктор
     * инициализирует хэштаблицу для проверки чисел от 1 до 10
     */
    public ConverterNumbers() {
        this.numbers.put(1, "I");
        this.numbers.put(2, "II");
        this.numbers.put(3, "III");
        this.numbers.put(4, "IV");
        this.numbers.put(5, "V");
        this.numbers.put(6, "VI");
        this.numbers.put(7, "VII");
        this.numbers.put(8, "VIII");
        this.numbers.put(9, "IX");
        this.numbers.put(10,"X");
    }


    /**
     * Преобразование числа из String в int
     * @param number  значение для преобразования
     * @return число в типе int
     */
    public int convertToInt(String number) {
        int numInt = -1;
        Integer index = null;
        for ( int i = 1; i < 11; i++) {
            index = i;
            if (this.numbers.get(i).equals(number))
            {
                numInt = i;
                this.markerRome++;
            }
            if (index.toString().equals(number)) {
                numInt = i;
                this.markerArab++;
            }
        }
        if (numInt == -1) {
            throw new NoSuchElementException("Данная цифра отсутствует в пределах от 1 до 10");
        }

        return numInt;
    }

    /**
     * Преобразование числа из int в String
     * @param number значение для преобразования
     * @return число в типе String
     */
    public String convertToString(int number) {

        String numbStr = "";
        if (number == 0){
            numbStr = "0";
        } else if(this.markerRome == 2) {
            if (number < 0) {
                numbStr = "-";
                number *= -1;
            }
            numbStr += new RomanNumbers().getRomanNumber(number);
        } else if (this.markerArab == 2) {
            numbStr = ((Integer)number).toString();
        }
        return numbStr;
    }

    /**
     * проверяет являются ли числа одновременно арабскими или римскими
     * @return true - если числа из одной ситемы счисления
     */
    public boolean checkTypeNumber() {
        boolean result = false;
        if (markerRome == 2) {
            result = true;
        }
        if (markerArab == 2) {
            result = true;
        }
        return result;
    }
}
