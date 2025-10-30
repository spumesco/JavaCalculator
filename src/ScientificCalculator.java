public class ScientificCalculator extends AdvancedCalculator {
    public int mod() {
        int i = 0;
        int num3 = num1;
        while (true) {
            if (num3 >= num2) {
                num3 -= num2;
                i++;
            } else if (num3 < num2) {
                result = num3;
                break;
                }
            }
        return result;
        }
}