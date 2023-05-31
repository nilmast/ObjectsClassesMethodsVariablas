package lesson_18;

public class CallByRef {
    public static void main(String[] args) {
        Test ob = new Test(2,5);
        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + "  " + ob.b);
        ob.changeOb(ob);
        System.out.println("ob.a и ob.b после вызовом: " + ob.a + " " + ob.b);


    }
}
