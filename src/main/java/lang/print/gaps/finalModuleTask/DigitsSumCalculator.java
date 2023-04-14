package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int reminder = number%10;
        int sum = reminder;
        number = number - reminder;
        reminder = number%100;
        sum = sum + reminder;
        number = number - reminder;
        reminder = number%1000;
        sum = sum + reminder;
        number = number - reminder;
        sum = sum + number;
        System.out.println(sum);
    }
}
