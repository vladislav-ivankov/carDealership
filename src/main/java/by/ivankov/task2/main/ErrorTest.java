package by.ivankov.task2.main;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            int i = 0 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
