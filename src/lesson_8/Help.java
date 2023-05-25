package lesson_8;

public class Help {
    public void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("Oпepaтop if:\n");
                System.out.println("if{ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch{выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Oпepaтop for:\n");
                System.out.print("for{инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while {условие;");
                break;
            case '6':
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;

        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Bыбepитe пункт(q to quit): ");
    }

    public boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') {
            return false;
        } else {
            return true;
        }
    }
}
