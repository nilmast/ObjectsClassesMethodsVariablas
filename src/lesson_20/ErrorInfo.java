package lesson_20;

public class ErrorInfo {
        String[] msgs = {"Ошибка вывода", "Ошибка ввода", "Отсутствует место на диске", "Выход индекса за границы диапазона"};
        int[] howBad = {3, 3, 2, 4};
        Error getErrorInfo(int i){
            if (i >= 0 & i < msgs.length){
                return new Error(msgs[i], howBad[i]);
            }else {
                return new Error("Несуществующй код ошибки", 0);
            }

    }
}
