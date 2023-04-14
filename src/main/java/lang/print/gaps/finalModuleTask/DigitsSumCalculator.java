package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number%10;
        number = number - sum;
        sum = sum + number%100;
        number = number - sum;
        sum = sum + number%1000;
        number = number - sum;
        sum = sum + number;
        System.out.println(sum);
    }
}
