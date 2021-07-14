public class ConvertArabToRoma {

    public static String arabToRoma(int num){

        String result = "";
        if (num <= 0) {
            result = "Результат не возможно записать римскими цифрами";
        }
        else if (num < 40) {
            result = "";
            for (int i = 0; i < num / 10; i++) {
                result += "X";
            }
            result += Calc.numRom[(num % 10) - 1];
        }
        else if (num < 50){
            result = "XL" + Calc.numRom[(num % 10) - 1];
        }
        else if (num == 50){
            result = "Результат: L";
        }
        else if (num < 90){
            result = "L";
            for (int i = 0; i < (num -50) / 10; i++) {
                result += "X";
            }
            result += Calc.numRom[(num % 10) - 1];
        }
        else if (num < 100){
            result = "XC" + Calc.numRom[(num % 10) - 1];
        }
        else result = "C";
        return result;
    }
}
