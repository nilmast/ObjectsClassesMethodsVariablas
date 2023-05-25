package lesson_9;

public class Start {
    public static void main(String[] args) {
        Account creditAccount = new Account(10001);
        Account depositAccount = new Account(88001);
        System.out.println("ID кредитного счета: "+creditAccount.ID);
        System.out.println("ID депозитного счета: " + depositAccount.ID);

    }
}
