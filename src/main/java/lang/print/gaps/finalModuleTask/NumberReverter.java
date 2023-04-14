package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reminder = number%10;
        int reversed = reminder;
        number = number - reminder;
        reminder = number%100;
        reversed = reversed + 100*reminder;
        number = number - reminder;
        reminder = number/100;
        reversed = reversed + reminder;
        System.out.println(reversed);
    }
}
