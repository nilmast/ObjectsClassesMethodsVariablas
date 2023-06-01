package lesson_26;

public class Factorial {
    int factR(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factR(n - 1) * n;
        return result;
    }

    int factI(int n) {
        int result;
        result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;
    }
}
