package Work6.exception;

public class WrongInputException extends Throwable {
    @Override
    public String toString() {
        return "Ошибка диапазона введённых данных";
    }
}
