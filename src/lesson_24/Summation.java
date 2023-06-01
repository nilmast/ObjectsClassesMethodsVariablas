package lesson_24;

public class Summation {
    int sum;

    Summation(int num) {
        for (int i = 0; i <= num; i++) {
            sum += 1;

        }
    }
    Summation(Summation ob){
        sum = ob.sum;
    }
}
