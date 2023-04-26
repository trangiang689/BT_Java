package BT_Java.BT_03;

public class Operator {
    static String name = "Auto test";
    int age = 20;
    double testScore = 8.5;
    String rating = "Good";

    public static void main(String[] args) {
        Operator operator = new Operator();
        String message = (operator.age < 18 || (operator.age >= 18 && operator.testScore < 7.0)) ? "Fail" : "Pass";
        String result = (operator.rating == "Very Good" || message == "Pass") ? "Du dieu kien" : "Chua du dieu kien";
        System.out.println(name + " " + result);
    }
}
