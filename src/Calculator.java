public class Calculator {

    static String res (int one, int two, String operator){
        int res = 0;
        switch (operator) {
                case "+":
                    res = one + two;
                    return Integer.toString(res);
                case "-":
                    res = one - two;
                    return Integer.toString(res);
//                    break;
                case "*":
                    res = one * two;
                    return Integer.toString(res);
//                    break;
                case "/":
                    res = one / two;
                    return Integer.toString(res);
//                    break;
            }
        return Integer.toString(res);
    }
}
