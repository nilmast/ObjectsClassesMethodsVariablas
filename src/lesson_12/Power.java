package lesson_12;

public class Power {
    double base;
    int exp;
    double val;

    Power(double base, int exp){
        this.base = base;
        this.exp = exp;
        val = 1;
        if (exp == 0){
            return;
        }
        for (;exp > 0; exp --){
            val *= base;
        }
    }
    double getPower(){
        return  val;
    }

}
