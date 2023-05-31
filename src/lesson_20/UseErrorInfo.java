package lesson_20;

public class UseErrorInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Error e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);
    }
}
