package lesson_14;

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        System.out.println("Заполнение массива без вывода отчета.");

        for (int i = 0; i < (fs.length *2); i++) {
            fs.put(i, i * 10);
        }
        System.out.println("Вывод элементов массива без вывода отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
        }
        System.out.println("");
        System.out.println("Заполнение массива с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i*10)){
                System.out.println("Индeкc " + i +" вне допустимого диапазона");

            }

        }
        System.out.println("Вывод элементов массива с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1){
                System.out.println(x + " ");
            }else {
                System.out.println("Индeкc " + i + " вне допустимого диапазона");
            }

        }


    }
}
