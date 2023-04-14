package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int reminder = number%10;
        int sum = reminder;
        number = number - reminder;
        reminder = number%100;
        sum = sum + reminder/10;
        number = number - reminder;
        reminder = number%1000;
        sum = sum + reminder/100;
        number = number - reminder/1000;
        sum = sum + number;
        System.out.println(sum);
    }
}
