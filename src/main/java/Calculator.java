import java.util.NoSuchElementException;

public class Calculator {
     String string = null;

    /**
     * конструктор
     * в процессе инициализации проходит проверка на неподдерживаемые символы
     * @param string
     */
    public Calculator(String string) {

         char[] charsForValid = new char[] {'1','2','3','4','5','6','7','8','9','0','I','V','X','+','-','*','/'};

         String stringCh = string.replaceAll("\\s", "");

         int check = 0;
         for (char chrOfStr: stringCh.toCharArray())
         {
             for (char chr: charsForValid)
             {
                 if (chrOfStr == chr) {
                     check++;
                     break;
                 }
             }
         }

         if(check < stringCh.length()) {
             throw new NoSuchElementException("В введенной строке есть неподдерживаемые символы");
         }

         this.string = stringCh;
     }

     public String calculate() {

        ConverterNumbers convert = new ConverterNumbers();
        String result = null;
        String[] arryStr = new String[2];
        int numbFirst = 0;
        int numbSecond = 0;

        if (this.string.contains("+")) {
            arryStr = this.string.split("[+]");
            numbFirst = convert.convertToInt(arryStr[0]);
            numbSecond = convert.convertToInt(arryStr[1]);
            result = convert.convertToString(numbFirst + numbSecond);
        }

        if (this.string.contains("-")) {
            arryStr = this.string.split("-");
            numbFirst = convert.convertToInt(arryStr[0]);
            numbSecond = convert.convertToInt(arryStr[1]);
            result = convert.convertToString(numbFirst - numbSecond);
        }

        if (this.string.contains("*")) {
            arryStr = this.string.split("[*]");
            numbFirst = convert.convertToInt(arryStr[0]);
            numbSecond = convert.convertToInt(arryStr[1]);
            result = convert.convertToString(numbFirst * numbSecond);
        }

        if (this.string.contains("/")) {
            arryStr = this.string.split("/");
            numbFirst = convert.convertToInt(arryStr[0]);
            numbSecond = convert.convertToInt(arryStr[1]);
            result = convert.convertToString(numbFirst / numbSecond);
        }

        return result;

     }




}
