package lesson_11;

public class FDemo {
    int x;
    FDemo(int x){
        this.x = x;
    }
    // Планируем объект к удалению.
    @Override
    protected void finalize(){
        System.out.println("Финализация" + x);
    }
    //Объект моментального выхода из области
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}
