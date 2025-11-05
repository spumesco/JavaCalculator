public class FactorialCalculator extends Calculator {
    @Override
    public void displayResult(String operator) {
        System.out.println(num1 + operator + " = " + result);
    }

    public int factorial() {
        int num3 = num1;
        int num4 = num3;
       while (true) {
            if (num3 > 1) {
                num3 -= 1;
                num4 = num4 * num3;
            } else if (num3 <= 1) {
                result = num4;
                break;
            }

        }

        return result;
    }
}