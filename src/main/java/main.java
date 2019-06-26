import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

    public static void main(String[] args) throws IOException {
        String lS = System.lineSeparator();
        System.out.println("Простой калькулятор, выполняющий операции сложения(+), вычитания(-), умножения(*), деления(/) " + lS
                + "над двумя целыми римскими или арабскими цифрами в пределах от 1 до 10." + lS
                + "Необходимо вводить данные только в одной строке, используя символы + - * /" + lS
                + "Число пробелов не имеет значения." + lS
                + "Пример ввода данных: X + X  или 10 + 10" + lS);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String operation = reader.readLine();
        Calculator calculator = new Calculator(operation);
        System.out.println(calculator.calculate());
    }
}
