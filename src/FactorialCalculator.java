public class FactorialCalculator extends Calculator {
    int result1 =0;
    int result2 =0;

    @Override
    public void displayResult(String operator) {
        System.out.println(num1 + operator + " = " + result1);
        System.out.println(num2 + operator + " = " + result2);
    }

    public int factorial() {
        int num3 = num1;
        int num4 = num3;
        int num5 = num2;
        int num6 = num5;

        while (true) {
            if (num3 > 1) {
                num3 -= 1;
                num4 = num4 * num3;
            } else if (num3 <= 1) {
                result1 = num4;
                break;
            }
        }

        while (true) {
            if (num5 > 1) {
                num5 -= 1;
                num6 = num6 * num5;
            } else if (num5 <= 1) {
                result2 = num6;
                break;
            }
        }

        return result1 + result2;
    }
}