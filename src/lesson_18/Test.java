package lesson_18;

public class Test {
    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void changeOb(Test ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
