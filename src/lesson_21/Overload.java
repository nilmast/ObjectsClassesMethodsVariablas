package lesson_21;

public class Overload {
    int a, b;
    void sum(){
        System.out.println("Без параметров");
    }
    void sum(int a){
        System.out.println("Один параметр: " + a);
    }
    int sum(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Два параметра: " + a + " " + b);
        return a + b;
    }

    double sum(double a, double b){

        System.out.println("Два параметра: " + a + " " + b);
    return a + b;
    }

}
