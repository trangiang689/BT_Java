package BT_Java.BT_03;

public class Condition {
    int number = 100;

    public void checkNumber(int n) {
        if (n == number) {
            System.out.println("n == number");
            return;
        } else if (n > number) {
            System.out.println("n > number");
            return;
        }
        System.out.println("n < number");
    }

    public static void main(String[] args) {
        Condition condition = new Condition();
        int n = 90;
        condition.checkNumber(n);
    }
}
